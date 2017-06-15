import { Component, OnInit, ViewChild } from '@angular/core';
import { MdMenuTrigger } from '@angular/material';

import { RequestView, NameValue } from 'app/requestInfo';
import { RequestExpansion } from 'app/requestExpansion';
import { HttpClientExpansionService } from 'app/services/http-client-expansion.service';
import { AuthorizationBasicComponent } from 'app/components/expansions/authorization-basic/authorization-basic.component';
import { TextPlainComponent } from 'app/components/expansions/text-plain/text-plain.component';
import { XWwwFormUrlencodedComponent } from 'app/components/expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';
import { TextHtmlViewerComponent } from 'app/components/expansions/text-html-viewer/text-html-viewer.component';

@Component({
  selector: 'app-http-clients',
  templateUrl: './http-clients.component.html',
  styleUrls: ['./http-clients.component.css'],
  providers: [HttpClientExpansionService]
})
export class HttpClientsComponent implements OnInit {
  requestViews: Array<RequestView> = new Array();
  requestExpansions: Array<RequestExpansion> = new Array();

  private tabCount = 1;

  selectedIndex = 0;

  constructor(private httpClientExpansionService: HttpClientExpansionService) { }

  ngOnInit() {
    const requestView: RequestView = new RequestView("SandBox-" + this.tabCount++);
    this.requestViews.push(requestView);

    const requestExpansion = new RequestExpansion();
    requestExpansion.headerBuilders.add('authorization', {
      name: 'Basic Auth',
      component: AuthorizationBasicComponent
    });
    
    requestExpansion.queryParamBuilders.add('test', {
      name: 'test',
      component: AuthorizationBasicComponent
    });
    
    requestExpansion.urlParamBuilders.add('test', {
      name: 'test',
      component: AuthorizationBasicComponent
    });
    
    requestExpansion.bodyBuilders.add('application/x-www-form-urlencoded', {
      name: 'Default',
      component: XWwwFormUrlencodedComponent
    });
    requestExpansion.bodyBuilders.add('text/plain', {
      name: 'Default',
      component: TextPlainComponent
    });

    requestExpansion.resBodyVeiwers.add('text/html', {
      name: 'HTML View',
      component: TextHtmlViewerComponent
    });

    this.requestExpansions.push(requestExpansion);
  }

  addClient(focus: boolean = true) {
    console.log('addClient');

    const requestView: RequestView = new RequestView("SandBox-" + this.tabCount++);
    const addedIndex = this.requestViews.push(requestView);
    if (focus) {
      this.selectedIndex = addedIndex;
    }
  }

  closeClient(index: number) {
    this.requestViews.splice(index, 1);
  }

  duplicateClient(index: number) {
    const requestView: RequestView = this.requestViews[index];
    const newRequestView = new RequestView("SandBox-" + this.tabCount++);
    newRequestView.requestUrl = requestView.requestUrl;

    this.requestViews.splice(index + 1, 0, newRequestView);
  }
}
