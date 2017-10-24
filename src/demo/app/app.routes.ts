import { Routes } from '@angular/router';
import { HomeComponent } from './home';
import { NoContentComponent } from './no-content';
import { DetailComponent } from './detail/detail.component';

export const ROUTES: Routes = [
  { path: '',      component: HomeComponent },
  { path: 'home',  component: HomeComponent },
  { path: 'detail',  component: DetailComponent },
  { path: '**',    component: NoContentComponent },
];
