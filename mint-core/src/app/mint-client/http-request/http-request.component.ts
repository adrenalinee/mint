import { Component, OnInit, Input, ViewChild, AfterViewInit } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
import { Observable } from 'rxjs/Rx';

import { RequestView, NameValue, RequestStatus, ResponseInfo } from 'app/requestInfo';
import { Dictionary } from 'app/Dictionary';
import { RequestExpansion, RequestExpander } from 'app/requestExpansion';
import { HttpResponseComponent } from 'app/components/http-response/http-response.component';
import { HttpClientService } from 'app/services/http-client.service';
import { BuilderDialogComponent } from 'app/components/builder-dialog/builder-dialog.component';

@Component({
  selector: 'app-http-request',
  templateUrl: './http-request.component.html',
  styleUrls: ['./http-request.component.css'],
  providers: [HttpClientService]
})
export class HttpRequestComponent implements OnInit {
  RequestStatus: any = RequestStatus;

  @Input() requestView: RequestView;
  @Input() requestExpansions: Array<RequestExpansion>;
  @Input() httpResponse: HttpResponseComponent;

  headerBuilders: Array<Dictionary<RequestExpander>>;
  urlParamBuilders: Array<Dictionary<RequestExpander>>;
  queryParamBuilders: Array<Dictionary<RequestExpander>>;
  reqBodyBuilders: Array<Dictionary<RequestExpander>>;

  httpMethods: string[];

  constructor(private httpClient: HttpClientService, private dialog: MdDialog) { }

  ngOnInit() {

    this.httpMethods = [
      'GET',
      'POST',
      'PUT',
      'PATCH',
      'DELETE',
      'HEAD',
      'OPTIONS'
    ];

    this.headerBuilders = this.requestExpansions.map(re => re.headerBuilders);
    this.urlParamBuilders = this.requestExpansions.map(re => re.urlParamBuilders);
    this.queryParamBuilders = this.requestExpansions.map(re => re.queryParamBuilders);
    this.reqBodyBuilders = this.requestExpansions.map(re => re.bodyBuilders);
  }

  send() {
    console.log('send!');

    const cleanedUrl = this.cleanRequestUrl(this.requestView.requestUrl);
    console.log("@@@: " + this.requestView.requestUrl);
    this.requestView.requestUrl = cleanedUrl;

    const fianlRequestUrl: string = this.makeFinalRequestUrl(cleanedUrl);
    const body = this.requestView.request.body;
    const method = this.requestView.request.method;
    const requestHeaders = this.requestView.request.headers.filter(h => h.enabled);

    this.requestView.request.url = fianlRequestUrl;
    this.requestView.requestStatus = RequestStatus.Sending;
    this.requestView.response = new ResponseInfo();
    this.requestView.resBodyFormat = false;
    this.requestView.resBodyWrap = true;

    this.httpClient.execute2(method, fianlRequestUrl, requestHeaders, body)
    .subscribe(
      response => this.httpResponse.handleResponse(response),
      error => this.httpResponse.handleError()
    )
      // .subscribe(response => this.httpResponse.handleResponse(response));
  }

  private cleanRequestUrl(dirtyUrl: string): string {
    if (dirtyUrl == null || "" == dirtyUrl) {
      return dirtyUrl;
    }

    return dirtyUrl.replace("\n", "");
  }

  private makeFinalRequestUrl(rawUrl: string): string {
    let fianlRequestUrl: string;
    const url = rawUrl;

    if (url.indexOf('}') < 0) {
      fianlRequestUrl = url;
    } else {
      let uri: string = url;
      let queryString: string;
      
      const qIndex = url.indexOf('?');

      console.log(qIndex);
      
      if (qIndex > -1) {
        uri = url.substring(0, qIndex);
        queryString = url.substring(qIndex + 1, url.length);
      }

      if (uri != null) {
        this.requestView.request.urlParams
        .filter(p => p.enabled)
        .forEach(p => {
          uri = uri.replace('{' + p.name + '}', p.value);
        });
      }

      if (queryString != null) {
        this.requestView.request.queryParams
        .filter(p => p.enabled)
        .forEach(p => {
          queryString = queryString.replace('{' + p.name + '}', p.value);
        });
      }

      fianlRequestUrl = uri;
      if (queryString != null) {
         fianlRequestUrl + '?' + queryString;
      }
    }

    return fianlRequestUrl;
  }

  findParams($event: KeyboardEvent) {
    if ($event.key == 'Enter') {
      //TODO 더 좋은 방식으로 바꿔야 함
      this.requestView.requestUrl = this.requestView.requestUrl.substr(0, this.requestView.requestUrl.length - 1);
      this.send();
      return;
    }

    const url: string = this.requestView.requestUrl;
    if (url == null || "" == url) {
      return;
    }

    if ($event.key != '}') {
      if (url.indexOf('}') < -1) {
        return;
      }
    }

    let uri: string = url;
    let queryString: string;
    
    const qIndex = url.indexOf('?');
    
    if (qIndex > 0) {
      uri = url.substring(0, qIndex);
      queryString = url.substring(qIndex + 1, url.length);
    }

    if (uri.length > 0) {
      if (this.findProperties(uri, this.requestView.request.urlParams)) {
        this.requestView.isOpenParams = true;
        this.requestView.paramTebSelectedIndex = 1;
      }
    }
    if (queryString != null) {
      if (this.findProperties(queryString, this.requestView.request.queryParams)) {
        this.requestView.isOpenParams = true;
        this.requestView.paramTebSelectedIndex = 0;
      }
    }
  }

  findProperties(source: string, target: Array<NameValue>): boolean {
    const paramNames: Array<string> = new Array();
    let isStartParamName: boolean = false;
    let tempName: string = '';
    source.split('').forEach(s => {
      if (s == '{') {
        isStartParamName = true;
      } else if (s == '}') {
        isStartParamName = false;
        if (tempName != '') {
          paramNames.push(tempName);
          tempName = '';
        }
      } else if (isStartParamName) {
        tempName += s;
      }
    });

    paramNames.forEach(name => {
      const exist = target.find(p => p.name == name);
      if (!exist) {
        const param: NameValue = target.pop();
        param.name = name;
        target.push(param);
        target.push(new NameValue(null, null));
      }
    });

    if (paramNames.length > 0) {
      return true;
    }

    return false;
  }

}
