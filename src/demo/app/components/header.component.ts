import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  template: `
<mat-toolbar color="primary">
    <span>Mint Sample App</span>
    <button mat-button routerLink="/client">single client</button>
    <button mat-button routerLink="/clients">multi client</button>
    <span fxFlex></span>
    <button mat-icon-button mdTooltip="Help">
        <mat-icon>help</mat-icon>
    </button>
</mat-toolbar>
  `
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
