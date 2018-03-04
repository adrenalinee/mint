import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  template: `
<mat-toolbar color="primary">
    <span>
      <span>Mint Demo</span>
      <button mat-button routerLink="/client" fxHide fxShow.gt-sm>client</button>
      <button mat-button routerLink="/clients" fxHide fxShow.gt-sm>client tab</button>
    </span>
    <span fxFlex></span>
    <a mat-icon-button href="https://github.com/adrenalinee/mint">
        <img src="assets/img/github-circle-white-transparent.svg"/>
    </a>
    <button mat-icon-button>
        <mat-icon>help</mat-icon>
    </button>
    <mat-toolbar-row fxShow fxHide.gt-sm>
      <span>
        <button mat-button routerLink="/client">client</button>
        <button mat-button routerLink="/clients">client tab</button>
      </span>
    </mat-toolbar-row>
</mat-toolbar>
  `
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
