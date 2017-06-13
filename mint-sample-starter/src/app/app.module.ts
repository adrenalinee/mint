import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AceEditorDirective } from 'ng2-ace';
import 'brace/theme/idle_fingers';
import 'brace/theme/dawn';
import 'brace/mode/css';
import 'brace/mode/html';
import 'brace/mode/javascript';
import 'brace/mode/json';
import 'brace/mode/text';
import 'brace/mode/properties';
import 'brace/mode/xml';


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
import { TextPlainComponent } from './components/expansions/text-plain/text-plain.component';
import { HttpClientComponent } from './components/http-client/http-client.component';

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
    RequestBodyComponent,
    TextPlainComponent,
    HttpClientComponent
  ],
  entryComponents: [
    AuthorizationBasicComponent,
    BuilderDialogComponent,
    TextPlainComponent,
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
