import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, ResponseType } from '@angular/http';
import { Observable } from 'rxjs/Rx';

import { RequestInfo, ResponseInfo, NameValue } from '../requestInfo';

@Injectable()
export class HttpClientService {

  constructor(private http: Http) { }

  execute2(method: string, url: string, requestHeaders: Array<NameValue>, body: any): Observable<ResponseInfo> {
    let headers: Headers = new Headers();
   requestHeaders
    .filter(h => h.name != null && h.value != null)
    .forEach(h => {
      headers.set(h.name, h.value);
    });

    let requestOptions = new RequestOptions({
      headers: headers,
      method: method,
      body: body
    });

    const startTime = new Date().getTime();
    return this.http.request(url, requestOptions)
      .map(response => {
        console.log(response);
        const elapseTime = new Date().getTime() - startTime;
        let responseInfo: ResponseInfo = new ResponseInfo();
        responseInfo.status = response.status;
        responseInfo.statusText = response.statusText;
        responseInfo.elapseTime = elapseTime;

        response.headers.keys().forEach(k => {
          responseInfo.headers.push(new NameValue(k, response.headers.get(k)));
        });

        responseInfo.body = response.text() == '' ? null : response.text();

        return responseInfo;
      })
      .catch(this.handleError);
  }

  handleError(response: Response | any): Observable<ResponseInfo> {
    console.log(response);
    if (response.type == ResponseType.Error) {
      return  Observable.throw("error!");
    }


    // if (response.status == 0) {

    //   return  Observable.throw("error!");
    // }


    const responseInfo: ResponseInfo = new ResponseInfo();
    responseInfo.status = response.status;
    responseInfo.statusText = response.statusText;

    response.headers.keys().forEach(k => {
      responseInfo.headers.push(new NameValue(k, response.headers.get(k)));
    });

    responseInfo.body = response.text() == '' ? null : response.text();
    return Observable.of(responseInfo);
  }

  // execute(request: RequestInfo):  Observable<ResponseInfo> {
  //   let headers: Headers = new Headers();
  //   request.headers
  //   .filter(h => h.name != null && h.value != null)
  //   .forEach(h => {
  //     headers.set(h.name, h.value);
  //   });

  //   let finalUrl: string = request.url;
  //   let method = request.method;
  //   let body = request.body;

  //   let requestOptions = new RequestOptions({
  //     headers: headers,
  //     method: method,
  //     body: body
  //   });


  //   return this.http.request(finalUrl, requestOptions)
  //     .map(response => {
  //       // console.log(response);
  //       let responseInfo: ResponseInfo = new ResponseInfo();
  //       responseInfo.status = response.status;
  //       responseInfo.statusText = response.statusText;

  //       response.headers.keys().forEach(k => {
  //         responseInfo.headers.push(new NameValue(k, response.headers.get(k)));
  //       });

  //       responseInfo.body = response.text() == "" ? null : response.text();

  //       return responseInfo;
  //     });
  // }
}
