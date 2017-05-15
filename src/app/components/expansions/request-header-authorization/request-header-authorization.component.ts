import { Component, OnInit, Inject } from '@angular/core';
import { MdDialog, MdDialogRef, MD_DIALOG_DATA } from '@angular/material';

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

  authTypes: Array<{name: string, value: string}> = new Array();

  constructor(
    private dialogRef: MdDialogRef<RequestHeaderAuthorizationComponent>,
    @Inject(MD_DIALOG_DATA) private data: any) { }

  ngOnInit() {
    console.log(this.data);

    this.authBuilderView = this.data.viewModel;

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
    this.dialogRef.close({
      value: authorization,
      viewModel: this.authBuilderView
    });
  }
}

class AuthorizationBuilderView {
  selectedAuthType: string;
  account: {username: string, password: string} = {
    username: null,
    password: null
  };
}