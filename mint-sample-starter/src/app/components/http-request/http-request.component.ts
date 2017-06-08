import { Component, OnInit, Input, ViewChild, AfterViewInit } from '@angular/core';
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
  reqBodyBuilders: Array<Dictionary<RequestExpander>>;

  httpMethods: string[];
  // contentTypes: string[];
  // requestHeaders: string[];
  displayModes: string[];

  constructor(private httpClient: HttpClientService, private dialog: MdDialog) { }

  ngOnInit() {

    this.httpMethods = [
      'GET',
      'POST',
      'PUT',
      'PATCH',
      'DELETE',
      'OPTIONS'
    ];
    // this.contentTypes = [
    //   'application/json',
    //   'application/xml',
    //   'application/x-www-form-urlencoded',
    //   'multipart/form-data',
    //   'text/html',
    //   'text/plain'
    // ];
    // this.requestHeaders = [
    //   'Accept',
    //   'Authorization',
    //   'Cache-Control',
    //   'Content-Type',
    //   'Host',
    //   'Origin'
    // ];
    this.displayModes = [
      'text',
      'json',
      'xml'
    ];


    this.headerBuilders = this.requestExpansions.map(re => re.headerBuilders);
    this.urlParamBuilders = this.requestExpansions.map(re => re.urlParamBuilders);
    this.queryParamBuilders = this.requestExpansions.map(re => re.queryParamBuilders);
    this.reqBodyBuilders = this.requestExpansions.map(re => re.bodyBuilders);
  }

  send() {
    console.log('send!');

    let fianlRequestUrl: string;
    const url = this.requestView.requestUrl;

    if (url.indexOf('}') < 0) {
      fianlRequestUrl = url;
    } else {
      let uri: string = url;
      let queryString: string;
      
      const qIndex = url.indexOf('?');
      
      if (qIndex > 0) {
        uri = url.substring(0, qIndex);
        queryString = url.substring(qIndex + 1, url.length);
      }

      if (uri != null) {
        this.requestView.request.urlParams.forEach(p => {
          uri = uri.replace('{' + p.name + '}', p.value);
        });
      }

      if (queryString != null) {
        this.requestView.request.queryParams.forEach(p => {
          queryString = queryString.replace('{' + p.name + '}', p.value);
        });
      }

      fianlRequestUrl = uri + '?' + queryString;
    }
    
    const body = this.requestView.request.body;
    const method = this.requestView.request.method;
    const requestHeaders = this.requestView.request.headers;

    this.httpClient.execute2(method, fianlRequestUrl, requestHeaders, body)
      .subscribe(
        response => {
          this.requestView.response = response;
          this.requestView.isOpenResponse = true;

          response.headers
          .filter(h => h.name == 'Content-Type')
          .forEach(h => {
            if (h.value.startsWith('application/json')) {
              this.requestView.resDisplayMode = 'json';
              // this.requestView.resSyntaxHightlight = true;
            } else if (h.value.startsWith('application/xml')) {
              this.requestView.resDisplayMode = 'xml';
              // this.requestView.resSyntaxHightlight = true;
            } else if (h.value.startsWith('text/xml')) {
              this.requestView.resDisplayMode = 'xml';
              // this.requestView.resSyntaxHightlight = true;
            } else if (h.value.startsWith('text/html')) {
              this.requestView.resDisplayMode = 'html';
              // this.requestView.resSyntaxHightlight = true;
            }
          });
        });
  }

  findParams($event) {
    const url: string = this.requestView.requestUrl;
    if (url == null) {
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
