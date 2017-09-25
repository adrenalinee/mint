import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {
  MdButtonModule,
  MdCheckboxModule,
  MdDialogModule,
  MdIconModule,
  MdInputModule,
  MdMenuModule,
  MdRadioModule,
  MdSelectModule,
  MdSidenavModule,
  MdSnackBarModule,
  MdTabsModule,
  MdToolbarModule,
  MdTooltipModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';

// import { AceEditorDirective } from 'ng2-ace-editor';
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
import { ResponseBodyBasicComponent } from './components/response-body-basic/response-body-basic.component';
import { BodyViewerHostDirective } from './components/http-response/http-response.component';
import { TextHtmlViewerComponent } from './components/expansions/text-html-viewer/text-html-viewer.component';
import { SafeHtmlPipe } from './components/expansions/text-html-viewer/text-html-viewer.component';
import { ClientTabPageComponent } from './pages/client-tab-page.component';
import { SingleClientComponent } from './pages/single-client/single-client.component';

const appRoutes: Routes = [
  { path: 'clients', component: ClientTabPageComponent },
  { path: 'client', component: SingleClientComponent },
  { path: '', redirectTo: '/clients', pathMatch: 'full' }
];

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
    HttpClientComponent,
    ResponseBodyBasicComponent,
    BodyViewerHostDirective,
    TextHtmlViewerComponent,
    SafeHtmlPipe,
    ClientTabPageComponent,
    SingleClientComponent
  ],
  entryComponents: [
    AuthorizationBasicComponent,
    BuilderDialogComponent,
    TextPlainComponent,
    XWwwFormUrlencodedComponent,
    ResponseBodyBasicComponent,
    TextHtmlViewerComponent
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    FlexLayoutModule,
    FormsModule,
    HttpModule,
    MdButtonModule,
    MdCheckboxModule,
    MdDialogModule,
    MdIconModule,
    MdInputModule,
    MdMenuModule,
    MdRadioModule,
    MdSelectModule,
    MdSidenavModule,
    MdSnackBarModule,
    MdTabsModule,
    MdToolbarModule,
    MdTooltipModule,
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
