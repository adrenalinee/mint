import { Component, OnInit, Input } from '@angular/core';
import { MatDialog } from '@angular/material';

import { NameValue, RequestStatus, RequestView, ResponseInfo } from '../requestViews';
import { RequestExpander, RequestExpansion } from '../requestExpansions';
import { HttpResponseComponent } from '../http-response/http-response.component';
import { HttpClientService } from '../http-client.service';


@Component({
  selector: 'mint-http-request',
  templateUrl: './http-request.component.html',
  providers: [HttpClientService]
})
export class HttpRequestComponent implements OnInit {
  RequestStatus: any = RequestStatus;

  @Input() requestView: RequestView;
  // @Input() requestExpansions: Array<RequestExpansion>;
  @Input() requestExpansion: RequestExpansion;
  @Input() httpResponse: HttpResponseComponent;

  // headerBuilders: Array<Map<string, RequestExpander>>;
  // urlParamBuilders: Array<Map<string, RequestExpander>>;
  // queryParamBuilders: Array<Map<string, RequestExpander>>;
  // reqBodyBuilders: Array<Map<string, RequestExpander>>;
  headerBuilders: Map<string, RequestExpander[]>;
  urlParamBuilders: Map<string, RequestExpander[]>;
  queryParamBuilders: Map<string, RequestExpander[]>;
  reqBodyBuilders: Map<string, RequestExpander[]>;

  httpMethods: string[];

  constructor(private httpClient: HttpClientService, private dialog: MatDialog) {
  }

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
    // if (this.requestExpansions != null) {
    //   this.headerBuilders = this.requestExpansions.map(re => re.headerBuilders);
    //   this.urlParamBuilders = this.requestExpansions.map(re => re.urlParamBuilders);
    //   this.queryParamBuilders = this.requestExpansions.map(re => re.queryParamBuilders);
    //   this.reqBodyBuilders = this.requestExpansions.map(re => re.bodyBuilders);
    // }
    if (this.requestExpansion != null) {
      this.headerBuilders = this.requestExpansion.headerBuilders;
      this.urlParamBuilders = this.requestExpansion.urlParamBuilders;
      this.queryParamBuilders = this.requestExpansion.queryParamBuilders;
      this.reqBodyBuilders = this.requestExpansion.bodyBuilders;
    }
  }

  send() {
    console.log('send!');

    const cleanedUrl = this.cleanRequestUrl(this.requestView.requestUrl);
    console.log('@@@: ' + this.requestView.requestUrl);
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
        error => this.httpResponse.handleError(error)
      );
    // .subscribe(response => this.httpResponse.handleResponse(response));
  }

  private cleanRequestUrl(dirtyUrl?: string): string {
    if (dirtyUrl == null) {
      return '';
    }

    return dirtyUrl.replace('\n', '');
  }

  private makeFinalRequestUrl(rawUrl: string): string {
    let fianlRequestUrl: string;
    const url = rawUrl;

    if (url.indexOf('}') < 0) {
      fianlRequestUrl = url;
    } else {
      let uri: string = url;
      let queryString = '';

      const qIndex = url.indexOf('?');

      console.log(qIndex);

      if (qIndex > -1) {
        uri = url.substring(0, qIndex);
        queryString = url.substring(qIndex + 1, url.length);
      }

      // if (uri != null) {
      this.requestView.request.urlParams
        .filter(nameValue => nameValue.enabled)
        .forEach(nameValue => {
          const value = nameValue.value === undefined ? '' : nameValue.value;
          uri = uri.replace('{' + nameValue.name + '}', value);
        });
      // }

      // if (queryString != null) {
      this.requestView.request.queryParams
        .filter(nameValue => nameValue.enabled)
        .forEach(nameValue => {
          queryString = queryString.replace('{' + nameValue.name + '}', nameValue.value);
        });
      // }

      fianlRequestUrl = uri;
      if (queryString !== '') {
        fianlRequestUrl = fianlRequestUrl + '?' + queryString;
      }
    }

    return fianlRequestUrl;
  }

  sendCheck($event: KeyboardEvent) {
    if ($event.key === 'Enter') {
      this.send();
      return false;
    }
  }

  findParams($event: KeyboardEvent) {
    const url: string = this.requestView.requestUrl;
    if (url == null || '' === url) {
      return;
    }

    if ($event.key !== '}') {
      if (url.indexOf('}') < -1) {
        return;
      }
    }

    let uri: string = url;
    let queryString = '';

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

    if (queryString !== '') {
      if (this.findProperties(queryString, this.requestView.request.queryParams)) {
        this.requestView.isOpenParams = true;
        this.requestView.paramTebSelectedIndex = 0;
      }
    }
  }

  findProperties(source: string, target: NameValue[]): boolean {
    const paramNames = new Array<string>();
    let isStartParamName = false;
    let tempName = '';
    source.split('').forEach(s => {
      if (s === '{') {
        isStartParamName = true;
      } else if (s === '}') {
        isStartParamName = false;
        if (tempName !== '') {
          paramNames.push(tempName);
          tempName = '';
        }
      } else if (isStartParamName) {
        tempName += s;
      }
    });

    paramNames.forEach(name => {
      const exist = target.find(p => p.name === name);
      if (!exist) {
        const param = target.pop();
        if (param !== undefined) {
          param.name = name;
          target.push(param);
          target.push(new NameValue());
        }
      }
    });

    if (paramNames.length > 0) {
      return true;
    }

    return false;
  }

}
