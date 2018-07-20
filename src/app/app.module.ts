import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { MatCardModule, MatIconModule, MatButtonModule } from '@angular/material';


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
    HttpClientModule,
    MintClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
