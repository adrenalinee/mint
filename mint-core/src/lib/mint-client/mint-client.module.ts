import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
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

  import {
    RequestView,
    RequestInfo,
    ResponseInfo,
    NameValue,
    RequestStatus
  } from './RequestViews';

  import { HttpRequestComponent } from './components/http-request/http-request.component';
  import { HttpResponseComponent } from './components/http-response/http-response.component';
  import { BuilderDialogComponent } from './components/builder-dialog/builder-dialog.component';
  import { NameValuesComponent } from './components/name-values/name-values.component';
  import { RequestBodyComponent } from './components/request-body/request-body.component';
  import { HttpClientComponent } from './http-client.component';
  import { ResponseBodyBasicComponent } from './components/response-body-basic/response-body-basic.component';
  import { BodyViewerHostDirective } from './components/http-response/http-response.component';

  import { AuthorizationBasicComponent } from './expansions/authorization-basic/authorization-basic.component';
  import { SafeHtmlPipe } from './expansions/text-html-viewer/text-html-viewer.component';
  import { TextHtmlViewerComponent } from './expansions/text-html-viewer/text-html-viewer.component';
  import { TextPlainComponent } from './expansions/text-plain/text-plain.component';
  import { XWwwFormUrlencodedComponent } from './expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';

@NgModule({
  imports: [
    CommonModule,
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
    MdTooltipModule
  ],
  exports: [
    RequestView,
    RequestInfo,
    ResponseInfo,
    NameValue,
    RequestStatus,
    AceEditorDirective,
    HttpClientComponent
  ],
  declarations: [
    RequestView,
    RequestInfo,
    ResponseInfo,
    NameValue,
    RequestStatus,
    AceEditorDirective,
    HttpClientComponent
  ],
  entryComponents: [
    AuthorizationBasicComponent,
    BuilderDialogComponent,
    TextPlainComponent,
    XWwwFormUrlencodedComponent,
    ResponseBodyBasicComponent,
    TextHtmlViewerComponent
  ]
})
export class MintClientModule { }
