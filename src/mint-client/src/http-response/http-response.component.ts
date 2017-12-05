import { Component, OnInit, Input, ComponentFactoryResolver, Directive, ViewContainerRef, ViewChild } from '@angular/core';
import { BodyViewerComponent, RequestExpander, RequestExpansion } from '../requestExpansions';
import { RequestStatus, RequestView, ResponseInfo } from '../requestViews';
import { ResponseBodyBasicComponent } from '../response-body-basic/response-body-basic.component';
import { isUndefined } from 'util';

@Directive({
    selector: '[body-viewer-host]'
})
export class BodyViewerHostDirective implements OnInit {
    @Input() bodyViewer: RequestExpander;
    @Input() requestView: RequestView;

    constructor(private componentFactoryResolver: ComponentFactoryResolver,
                public viewContainerRef: ViewContainerRef) {
    }

    ngOnInit() {
        const componentFactory =
            this.componentFactoryResolver.resolveComponentFactory(this.bodyViewer.component);

        const componentRef = this.viewContainerRef.createComponent(componentFactory);
        (<BodyViewerComponent> componentRef.instance).requestView = this.requestView;
    }
}

@Component({
    selector: 'mint-http-response',
    templateUrl: './http-response.component.html',
})
export class HttpResponseComponent implements OnInit {
    RequestStatus: any = RequestStatus;

    @Input() requestView: RequestView;
    @Input() requestExpansions: RequestExpansion[];

    @ViewChild(BodyViewerHostDirective)
    bodyViewerHost: BodyViewerHostDirective;

    resBodyVeiwers: Map<string, RequestExpander>[];
    matchedResBodyViewers: RequestExpander[];

    basicResBodyViewer: RequestExpander;
    selectedBodyViewer: RequestExpander;

    constructor(private componentFactoryResolver: ComponentFactoryResolver) {
    }

    ngOnInit() {
        this.basicResBodyViewer = new RequestExpander('Basic', ResponseBodyBasicComponent);

        this.resBodyVeiwers = this.requestExpansions.map(requestExpansion => requestExpansion.resBodyVeiwers);
    }

    /**
     * http response 정보를 입력받아서 화면에 그려준다.
     * http request component가 이 메서드를 호출한다.
     * @param responseInfo
     */
    handleResponse(responseInfo: ResponseInfo) {
        console.log('handleResponse');

        this.requestView.response = responseInfo;
        this.requestView.requestStatus = RequestStatus.SendSuccess;

        responseInfo.headers
            .filter(h => h.name.toLocaleLowerCase() === 'content-type')
            .forEach(h => {
                console.log(h.value);
                if (h.value.startsWith('application/json')) {
                    this.requestView.resDisplayMode = 'json';
                    this.requestView.resContentType = 'application/json';
                } else if (h.value.startsWith('application/xml')) {
                    this.requestView.resDisplayMode = 'xml';
                    this.requestView.resContentType = 'application/xml';
                } else if (h.value.startsWith('text/xml')) {
                    this.requestView.resDisplayMode = 'xml';
                    this.requestView.resContentType = 'text/xml';
                } else if (h.value.startsWith('text/html')) {
                    this.requestView.resDisplayMode = 'html';
                    this.requestView.resContentType = 'text/html';
                } else if (h.value.startsWith('text/css')) {
                  this.requestView.resDisplayMode = 'css';
                  this.requestView.resContentType = 'text/css';
                } else if (h.value.startsWith('text/javascript')) {
                  this.requestView.resDisplayMode = 'javascript';
                  this.requestView.resContentType = 'text/javascript';
                } else {
                  this.requestView.resDisplayMode = 'text';
                  this.requestView.resContentType = 'text/plain';
                }
            });

        const contentType: string = this.requestView.resContentType;
        this.matchedResBodyViewers = this.resBodyVeiwers
            .filter(viewer => !isUndefined(viewer.get(contentType)))
            .map(viewer => <RequestExpander> viewer.get(contentType));


        // if (this.matchedResBodyViewers == null) {
        //   this.matchedResBodyViewers = new Array();
        // }

        this.matchedResBodyViewers.splice(0, 0, this.basicResBodyViewer);
        this.selectedBodyViewer = this.matchedResBodyViewers[0];
    }

    /**
     * http request가 실패했을 경우에 대한 처리
     * cors 문제
     * 응답을 받지 못함
     */
    handleError(err) {
      console.log(err);
        console.log('handleError!');
        this.requestView.requestStatus = RequestStatus.SendFail;
    }
}
