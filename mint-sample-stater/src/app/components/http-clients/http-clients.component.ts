import { Component, OnInit } from '@angular/core';
import { RequestView } from 'app/request-info';
import { NameValue } from 'app/nameValue';
import { RequestExpansion } from 'app/requestExpansion';
import { HttpClientExpansionService } from 'app/services/http-client-expansion.service';
// import { RequestHeaderAuthorizationComponent } from 'app/components/expansions/request-header-authorization/request-header-authorization.component';
import { AuthorizationBasicComponent } from 'app/components/expansions/authorization-basic/authorization-basic.component';

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

  constructor(private httpClientExpansionService: HttpClientExpansionService) { }

  ngOnInit() {
    const requestView: RequestView = new RequestView("Request-" + this.tabCount++);
    this.requestViews.push(requestView);

    const requestExpansion = new RequestExpansion();
    requestExpansion.headerBuilders.add('authorization', {
      name: 'Basic Auth',
      component: AuthorizationBasicComponent,
      viewModel: {}
    });
    requestExpansion.queryParamBuilders.add('test', {
      name: 'test',
      component: AuthorizationBasicComponent,
      viewModel: {}
    });
    this.requestExpansions.push(requestExpansion);
  }

  closeTab(index: number) {
    console.log('closeTab');
  }
}
