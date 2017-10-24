import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';

@Component({
  selector: 'app-authorization-basic',
  templateUrl: './authorization-basic.component.html',
  styleUrls: ['./authorization-basic.component.css']
})
export class AuthorizationBasicComponent implements OnInit {
  basicAuthView: BasicAuthView;

  constructor(
    private dialogRef: MatDialogRef<AuthorizationBasicComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any) { }

  ngOnInit() {
    this.basicAuthView = this.data.viewModel;
    if (this.basicAuthView == null) {
      this.basicAuthView = new BasicAuthView();
    }
  }

  apply() {
    const authorization = 'Basic ' + btoa(this.basicAuthView.username + ':' + this.basicAuthView.password);
    this.dialogRef.close({
      value: authorization,
      viewModel: this.basicAuthView
    });
  }

  close() {
    this.dialogRef.close();
  }
}

export class BasicAuthView {
  username: string;
  password: string;
}
