import { Component, OnInit, Input, ViewChild } from '@angular/core';
import { DefinedRequestInfo, HttpClientConfig, HttpClientConfigs } from '../httpClientConfig';
import { RequestInfo, RequestView } from '../requestViews';
import { RequestExpansion } from '../requestExpansions';
import { HttpResponseComponent } from '../http-response/http-response.component';

@Component({
  selector: 'mint-http-client',
  templateUrl: './http-client.component.html'
})
export class HttpClientComponent implements OnInit {
  @Input() config?: HttpClientConfig;

  @Input() requestView?: RequestView;
  // requestView: RequestView = new RequestView();

  requestExpansions: RequestExpansion[];

  @ViewChild(HttpResponseComponent) httpResponse: HttpResponseComponent;

  constructor() { }

  ngOnInit() {
    if (this.config == null) {
      this.config = HttpClientConfigs.createDefault();
    }
    if (this.requestView == null) {
      this.requestView = new RequestView();
    }

    this.requestExpansions = this.config.requestExpansions;
    // if (this.requestExpansions == null) {
    //   this.requestExpansions = [];
    // }
    if (this.config.useDefaultExpander) {
      this.config.requestExpansions.forEach(requestExpansion => this.requestExpansions.push(requestExpansion));
    }

    const definedRequestInfo: DefinedRequestInfo = this.config.definedRequestInfo;
    this.requestView.requestUrl = definedRequestInfo.url;

    const request: RequestInfo = this.requestView.request;
    request.method = definedRequestInfo.method;
    request.body = definedRequestInfo.body;
    request.headers = definedRequestInfo.headers;
    request.queryParams = definedRequestInfo.queryParams;
    request.urlParams = definedRequestInfo.urlParams;
  }

}
