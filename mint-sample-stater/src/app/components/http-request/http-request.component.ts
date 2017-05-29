import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
import { Observable, Subject } from 'rxjs/Rx';
// import {FormControl} from '@angular/forms';
// import 'rxjs/add/operator/startWith';

import { RequestView, NameValue } from 'app/requestInfo';
import { Dictionary } from 'app/Dictionary';
import { RequestExpansion, RequestExpander } from 'app/requestExpansion';
import { HttpClientService } from 'app/services/http-client.service';
import { BuilderDialogComponent } from 'app/components/builder-dialog/builder-dialog.component';

@Component({
  selector: 'app-http-request',
  templateUrl: './http-request.component.html',
  styleUrls: ['./http-request.component.css'],
  providers: [HttpClientService]
})
export class HttpRequestComponent implements OnInit {
  @Input() requestView: RequestView;
  @Input() requestExpansions: Array<RequestExpansion>;

  headerBuilders: Array<Dictionary<RequestExpander>>;
  urlParamBuilders: Array<Dictionary<RequestExpander>>;
  queryParamBuilders: Array<Dictionary<RequestExpander>>;

  httpMethods: string[];
  contentTypes: string[];
  requestHeaders: string[];
  displayModes: string[];

  constructor(private httpClient: HttpClientService, private dialog: MdDialog) { }

  ngOnInit() {

    this.httpMethods = [
      'GET',
      'POST',
      'PUT',
      'PATCH',
      'DELETE'
    ];
    this.contentTypes = [
      'text/plain',
      'text/html',
      'application/json',
      'application/xml'
    ];
    this.requestHeaders = [
      'Accept',
      'Authorization',
      'Cache-Control',
      'Content-Type',
      'Host',
      'Origin'
    ];
    this.displayModes = [
      'text',
      'json',
      'xml'
    ];

    this.headerBuilders = this.requestExpansions.map(re => re.headerBuilders);
    this.urlParamBuilders = this.requestExpansions.map(re => re.urlParamBuilders);
    this.queryParamBuilders = this.requestExpansions.map(re => re.queryParamBuilders);
  }

  send() {
    console.log('send!');

    this.httpClient.execute(this.requestView.request)
      .subscribe(
        response => {
          console.log(response);

          this.requestView.response = response;
          this.requestView.isOpenResponse = true;

          response.headers
          .filter(h => h.name == 'Content-Type')
          .forEach(h => {
            if (h.value.startsWith('application/json')) {
              this.requestView.resDisplayMode = 'json';
              this.requestView.resSyntaxHightlight = true;
            } else if (h.value.startsWith('application/xml')) {
              this.requestView.resDisplayMode = 'xml';
              this.requestView.resSyntaxHightlight = true;
            } else if (h.value.startsWith('text/xml')) {
              this.requestView.resDisplayMode = 'xml';
              this.requestView.resSyntaxHightlight = true;
            } else if (h.value.startsWith('text/html')) {
              this.requestView.resDisplayMode = 'html';
              this.requestView.resSyntaxHightlight = true;
            }
          });
        });
  }

  findParams() {
    const url: string = this.requestView.request.url;
    let uri: string = url;
    let queryString: string;

    const qIndex = url.indexOf('?');
    if (qIndex > 0) {
      uri = url.substring(0, qIndex);
      queryString = url.substring(qIndex + 1, url.length);
    }

    if (uri.length > 0) {
      this.findUriParams(uri);
    }
    if (queryString.length > 0) {
      this.findQueryParams(queryString);
    }
  }

  findQueryParams(queryString: string) {
    console.log('findQueryParams');

    let searchStartIndex = 0;
    let paramStartIndex = queryString.indexOf('{', searchStartIndex);
    while (paramStartIndex > -1) {
				var paramEndIndex = queryString.indexOf('}', paramStartIndex);
				if (paramEndIndex <= -1) {
					return;
				}
				//searchStartIndex = paramEndIndex;
				
				var urlParamName = queryString.substring(paramStartIndex + 2, paramEndIndex);
				paramStartIndex = queryString.indexOf('{', paramEndIndex);
				
				if (urlParamName == '') {
					continue;
				}
				
				this.requestView.request.queryParams.push({
					name: urlParamName,
					value: null
				});
				
				this.requestView.isOpenParams = true;
			}
  }

  findUriParams(uri: string) {
    console.log('findUriParams');

  }


}