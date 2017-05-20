import { Component, OnInit, Inject } from '@angular/core';
import { MdDialog, MdDialogRef, MD_DIALOG_DATA } from '@angular/material';

@Component({
  selector: 'app-authorization-basic',
  templateUrl: './authorization-basic.component.html',
  styleUrls: ['./authorization-basic.component.css']
})
export class AuthorizationBasicComponent implements OnInit {
  basicAuthView: BasicAuthView;

  constructor(
    private dialogRef: MdDialogRef<AuthorizationBasicComponent>,
    @Inject(MD_DIALOG_DATA) private data: any) { }

  ngOnInit() {
    console.log(this.data);

    this.basicAuthView = this.data.viewModel;
    if (this.basicAuthView == null) {
      this.basicAuthView = new BasicAuthView();
    }
  }

  apply() {
    const authorization = 'Basic ' + btoa(this.basicAuthView.username + ":" + this.basicAuthView.password);
    this.dialogRef.close({
      value: authorization,
      viewModel: this.basicAuthView
    });
  }

  close() {
    this.dialogRef.close();
  }
}

class BasicAuthView {
  username: string;
  password: string;
}