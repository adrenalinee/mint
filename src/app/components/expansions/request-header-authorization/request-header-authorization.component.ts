import { Component, OnInit } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';

@Component({
  selector: 'app-request-header-authorization',
  templateUrl: './request-header-authorization.component.html',
  styleUrls: ['./request-header-authorization.component.css']
})
export class RequestHeaderAuthorizationComponent implements OnInit {

  constructor(public dialogRef: MdDialogRef<RequestHeaderAuthorizationComponent>) { }

  ngOnInit() {
  }

}
