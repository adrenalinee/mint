import { Component, OnInit, ViewChild } from '@angular/core';
import { HttpClientConfig } from './mint-client/httpClientConfig';
import { HttpClientTabComponent } from './mint-client/http-client-tab/http-client-tab.component';

@Component({
  selector: 'mint-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';

  config: HttpClientConfig;

  @ViewChild('httpClientTab')
  httpClientTab: HttpClientTabComponent;

  ngOnInit(): void {
    const config = new HttpClientConfig();

    this.config = config;
  }

  addClient(): void {
    this.httpClientTab.addClient();
  }
}
