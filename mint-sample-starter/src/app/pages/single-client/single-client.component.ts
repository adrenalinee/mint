import { Component, OnInit } from '@angular/core';

import { RequestView } from 'app/requestInfo';

@Component({
  selector: 'app-single-client',
  templateUrl: './single-client.component.html',
  styleUrls: ['./single-client.component.css']
})
export class SingleClientComponent implements OnInit {

  requestView: RequestView;

  constructor() { }

  ngOnInit() {
    this.requestView = new RequestView(null);
    this.requestView.requestUrl = 'http://localhost:4200/assets/test.json';
  }

}
