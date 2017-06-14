import { Component, OnInit, Input } from '@angular/core';

import { Dictionary } from 'app/Dictionary';
import { RequestExpansion, RequestExpander } from 'app/requestExpansion';
import { RequestView, ResponseInfo} from 'app/requestInfo';

@Component({
  selector: 'app-http-response',
  templateUrl: './http-response.component.html',
  styleUrls: ['./http-response.component.css']
})
export class HttpResponseComponent implements OnInit {
  @Input() requestView: RequestView;
  @Input() requestExpansions: Array<RequestExpansion>;

  resBodyVeiwers: Array<Dictionary<RequestExpander>>;
  matchedResBodyViewers: Array<RequestExpander>;

  selectedBodyViewerName: string = "Basic";

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
    // console.log(this.resBodyVeiwers);
    // console.log(this.resBodyVeiwers['text/html']);

    
  }

  handleResponse(responseInfo: ResponseInfo) {
    this.requestView.response = responseInfo;
    this.requestView.isOpenResponse = true;

    responseInfo.headers
    .filter(h => h.name == 'Content-Type')
    .forEach(h => {
      if (h.value.startsWith('application/json')) {
        this.requestView.resDisplayMode = 'json';
        this.requestView.resContentType = 'application/json';
      } else if (h.value.startsWith('application/xml')) {
        this.requestView.resDisplayMode = 'xml';
        this.requestView.resContentType = 'application/xml';
      } else if (h.value.startsWith('text/xml')) {
        this.requestView.resDisplayMode = 'xml';
        this.requestView.resContentType = 'text/xml';
      } else if (h.value.startsWith('text/html')) {
        this.requestView.resDisplayMode = 'html';
        this.requestView.resContentType = 'text/html';
      } else if (h.value.startsWith('text/css')) {
        this.requestView.resDisplayMode = 'css';
        this.requestView.resContentType = 'text/css';
      }
    });

    const contentType: string = this.requestView.resContentType;
    if (contentType != null) {
      this.matchedResBodyViewers = this.resBodyVeiwers
        .filter(viewer => viewer[contentType] != null)
        .map(viewer => viewer[contentType]);
    }

    // console.log(this.matchedResBodyViewers);

    if (this.matchedResBodyViewers == null) {
      this.matchedResBodyViewers = new Array();
    }
  }
}
