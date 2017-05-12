import { Component, OnInit } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';

@Component({
  selector: 'app-request-header-authorization',
  templateUrl: './request-header-authorization.component.html',
  styleUrls: ['./request-header-authorization.component.css']
})
export class RequestHeaderAuthorizationComponent implements OnInit {
  authBuilderView: AuthorizationBuilderView;

  // selectedAuthType: string;
  // account = {
  //   username: null,
  //   password: null
  // };

  authTypes: Array<{}> = new Array();

  constructor(private dialogRef: MdDialogRef<RequestHeaderAuthorizationComponent>) { }

  ngOnInit() {
    this.authTypes.push({
      name: 'Basic Auth',
      value: 'BasicAuth'
    });

    if (this.authBuilderView == null) {
      this.authBuilderView = new AuthorizationBuilderView();
    }
  }

  close() {
    this.dialogRef.close();
  }

  apply() {
    const account = this.authBuilderView.account;

    const authorization = 'Basic ' + btoa(account.username + ":" + account.password);
    this.dialogRef.close(authorization);
  }
}

class AuthorizationBuilderView {
  selectedAuthType: string;
  account = {
    username: null,
    password: null
  };
}