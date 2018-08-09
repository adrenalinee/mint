import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { APP_BASE_HREF } from '@angular/common';
import {MatCardModule, MatIconModule, MatButtonModule, MatToolbarModule} from '@angular/material';


import { AppComponent } from './app.component';
import { MintClientModule } from './mint-client/mint-client.module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FlexLayoutModule,
    FormsModule,
    MatButtonModule,
    MatCardModule,
    MatIconModule,
    MatToolbarModule,
    HttpClientModule,
    MintClientModule
  ],
  providers: [{ provide: APP_BASE_HREF, useValue: 'mint' }],
  bootstrap: [AppComponent]
})
export class AppModule { }
