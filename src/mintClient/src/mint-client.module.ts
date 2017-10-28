import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {
  MatButtonModule,
  MatCheckboxModule,
  MatDialogModule,
  MatIconModule,
  MatInputModule,
  MatMenuModule,
  MatRadioModule,
  MatSelectModule,
  MatSidenavModule,
  MatSnackBarModule,
  MatTabsModule,
  MatTooltipModule
} from '@angular/material';

import { AceEditorDirective } from 'ng2-ace';

// import { AceEditorModule } from 'ng2-ace-editor';

import 'brace/theme/idle_fingers';
import 'brace/theme/dawn';
import 'brace/mode/css';
import 'brace/mode/html';
import 'brace/mode/javascript';
import 'brace/mode/json';
import 'brace/mode/text';
import 'brace/mode/properties';
import 'brace/mode/xml';

import { AuthorizationBasicComponent } from './expansions/authorization-basic/authorization-basic.component';
import { SafeHtmlPipe } from './expansions/text-html-viewer/text-html-viewer.component';
import { TextHtmlViewerComponent } from './expansions/text-html-viewer/text-html-viewer.component';
import { TextPlainComponent } from './expansions/text-plain/text-plain.component';
import { XWwwFormUrlencodedComponent } from './expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';
import { HttpClientComponent } from './http-client/http-client.component';
import { BuilderDialogComponent } from './builder-dialog/builder-dialog.component';
import { ResponseBodyBasicComponent } from './response-body-basic/response-body-basic.component';
import { HttpRequestComponent } from './http-request/http-request.component';
import { BodyViewerHostDirective, HttpResponseComponent } from './http-response/http-response.component';
import { NameValuesComponent } from './name-values/name-values.component';
import { RequestBodyComponent } from './request-body/request-body.component';
import { RequestView } from './requestViews';

@NgModule({
  declarations: [
    AceEditorDirective,
    BuilderDialogComponent,
    HttpRequestComponent,
    HttpResponseComponent,
    AuthorizationBasicComponent,
    NameValuesComponent,
    XWwwFormUrlencodedComponent,
    RequestBodyComponent,
    TextPlainComponent,
    HttpClientComponent,
    ResponseBodyBasicComponent,
    BodyViewerHostDirective,
    TextHtmlViewerComponent,
    SafeHtmlPipe
  ],
  entryComponents: [
    AuthorizationBasicComponent,
    BuilderDialogComponent,
    TextPlainComponent,
    XWwwFormUrlencodedComponent,
    ResponseBodyBasicComponent,
    TextHtmlViewerComponent
  ],
  exports: [
    HttpClientComponent,
    RequestView
  ],
  imports: [
    CommonModule,
    FlexLayoutModule,
    FormsModule,
    HttpModule,
    // AceEditorModule,
    MatButtonModule,
    MatCheckboxModule,
    MatDialogModule,
    MatIconModule,
    MatInputModule,
    MatMenuModule,
    MatRadioModule,
    MatSelectModule,
    // MatSidenavModule,
    MatSnackBarModule,
    MatTabsModule,
    MatTooltipModule
  ]
})
export class MintClientModule {
}
