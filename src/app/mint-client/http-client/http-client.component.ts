import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {DefinedRequestInfo, HttpClientConfig, HttpClientConfigs} from '../httpClientConfig';
import {RequestInfo, RequestView} from '../requestViews';
import {RequestExpansion} from '../requestExpansions';
import {HttpResponseComponent} from '../http-response/http-response.component';
import {ClientExpansionRegistry} from '../httpClientConfigurer';

@Component({
  selector: 'mint-http-client',
  templateUrl: './http-client.component.html'
})
export class HttpClientComponent implements OnInit {
  @Input() config?: HttpClientConfig;

  @Input() requestView?: RequestView;

  @ViewChild(HttpResponseComponent) httpResponse: HttpResponseComponent;

  requestExpansion: RequestExpansion;

  constructor() { }

  ngOnInit() {
    if (this.config == null) {
      this.config = HttpClientConfigs.createDefaultConfig();
    }

    const expansionRegistry = new ClientExpansionRegistry();
    if (this.config.useDefaultExpander) {
      HttpClientConfigs.applyDefaultExpansions(expansionRegistry);
    }
    if (this.config.useBasicExpander) {
      HttpClientConfigs.applyBasicExpander(expansionRegistry);
    }
    if (this.config.expansionRegister !== undefined) {
      this.config.expansionRegister(expansionRegistry);
    }

    this.requestExpansion = expansionRegistry.createRequestExpansion();

    if (this.config.definedRequestInfo === undefined) {
      this.config.definedRequestInfo = new DefinedRequestInfo();
    }

    const definedRequestInfo: DefinedRequestInfo = this.config.definedRequestInfo;

    if (this.requestView == null) {
      this.requestView = new RequestView();
      this.requestView.requestUrl = definedRequestInfo.url;
    }

    const request: RequestInfo = this.requestView.request;
    if (request.method == null) {
      request.method = definedRequestInfo.method;
    }
    if (request.body == null) {
      request.body = definedRequestInfo.body;
    }
    if (request.headers.length <= 1) {
      request.headers = definedRequestInfo.headers;
    }
    if (request.queryParams.length <= 1) {
      request.queryParams = definedRequestInfo.queryParams;
    }
    if (request.urlParams.length <= 1) {
      request.urlParams = definedRequestInfo.urlParams;
    }
  }
}
