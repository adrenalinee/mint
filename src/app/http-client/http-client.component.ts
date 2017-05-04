import { Component, OnInit } from '@angular/core';
import { RequestInfo } from '../request-info';

@Component({
  selector: 'app-http-client',
  templateUrl: './http-client.component.html',
  styleUrls: ['./http-client.component.css']
})
export class HttpClientComponent implements OnInit {
  requestInfo: RequestInfo = new RequestInfo();

  constructor() { }

  ngOnInit() {
  }

}
