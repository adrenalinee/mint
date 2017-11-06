import { Component, ViewChild } from '@angular/core';

import { HttpClientsComponent } from 'app/components/http-clients/http-clients.component';
import { HttpClientTabComponent } from '../../../mintClient/src/http-client-tab/http-client-tab.component';

@Component({
  styles: [
    '.app-action { z-index: 100000; display: inline-block; position: fixed; bottom: 20px; right: 20px; }'
  ],
  template: `
  <span class="app-action">
  <button mat-fab
    matTooltip="add Sandbox client"
    matTooltipPosition="above"
    (click)="addClient()"><mat-icon>add</mat-icon></button>
</span>

<app-http-clients #httpClients></app-http-clients>`
})
export class MultiClientTabComponent {

  @ViewChild('httpClients')
  httpClients: HttpClientTabComponent;

  addClient() {
    this.httpClients.addClient();
  }
}