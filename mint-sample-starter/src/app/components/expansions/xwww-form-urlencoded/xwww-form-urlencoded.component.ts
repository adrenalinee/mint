import { Component, OnInit, Inject } from '@angular/core';
import { MdDialog, MdDialogRef, MD_DIALOG_DATA } from '@angular/material';

import { NameValue } from 'app/requestInfo';

@Component({
  selector: 'app-xwww-form-urlencoded',
  templateUrl: './xwww-form-urlencoded.component.html',
  styleUrls: ['./xwww-form-urlencoded.component.css']
})
export class XWwwFormUrlencodedComponent implements OnInit {

  formDatas: Array<NameValue>;

  constructor(
    private dialogRef: MdDialogRef<XWwwFormUrlencodedComponent>,
    @Inject(MD_DIALOG_DATA) private data: any) {
      this.formDatas = this.data.viewModel;
    }

  ngOnInit() {
        if (this.formDatas == null) {
      this.formDatas = new Array();
      this.formDatas.push(new NameValue(null, null));
    }
  }

    apply() {
    const urlEncodedFormData = this.formDatas
      .filter(p => p.name != null || p.value != null)
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
