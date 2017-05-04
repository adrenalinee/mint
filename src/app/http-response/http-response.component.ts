import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-http-response',
  templateUrl: './http-response.component.html',
  styleUrls: ['./http-response.component.css']
})
export class HttpResponseComponent implements OnInit {
  @Input() requestInfo: RequestInfo;
  displayMethod: string[];

  constructor() { }

  ngOnInit() {
  }

}
