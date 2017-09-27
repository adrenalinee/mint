import { Component, OnInit, Input, Pipe, PipeTransform } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser'

import { RequestView } from 'app/requestInfo';
import { BodyViewerComponent } from 'app/requestExpansion';

@Pipe({
  name: 'safeHtml'
})
export class SafeHtmlPipe implements PipeTransform {
  constructor(private domSanitizer: DomSanitizer) { }

  transform(value) {
    return this.domSanitizer.bypassSecurityTrustHtml(value);
  }
}

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
