import { Component, OnInit, Input, ViewChild } from '@angular/core';
import { HttpClientConfig } from '../httpClientConfig';
import { RequestView } from '../requestViews';
import { RequestExpansion } from '../requestExpansions';
import { HttpResponseComponent } from '../http-response/http-response.component';
import { DefaultRequestExpansionBuilder } from '../expansions/DefaultRequestExpansionBuilder';

@Component({
  selector: 'app-http-client',
  templateUrl: './http-client.component.html'
})
export class HttpClientComponent implements OnInit {
  @Input() config?: HttpClientConfig;

  @Input() requestView?: RequestView;
  @Input() requestExpansions?: Array<RequestExpansion>;
  @ViewChild(HttpResponseComponent) httpResponse: HttpResponseComponent;

  constructor() { }

  ngOnInit() {
    // console.log(this.httpResponse);

    if (this.config == null) {
      this.config = new HttpClientConfig();
    }

    if (this.requestView == null) {
      this.requestView = new RequestView();
    }

    if (this.requestExpansions == null) {
      // this.requestExpansions = new Array(); //TODO 입력받은 값이 없을 경우 기본 확장 셋이 등록되어야 한다.
      this.requestExpansions = DefaultRequestExpansionBuilder.build();
    }
  }

}
