import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import { NameValue } from './nameValue';
import { RequestInfo, ResponseInfo } from './request-info';

@Injectable()
export class HttpClientService {

  constructor(private http: Http) { }

  execute(request: RequestInfo):  Observable<ResponseInfo> {
    let headers: Headers = new Headers();
    request.headers
    .filter(h => h.name != null && h.value != null)
    .forEach(h => {
      headers.set(h.name, h.value);
    });

    let finalUrl: string = request.url;
    let method = request.method;
    let body = request.body;

    let requestOptions = new RequestOptions({
      method: method,
      body: body
    });


    return this.http.request(finalUrl, requestOptions)
      .map(response => {
        console.log(response);
        let responseInfo: ResponseInfo = new ResponseInfo();
        responseInfo.status = response.status;
        responseInfo.statusText = response.statusText;

        response.headers.keys().forEach(k => {
          responseInfo.headers.push(new NameValue(k, response.headers.get(k)));
        });

        responseInfo.body = response.text();

        return responseInfo;
      });
  }
}
