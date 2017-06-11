import { Component, ViewChild } from '@angular/core';

import { HttpClientsComponent } from './components/http-clients/http-clients.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  @ViewChild('httpClients')
  httpClients: HttpClientsComponent;

  addClient() {
    this.httpClients.addClient();
  }
}
