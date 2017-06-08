import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
import { Observable, Subject } from 'rxjs/Rx';

import { RequestView, NameValue } from 'app/requestInfo';
import { Dictionary } from 'app/Dictionary';
import { RequestExpansion, RequestExpander } from 'app/requestExpansion';
import { BuilderDialogComponent } from 'app/components/builder-dialog/builder-dialog.component';

@Component({
  selector: 'app-request-body',
  templateUrl: './request-body.component.html',
  styleUrls: ['./request-body.component.css']
})
export class RequestBodyComponent implements OnInit {
  @Input() requestView: RequestView;

  @Input() reqBodyBuilders: Array<Dictionary<RequestExpander>>;

  contentTypes: string[];
  displayModes: string[];

  proposeDisplayModes: Dictionary<string> = new Dictionary<string>();

  constructor(private dialog: MdDialog) { }

  ngOnInit() {
    this.contentTypes = [
      'application/json',
      'application/xml',
      'application/x-www-form-urlencoded',
      'multipart/form-data',
      'text/html',
      'text/plain'
    ];
    this.displayModes = [
      'text',
      'json',
      'xml'
    ];

    // this.proposeDisplayModes.add('application/x-www-form-urlencoded', );
  }


  onChange(data) {
    this.requestView.request.body = data;
  }

  onChangeRequestBodyContentType() {
    const reqContentType: string = this.requestView.reqContentType;

    const reqBodyBuilder = this.reqBodyBuilders.find(builder => builder[reqContentType] != null)
    if (reqBodyBuilder != null) {
      this.requestView.enableReqBodyBuilder = true;
    } else {
      this.requestView.enableReqBodyBuilder = false;
    }

    const contentTypeHeader = this.requestView.request.headers
      .filter(h => h.name != null)
      .find(h => h.name.toLowerCase() == 'content-type');

    if (contentTypeHeader != null) {
      contentTypeHeader.value = reqContentType;
    } else {
      this.requestView.request.headers.pop();
      this.requestView.request.headers.push(new NameValue('Content-Type', reqContentType));
      this.requestView.request.headers.push(new NameValue(null, null));
    }
  }

  //TODO request body 관련 부분을 별도의 component로 분리 시킬 예정
  selectedReqBodyExpander: number;

  openReqBodyBuilder() {
    const reqContentType: string = this.requestView.reqContentType;

    const matchedBuilders: Array<RequestExpander> =
      this.reqBodyBuilders
        .filter(builder => builder[reqContentType] != null)
        .map(builder => builder[reqContentType]);

    this.dialog.open(BuilderDialogComponent, {
      data: {
        title: 'Request Body Builder Select',
        expanders: matchedBuilders,
        selectedExpander: this.selectedReqBodyExpander
      }
    })
    .afterClosed()
    .subscribe(data => {
      if (data != null) {
        if (data.value != null) {
          this.requestView.request.body = data.value;
          this.selectedReqBodyExpander = data.selectedExpander;
        }
      }
    });
  }
}
