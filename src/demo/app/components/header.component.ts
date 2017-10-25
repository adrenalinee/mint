import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  template: `
<mat-toolbar color="primary">
    <span>Mint Sample App</span>
    <button mat-button routerLink="/clients">multi client</button>
    <button mat-button routerLink="/client">single client</button>
    <span fxFlex></span>
    <button mat-icon-button mdTooltip="Help">
        <mat-icon>help</mat-icon>
    </button>
    <button mat-icon-button [matMenuTriggerFor]="menu">
        <mat-icon>more_vert</mat-icon>
    </button>
    <mat-menu #menu="matMenu">
        <button mat-menu-item>
        <mat-icon>settings</mat-icon>
        <span>Preferrence</span>
        </button>
        <button mat-menu-item>
        <mat-icon>info</mat-icon>
        <span>About</span>
        </button>
    </mat-menu>
</mat-toolbar>
  `
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
