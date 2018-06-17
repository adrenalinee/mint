import { Component, OnInit } from '@angular/core';
import { HttpClientConfig } from './mint-client/httpClientConfig';

@Component({
  selector: 'mint-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';

  config: HttpClientConfig;

  ngOnInit(): void {
    const config = new HttpClientConfig();


    this.config = config;
  }

}
