import { Component, OnInit, Input } from '@angular/core';

import { Dictionary } from 'app/Dictionary';
import { RequestExpansion, RequestExpander } from 'app/requestExpansion';
import { RequestView } from 'app/requestInfo';

@Component({
  selector: 'app-http-response',
  templateUrl: './http-response.component.html',
  styleUrls: ['./http-response.component.css']
})
export class HttpResponseComponent implements OnInit {
  @Input() requestView: RequestView;
  @Input() requestExpansions: Array<RequestExpansion>;

  resBodyVeiwers: Array<Dictionary<RequestExpander>>;
  
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

    this.resBodyVeiwers = this.requestExpansions.map(re => re.resBodyVeiwers);
    console.log(this.resBodyVeiwers);
    console.log(this.resBodyVeiwers['text/html']);

    
  }

}
