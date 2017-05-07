import { Component, OnInit, Input } from '@angular/core';
import { RequestView } from '../request-info';

@Component({
  selector: 'app-http-response',
  templateUrl: './http-response.component.html',
  styleUrls: ['./http-response.component.css']
})
export class HttpResponseComponent implements OnInit {
  @Input() requestView: RequestView;
  resDisplayModes: string[];

  constructor() { }

  ngOnInit() {
    this.resDisplayModes = [
      'text',
      'json',
      'xml',
      'html',
      'css',
      'javascript'
    ];
  }

}
