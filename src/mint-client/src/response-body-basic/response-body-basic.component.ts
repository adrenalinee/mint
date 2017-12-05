import { Component, OnInit, Input } from '@angular/core';
import { BodyViewerComponent } from '../requestExpansions';
import { RequestView } from '../requestViews';

@Component({
    selector: 'mint-response-body-basic',
    templateUrl: './response-body-basic.component.html',
    styleUrls: ['./response-body-basic.component.css']
})
export class ResponseBodyBasicComponent implements BodyViewerComponent, OnInit {
    @Input() requestView: RequestView;

    // @ViewChild('editor') editor;

    displayModes: string[];

    displayResBody: string;

    // aceOption: any;

    constructor() {
    }

    ngOnInit() {
        // console.log('ngOnInit');

        // this.aceOption = {
        //   minLines: 10,
        //   maxLines: '1000',
        //   showPrintMargin: false,
        //   wrap: this.requestView.resBodyWrap
        // }

        this.displayModes = [
            'text',
            'json',
            'xml',
            'html',
            'css',
            'javascript'
        ];

        this.displayResBody = this.requestView.response.body;
    }

    onChangeFormat() {
        console.log('onChangeFormat');
        const resBodyFormat: boolean = this.requestView.resBodyFormat;
        // console.log(resBodyFormat);
        // console.log(this.requestView.resContentType);

        if (!resBodyFormat) {
            this.displayResBody = this.requestView.response.body;
        } else {
            if (this.requestView.resContentType === 'application/json') {
                this.displayResBody = this.formatJson(this.requestView.response.body);
            } else if (this.requestView.resContentType === 'application/xml' ||
                this.requestView.resContentType === 'text/xml') {
                this.displayResBody = this.formatXml(this.requestView.response.body);
            } else {
                // TODO notify unsupported format
                console.warn('unsupported format. content type: ' + this.requestView.resContentType);
            }
        }
    }

    formatJson(json: string): string {
        return JSON.stringify(JSON.parse(json), null, 2);
    }

    /**
     *
     * @param xml 원본 xml 문자
     */
    formatXml(xml: string): string {
        let formatted = '';
        const reg = /(>)(<)(\/*)/g;
        xml = xml.replace(reg, '$1\r\n$2$3');
        let pad = 0;

        xml.split('\r\n').forEach(node => {
            let indent = 0;
            if (node.match(/.+<\/\w[^>]*>$/)) {
                indent = 0;
            } else if (node.match(/^<\/\w/)) {
                if (pad !== 0) {
                    pad -= 1;
                }
            } else if (node.match(/^<\w[^>]*[^\/]>.*$/)) {
                indent = 1;
            } else {
                indent = 0;
            }

            let padding = '';
            for (let i = 0; i < pad; i++) {
                padding += '  ';
            }

            formatted += padding + node + '\r\n';
            pad += indent;
        });

        return formatted;
    }
}
