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
import { BuilderDialogComponent } from './components/builder-dialog/builder-dialog.component';
import { AuthorizationBasicComponent } from './components/expansions/authorization-basic/authorization-basic.component';
import { NameValuesComponent } from './components/name-values/name-values.component';
import { XWwwFormUrlencodedComponent } from './components/expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';
import { RequestBodyComponent } from './components/request-body/request-body.component';

@NgModule({
  declarations: [
    AceEditorDirective,
    AppComponent,
    BuilderDialogComponent,
    HeaderComponent,
    HttpRequestComponent,
    HttpResponseComponent,
    HttpClientsComponent,
    AuthorizationBasicComponent,
    NameValuesComponent,
    XWwwFormUrlencodedComponent,
    RequestBodyComponent
  ],
  entryComponents: [
    BuilderDialogComponent,
    AuthorizationBasicComponent,
    XWwwFormUrlencodedComponent
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
