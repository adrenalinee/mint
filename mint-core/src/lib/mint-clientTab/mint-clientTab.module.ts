import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MintClientModule } from '../mint-client';

import { HttpClientTabComponent } from './http-clientTab.component';

@NgModule({
    imports: [
      CommonModule,
      MintClientModule
    ],
    exports: [
      HttpClientTabComponent
    ],
    declarations: [
      HttpClientTabComponent
    ]
  })
export class MintClientTabModule { }