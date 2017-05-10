import { Component, OnInit } from '@angular/core';
import { RequestView } from 'app/request-info';
import { NameValue } from 'app/nameValue';
import { HttpClientExpansionService } from 'app/services/http-client-expansion.service';

@Component({
  selector: 'app-http-clients',
  templateUrl: './http-clients.component.html',
  styleUrls: ['./http-clients.component.css'],
  providers: [HttpClientExpansionService]
})
export class HttpClientsComponent implements OnInit {
  requestViews: RequestView[] = [];
  
  private tabCount = 1;

  constructor(private httpClientExpansionService: HttpClientExpansionService) { }

  ngOnInit() {
    const requestView: RequestView = new RequestView("Request-" + this.tabCount++);
    requestView.headerBuilders.push(new NameValue('Authorization', 'builders/headers/authorization'));

    this.requestViews.push(requestView);
  }

  closeTab(index: number) {
    console.log('closeTab');
  }
}
