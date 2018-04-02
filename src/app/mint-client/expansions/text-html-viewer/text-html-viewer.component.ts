import { Component, OnInit, Input, Pipe, PipeTransform } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { BodyViewerComponent } from '../../requestExpansions';
import { RequestView } from '../../requestViews';

@Pipe({
  name: 'safeHtml'
})
export class SafeHtmlPipe implements PipeTransform {
  constructor(private domSanitizer: DomSanitizer) { }

  transform(value: any, ...args: any[]): any {
    return this.domSanitizer.bypassSecurityTrustHtml(value);
  }
}

@Component({
  selector: 'mint-text-html-viewer',
  templateUrl: './text-html-viewer.component.html',
  styleUrls: ['./text-html-viewer.component.css']
})
export class TextHtmlViewerComponent implements BodyViewerComponent, OnInit {
  @Input() requestView: RequestView;

  constructor() { }

  ngOnInit() {
  }

}
