import { Component, ViewChild } from '@angular/core';

import { HttpClientsComponent } from 'mintClient/http-client/http-client.component';

@Component({
  selector: 'app-client-tab-page',
  styleUrls: ['./client-tab-page.component.css'],
  template: `
<span class="app-action">
    <button mat-fab
        matTooltip="add Sandbox client"
        matTooltipPosition="above"
        (click)="addClient()">
        <mat-icon>add</mat-icon>
    </button>
</span>

<app-http-client #httpClients></app-http-client>
  `
})
export class ClientTabPageComponent {

  @ViewChild('httpClients')
  httpClients: HttpClientsComponent;

  addClient() {
    this.httpClients.addClient();
  }
}
