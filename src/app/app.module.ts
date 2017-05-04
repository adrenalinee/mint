import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AceEditorDirective } from 'ng2-ace';
import 'brace/theme/tomorrow_night_eighties';
import 'brace/mode/json';

// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HttpRequestComponent } from './http-request/http-request.component';
import { HttpResponseComponent } from './http-response/http-response.component';
import { HttpClientComponent } from './http-client/http-client.component';

@NgModule({
  declarations: [
    AceEditorDirective,
    AppComponent,
    HeaderComponent,
    HttpRequestComponent,
    HttpResponseComponent,
    HttpClientComponent
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
