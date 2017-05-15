import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-builder-dialog',
  templateUrl: './builder-dialog.component.html',
  styleUrls: ['./builder-dialog.component.css']
})
export class BuilderDialogComponent implements OnInit {


  constructor() { }

  ngOnInit() {
  }

}

export class BuilderView {
  title: string;

  builders: Array<any>;
}