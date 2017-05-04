import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class HttpClientService {

  constructor(private http: Http) { }

  get(url: string): Observable<string> {
    return this.http.get(url)
      .map(response => {
        console.log(response);
        return response['_body'];
      });
  }
}
