import { Component, OnInit, Input } from '@angular/core';

import { RequestView } from 'app/requestInfo';
import { RequestExpansion } from 'app/requestExpansion';

@Component({
  selector: 'app-http-client',
  templateUrl: './http-client.component.html',
  styleUrls: ['./http-client.component.css']
})
export class HttpClientComponent implements OnInit {
  @Input() requestView: RequestView;
  @Input() requestExpansions: Array<RequestExpansion>;

  constructor() { }

  ngOnInit() {
  }

}
