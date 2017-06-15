import { Component, OnInit, Input } from '@angular/core';

import { RequestView } from 'app/requestInfo';
import { BodyViewerComponent } from 'app/requestExpansion';

@Component({
  selector: 'app-response-body-basic',
  templateUrl: './response-body-basic.component.html',
  styleUrls: ['./response-body-basic.component.css']
})
export class ResponseBodyBasicComponent implements BodyViewerComponent, OnInit {
  @Input() requestView: RequestView;
  
  displayModes: string[];

  constructor() { }

  ngOnInit() {
    this.displayModes = [
      'text',
      'json',
      'xml',
      'html',
      'css',
      'javascript'
    ];
  }

}
