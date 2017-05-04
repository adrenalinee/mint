import { Component, OnInit, Input } from '@angular/core';
import { NameValue } from '../nameValue';

@Component({
  selector: 'app-http-request',
  templateUrl: './http-request.component.html',
  styleUrls: ['./http-request.component.css']
})
export class HttpRequestComponent implements OnInit {
  @Input() requestInfo: RequestInfo;

  httpMethods: string[];
  contentTypes: string[];

  constructor() { }

  ngOnInit() {
    this.httpMethods = ["GET", "POST", "PUT", "PATCH", "DELETE"];
    this.contentTypes = [
      "text/plain",
      "text/html",
      "application/json",
      "application/xml"
    ];
  }

  send() {
    console.log("send!");
    this.requestInfo['isOpenResponse'] = !this.requestInfo['isOpenResponse'];
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
