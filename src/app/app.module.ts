import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AceEditorDirective } from 'ng2-ace';
import 'brace/theme/idle_fingers';
import 'brace/mode/json';
import 'brace/mode/xml';
import 'brace/mode/html';
import 'brace/mode/text';

// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { HttpRequestComponent } from './components/http-request/http-request.component';
import { HttpResponseComponent } from './components/http-response/http-response.component';
import { HttpClientsComponent } from './components/http-clients/http-clients.component';
import { RequestHeaderAuthorizationComponent } from './components/expansions/request-header-authorization/request-header-authorization.component';
import { BuilderDialogComponent } from './components/builder-dialog/builder-dialog.component';

@NgModule({
  declarations: [
    AceEditorDirective,
    AppComponent,
    HeaderComponent,
    HttpRequestComponent,
    HttpResponseComponent,
    HttpClientsComponent,
    RequestHeaderAuthorizationComponent,
    BuilderDialogComponent
  ],
  entryComponents: [
    RequestHeaderAuthorizationComponent
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    FlexLayoutModule,
    FormsModule,
    HttpModule,
    MaterialModule,
    // NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
