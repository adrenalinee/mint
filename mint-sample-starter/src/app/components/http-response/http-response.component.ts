import { Component, OnInit, Input, ComponentFactoryResolver, Directive, ViewContainerRef, ViewChild } from '@angular/core';

import { Dictionary } from 'app/Dictionary';
import { RequestExpansion, RequestExpander, BodyViewerComponent } from 'app/requestExpansion';
import { RequestView, ResponseInfo, RequestStatus } from 'app/requestInfo';
import { ResponseBodyBasicComponent } from 'app/components/response-body-basic/response-body-basic.component';

@Directive({
  selector: '[body-viewer-host]'
})
export class BodyViewerHostDirective {
  @Input() bodyViewer: RequestExpander;
  @Input() requestView: RequestView;

  constructor(private componentFactoryResolver: ComponentFactoryResolver, public viewContainerRef: ViewContainerRef) { }

  ngOnInit() {
    let componentFactory = 
      this.componentFactoryResolver.resolveComponentFactory(this.bodyViewer.component);

    let componentRef = this.viewContainerRef.createComponent(componentFactory);
    (<BodyViewerComponent> componentRef.instance).requestView = this.requestView;
  }
}

@Component({
  selector: 'app-http-response',
  templateUrl: './http-response.component.html',
  styleUrls: ['./http-response.component.css']
})
export class HttpResponseComponent implements OnInit {
  RequestStatus: any = RequestStatus;

  @Input() requestView: RequestView;
  @Input() requestExpansions: Array<RequestExpansion>;

  @ViewChild(BodyViewerHostDirective)
  bodyViewerHost: BodyViewerHostDirective;

  resBodyVeiwers: Array<Dictionary<RequestExpander>>;
  matchedResBodyViewers: Array<RequestExpander>;

  basicResBodyViewer: RequestExpander;
  selectedBodyViewer: RequestExpander;
  

  constructor(private componentFactoryResolver: ComponentFactoryResolver) { }

  ngOnInit() {
    this.basicResBodyViewer = new RequestExpander();
    this.basicResBodyViewer.name = "Basic";
    this.basicResBodyViewer.component = ResponseBodyBasicComponent;

    this.resBodyVeiwers = this.requestExpansions.map(re => re.resBodyVeiwers);
  }

  /**
   * http response 정보를 입력받아서 화면에 그려준다.
   * http request component가 이 메서드를 호출한다.
   * @param responseInfo 
   */
  handleResponse(responseInfo: ResponseInfo) {
    this.requestView.response = responseInfo;
    this.requestView.requestStatus = RequestStatus.SendSuccess;

    responseInfo.headers
    .filter(h => h.name == 'Content-Type')
    .forEach(h => {
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
      }
    });

    const contentType: string = this.requestView.resContentType;
    if (contentType != null) {
      this.matchedResBodyViewers = this.resBodyVeiwers
        .filter(viewer => viewer[contentType] != null)
        .map(viewer => viewer[contentType]);
    }

    if (this.matchedResBodyViewers == null) {
      this.matchedResBodyViewers = new Array();
    }

    this.matchedResBodyViewers.splice(0, 0, this.basicResBodyViewer);
    this.selectedBodyViewer = this.matchedResBodyViewers[0];
  }

  /**
   * http request가 실패했을 경우에 대한 처리
   * cors 문제
   * 응답을 받지 못함
   */
  handleError() {

  }
}
