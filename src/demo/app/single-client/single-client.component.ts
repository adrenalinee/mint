import {Component, OnInit} from '@angular/core';
import {HttpClientConfig} from '../../../mint-client/src/httpClientConfig';

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

    this.httpClientConfig = new HttpClientConfig();
    this.httpClientConfig.definedRequestInfo.url = 'assets/test.json';
  }

}
