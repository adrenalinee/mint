import { Component, OnInit, Input } from '@angular/core';

import { RequestView } from 'app/requestInfo';
import { BodyViewerComponent } from 'app/requestExpansion';

@Component({
  selector: 'app-text-html-viewer',
  templateUrl: './text-html-viewer.component.html',
  styleUrls: ['./text-html-viewer.component.css']
})
export class TextHtmlViewerComponent implements BodyViewerComponent, OnInit {
  @Input() requestView: RequestView;

  constructor() { }

  ngOnInit() {
  }

}
