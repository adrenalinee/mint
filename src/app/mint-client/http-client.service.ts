
import {map} from 'rxjs/operators';
import { Injectable } from '@angular/core';
// import { Response, ResponseType } from '@angular/http';
import { Observable } from 'rxjs/Rx';


import { NameValue, ResponseInfo } from './requestViews';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';

/**
 *
 */
@Injectable()
export class HttpClientService {

    constructor(private http: HttpClient) {
    }

    execute2(method: string, url: string, requestHeaders: Array<NameValue>, body: any): Observable<ResponseInfo> {
        const headers = new HttpHeaders();
        requestHeaders
            .filter(nameValue => !nameValue.isEmpty())
            .forEach(nameValue => {
                headers.set(<string> nameValue.name, <string> nameValue.value);
            });

        const startTime = new Date().getTime();
        return this.http.request(method, url, {
            body: body,
            headers: headers,
            observe: 'response',
            responseType: 'text'
        }).pipe(map((response: HttpResponse<Object>) => {
            console.log(response);
            const elapseTime = new Date().getTime() - startTime;
            const responseInfo: ResponseInfo = new ResponseInfo();
            responseInfo.status = response.status;
            responseInfo.statusText = response.statusText;
            responseInfo.elapseTime = elapseTime;

            response.headers.keys()
                .forEach(k => {
                    responseInfo.headers.push(NameValue.new(k, response.headers.get(k)));
                });

            responseInfo.body = response.body == null ? null : <string> response.body;

            return responseInfo;
        })); // .catch(this.handleError);
    }
}
