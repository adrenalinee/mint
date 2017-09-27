import { Component, OnInit, Input, ViewChild } from '@angular/core';

import { RequestView } from 'app/requestInfo';
import { RequestExpansion } from 'app/requestExpansion';
import { DefaultRequestExpansionBuilder } from 'app/components/expansions/DefaultRequestExpansionBuilder';
import { HttpClientConfig } from 'app/httpClientsPreferences';
import { HttpResponseComponent } from 'app/components/http-response/http-response.component';

@Component({
  selector: 'app-http-client',
  templateUrl: './http-client.component.html',
  styleUrls: ['./http-client.component.css']
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
      this.requestView = new RequestView(null);
    }

    if (this.requestExpansions == null) {
      // this.requestExpansions = new Array(); //TODO 입력받은 값이 없을 경우 기본 확장 셋이 등록되어야 한다.
      this.requestExpansions = DefaultRequestExpansionBuilder.build();
    }
  }

}
