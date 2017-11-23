import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialog, MatDialogRef } from '@angular/material';
import { RequestExpander } from '../requestExpansions';

@Component({
  selector: 'app-builder-dialog',
  templateUrl: './builder-dialog.component.html',
})
export class BuilderDialogComponent implements OnInit {
  expanderView: ExpanderView;

  constructor(
    private dialog: MatDialog,
    private dialogRef: MatDialogRef<BuilderDialogComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any) { }

  ngOnInit() {
    this.expanderView = new ExpanderView();
    this.expanderView.title = this.data.title;
    this.expanderView.expanders = this.data.expanders;
    this.expanderView.selectedExpander = this.data.selectedExpander;
  }

  openBuilder() {
    const selectedBuilder: RequestExpander = this.expanderView.selectedExpander;
    if (selectedBuilder.component == null) {
      console.warn('not registered builder component!!');
      return;
    }

    this.dialog.open(selectedBuilder.component, {
      disableClose: true,
      data: {
        viewModel: selectedBuilder.viewModel
      }
    })
    .afterClosed()
    .subscribe(data => {
      if (data != null) {
        selectedBuilder.viewModel = data.viewModel;
        this.dialogRef.close({
          value: data.value,
          selectedExpander: this.expanderView.selectedExpander
        });
      }
    });
  }

  close() {
    this.dialogRef.close();
  }
}

export class ExpanderView {
  title: string;
  selectedExpander: RequestExpander;
  expanders: Array<RequestExpander>;
}
