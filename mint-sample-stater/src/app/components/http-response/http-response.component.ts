import { Component, OnInit, Input } from '@angular/core';
import { RequestView } from '../../requestInfo';

@Component({
  selector: 'app-http-response',
  templateUrl: './http-response.component.html',
  styleUrls: ['./http-response.component.css']
})
export class HttpResponseComponent implements OnInit {
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
