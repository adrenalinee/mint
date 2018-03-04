import { Routes } from '@angular/router';
import { SingleClientComponent } from './single-client/single-client.component';
import { MultiClientTabComponent } from './multi-client/multi-client-tab.component';
import { NoContentComponent } from './no-content/no-content.component';

export const ROUTES: Routes = [
  { path: '', redirectTo: '/client', pathMatch: 'full' },
  { path: 'clients', component: MultiClientTabComponent },
  { path: 'client', component: SingleClientComponent },
  { path: '**', component: NoContentComponent },
];
