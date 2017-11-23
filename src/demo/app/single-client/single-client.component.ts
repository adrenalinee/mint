import { Component, OnInit } from '@angular/core';
import { RequestView } from '../../../mint-client/src/requestViews';

@Component({
  selector: 'app-single-client',
  template: `
<div style="padding: 0.5em 1em 0.5em 1em">
    <app-http-client [requestView]="requestView" [requestExpansions]="requestExpansions"></app-http-client>
</div>
  `
})
export class SingleClientComponent implements OnInit {

  requestView: RequestView;

  constructor() { }

  ngOnInit() {
    this.requestView = new RequestView(null);
    this.requestView.requestUrl = 'http://localhost:3000/assets/test.json';
  }

}
