import { Component, OnInit } from '@angular/core';
import { HttpClientConfig, HttpClientConfigs } from '../../../mint-client/src/httpClientConfig';

// import { RequestView } from '../../../mint-client/src/requestViews';

@Component({
  // selector: 'mint-single-client',
  template: `
      <mat-card class="content">
          <mint-http-client [config]="httpClientConfig"></mint-http-client>
      </mat-card>
  `
})
export class SingleClientComponent implements OnInit {

  // requestView: RequestView;

  httpClientConfig: HttpClientConfig;

  constructor() {
  }

  ngOnInit() {
    // this.requestView = new RequestView(null);
    // this.requestView.requestUrl = 'assets/test.json';

    this.httpClientConfig = HttpClientConfigs.createDefault();
    // this.httpClientConfig.definedRequestInfo.method = 'POST';
    this.httpClientConfig.definedRequestInfo.url = 'http://localhost:3000/assets/test.json';
  }

}
