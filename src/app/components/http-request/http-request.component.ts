import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
// import {FormControl} from '@angular/forms';
// import 'rxjs/add/operator/startWith';

import { NameValue } from 'app/nameValue';
import { RequestView } from 'app/request-info';
import { RequestExpansion, HeaderBuilder } from 'app/requestExpansion';
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

    const headerBuilder = this.requestExpansions.find(re => re.headerBuilders[header.name] != null);
    if (headerBuilder != null) {
      this.requestView.request.headers[selectedIndex].builder = true;
    } else {
      this.requestView.request.headers[selectedIndex].builder = false;
    }
  }

  openHeaderBuilder2(header: NameValue) {
    const matchedHeaderBuilders: Array<HeaderBuilder> =
      this.requestExpansions
        .filter(re => re.headerBuilders[header.name] != null)
        .map(re => re.headerBuilders[header.name]);

    //TODO builder dialog open
    this.dialog.open(BuilderDialogComponent, {
      data: {
        title: header.name + ' Builder Select',
        builders: matchedHeaderBuilders
      }
    })
    .afterClosed()
    .subscribe(data => {
      if (data != null) {
        if (data.value != null) {
          header.value = data.value;
        }
      }
    });
  }

  // openHeaderBuilder(header: NameValue) {
  //   const headerBuilder: HeaderBuilder =
  //     this.requestExpansions
  //       .find(re => re.headerBuilders[header.name] != null)
  //       .headerBuilders[header.name];


  //   this.dialog.open(headerBuilder.builder, {
  //     disableClose: true,
  //     data: {
  //       viewModel: headerBuilder.viewModel
  //     }
  //   })
  //   .afterClosed()
  //   .subscribe(data => {
  //     if (data != null) {
  //       if (data.value != null) {
  //         header.value = data.value;
  //       }
  //       if (data.viewModel != null) {
  //         headerBuilder.viewModel = data.viewModel;
  //       }
  //     }
  //   });
  // }

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
