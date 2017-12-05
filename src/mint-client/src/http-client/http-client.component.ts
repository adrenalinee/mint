import { Component, OnInit, Input, ViewChild } from '@angular/core';
import { DefinedRequestInfo, HttpClientConfig } from '../httpClientConfig';
import { RequestInfo, RequestView } from '../requestViews';
import { RequestExpansion } from '../requestExpansions';
import { HttpResponseComponent } from '../http-response/http-response.component';
import { DefaultRequestExpansionBuilder } from '../expansions/DefaultRequestExpansionBuilder';

@Component({
  selector: 'mint-http-client',
  templateUrl: './http-client.component.html'
})
export class HttpClientComponent implements OnInit {
  @Input() config?: HttpClientConfig;

  requestView: RequestView = new RequestView();

  requestExpansions: RequestExpansion[];

  @ViewChild(HttpResponseComponent) httpResponse: HttpResponseComponent;

  constructor() { }

  ngOnInit() {
    if (this.config == null) {
      this.config = new HttpClientConfig();
    }

    this.requestExpansions = this.config.requestExpansions;
    if (this.requestExpansions == null) {
      this.requestExpansions = [];
    }
    if (this.config.useDefaultExpander) {
      DefaultRequestExpansionBuilder
        .build()
        .forEach(e => this.requestExpansions.push(e));
    }

    const definedRequestInfo: DefinedRequestInfo = this.config.definedRequestInfo;
    this.requestView.requestUrl = definedRequestInfo.url;

    const request: RequestInfo = this.requestView.request;
    request.method = definedRequestInfo.method;
    request.body = definedRequestInfo.body;
    request.headers = definedRequestInfo.headers;
    request.queryParams = definedRequestInfo.queryParams;
    request.urlParams = definedRequestInfo.urlParams;



    // if (this.requestView == null) {
    //   this.requestView = new RequestView();
    // }
    //
    // if (this.requestExpansions == null) {
    //   // this.requestExpansions = new Array(); //TODO 입력받은 값이 없을 경우 기본 확장 셋이 등록되어야 한다.
    //   this.requestExpansions = DefaultRequestExpansionBuilder.build();
    // }
  }

}
