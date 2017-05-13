import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
// import {FormControl} from '@angular/forms';
// import 'rxjs/add/operator/startWith';

import { NameValue } from 'app/nameValue';
import { RequestView } from 'app/request-info';
import { HttpClientService } from 'app/services/http-client.service';
import { RequestHeaderAuthorizationComponent } from 'app/components/expansions/request-header-authorization/request-header-authorization.component';

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

  findHeaderBuilder(selectedIndex) {
    //TODO rxjs 로 변경 예정
    const header: NameValue = this.requestView.request.headers[selectedIndex];
    const headerBuilder: NameValue = this.requestView.headerBuilders.find(hb => hb.name == header.name);
    if (headerBuilder != null) {
      this.requestView.request.headers[selectedIndex].builder = true;
    } else {
      this.requestView.request.headers[selectedIndex].builder = false;
    }
  }

  openHeaderBuilder(header: NameValue) {
    this.dialog.open(RequestHeaderAuthorizationComponent, {
      disableClose: true
    })
    .afterClosed()
    .subscribe(value => {
      if (value != null) {
        header.value = value;
      }
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
