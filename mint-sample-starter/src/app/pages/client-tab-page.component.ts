import { Component, ViewChild } from '@angular/core';

import { HttpClientsComponent } from 'app/components/http-clients/http-clients.component';

@Component({
  selector: 'client-tab-page',
  templateUrl: './client-tab-page.component.html',
   styleUrls: ['./client-tab-page.component.css']
})
export class ClientTabPageComponent {

  @ViewChild('httpClients')
  httpClients: HttpClientsComponent;

  addClient() {
    this.httpClients.addClient();
  }
}