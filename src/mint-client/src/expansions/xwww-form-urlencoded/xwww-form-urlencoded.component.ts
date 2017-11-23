import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';
import { NameValue } from '../../requestViews';

@Component({
  selector: 'app-xwww-form-urlencoded',
  templateUrl: './xwww-form-urlencoded.component.html',
  styleUrls: ['./xwww-form-urlencoded.component.css']
})
export class XWwwFormUrlencodedComponent implements OnInit {

  formDatas: Array<NameValue>;

  constructor(
    private dialogRef: MatDialogRef<XWwwFormUrlencodedComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any) {
      this.formDatas = this.data.viewModel;
    }

  ngOnInit() {
        if (this.formDatas == null) {
      this.formDatas = new Array<NameValue>();
      this.formDatas.push(new NameValue());
    }
  }

  apply() {
    const urlEncodedFormData = this.formDatas
      .filter(p => !p.isEmpty())
      .map(p => encodeURI(p.name) + '=' + encodeURI(p.value))
      .join('&');

    this.dialogRef.close({
      value: urlEncodedFormData,
      viewModel: this.formDatas
    });
  }

  close() {
    this.dialogRef.close();
  }
}
