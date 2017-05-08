import { Component, OnInit, Input } from '@angular/core';
// import {FormControl} from '@angular/forms';
// import 'rxjs/add/operator/startWith';

import { NameValue } from 'app/nameValue';
import { RequestView } from 'app/request-info';
import { HttpClientService } from 'app/services/http-client.service';

@Component({
  selector: 'app-http-request',
  templateUrl: './http-request.component.html',
  styleUrls: ['./http-request.component.css'],
  providers: [HttpClientService]
})
export class HttpRequestComponent implements OnInit {
  @Input() requestView: RequestView;

  httpMethods: string[];
  contentTypes: string[];
  requestHeaders: string[];
  displayModes: string[];

  constructor(private httpClient: HttpClientService) { }

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
            } else if (h.value.startsWith('application/xml')) {
              this.requestView.resDisplayMode = 'xml';
            } else if (h.value.startsWith('text/xml')) {
              this.requestView.resDisplayMode = 'xml';
            } else if (h.value.startsWith('text/html')) {
              this.requestView.resDisplayMode = 'html';
            }
          });
        });

  }


  addNameValue(selectedIndex, nameValues: NameValue[]) {
    if (selectedIndex == nameValues.length - 1) {
      nameValues.push(new NameValue(null, null));
    }
  }

  checkForNext(selectedIndex, nameValues: NameValue[]) {
    if (selectedIndex < nameValues.length - 1) {
      let currentHeader: NameValue = nameValues[selectedIndex];
      if (currentHeader.name == null && currentHeader.value == null) {
        if (selectedIndex + 1 == nameValues.length - 1) {
          nameValues.pop();
        }
      }
    }
  }
}
