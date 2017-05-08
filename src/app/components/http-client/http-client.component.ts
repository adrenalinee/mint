import { Component, OnInit } from '@angular/core';
import { RequestView } from '../../request-info';

@Component({
  selector: 'app-http-client',
  templateUrl: './http-client.component.html',
  styleUrls: ['./http-client.component.css']
})
export class HttpClientComponent implements OnInit {
  requestView: RequestView = new RequestView();

  constructor() { }

  ngOnInit() {
  }

  closeTab() {
    console.log('closeTab');
  }
}
