import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';
import { NameValue } from '../../requestViews';

@Component({
  selector: 'app-text-plain',
  templateUrl: './text-plain.component.html',
  styleUrls: ['./text-plain.component.css']
})
export class TextPlainComponent implements OnInit {

  formDatas: Array<NameValue>;

  constructor(
    private dialogRef: MatDialogRef<TextPlainComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any) {
      this.formDatas = this.data.viewModel;
    }

  ngOnInit() {
        if (this.formDatas == null) {
      this.formDatas = new Array();
      this.formDatas.push(new NameValue());
    }
  }

  apply() {
    const textPlainFormData = this.formDatas
      .filter(p => p.name != null || p.value != null)
      .map(p => p.name + '=' + p.value)
      .join('\n');

    this.dialogRef.close({
      value: textPlainFormData,
      viewModel: this.formDatas
    });
  }

  close() {
    this.dialogRef.close();
  }
}
