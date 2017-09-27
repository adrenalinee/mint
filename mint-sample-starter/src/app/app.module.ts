import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';

import { MintClientModule } from 'mint-core';


// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { HttpClientsComponent } from './components/http-clients/http-clients.component';
import { ClientTabPageComponent } from './pages/client-tab-page.component';
import { SingleClientComponent } from './pages/single-client/single-client.component';

const appRoutes: Routes = [
  { path: 'clients', component: ClientTabPageComponent },
  { path: 'client', component: SingleClientComponent },
  { path: '', redirectTo: '/clients', pathMatch: 'full' }
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HttpClientsComponent,
    ClientTabPageComponent,
    SingleClientComponent
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    MintClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true }
    )
    // NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
