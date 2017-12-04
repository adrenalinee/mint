import { Component, OnInit } from '@angular/core';
import { HttpClientConfig } from '../../../mint-client/src/httpClientConfig';
// import { RequestView } from '../../../mint-client/src/requestViews';

@Component({
  selector: 'app-single-client',
  template: `
<div style="padding: 0.5em">
    <app-http-client></app-http-client>
</div>
  `
})
export class SingleClientComponent implements OnInit {

  // requestView: RequestView;

  httpClientConfig: HttpClientConfig;

  constructor() { }

  ngOnInit() {
    // this.requestView = new RequestView(null);
    // this.requestView.requestUrl = 'assets/test.json';

    this.httpClientConfig = new HttpClientConfig();

  }

}
