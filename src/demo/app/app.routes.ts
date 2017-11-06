import { Routes } from '@angular/router';
import { HomeComponent } from './home';
import { NoContentComponent } from './no-content';
import { DetailComponent } from './detail/detail.component';
import { SingleClientComponent } from './single-client/single-client.component';
import {MultiClientTabComponent} from './multi-client/multi-client-tab.component';

export const ROUTES: Routes = [
  // { path: '',      component: HomeComponent },
  { path: '', redirectTo: '/clients', pathMatch: 'full' },
  { path: 'home',  component: HomeComponent },
  { path: 'detail',  component: DetailComponent },
  { path: 'clients', component: MultiClientTabComponent },
  { path: 'client', component: SingleClientComponent },
  { path: '**',    component: NoContentComponent },
];
