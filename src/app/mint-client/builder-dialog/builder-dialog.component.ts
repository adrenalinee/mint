import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialog, MatDialogRef } from '@angular/material';
import { RequestExpander } from '../requestExpansions';

@Component({
  selector: 'mint-builder-dialog',
  templateUrl: './builder-dialog.component.html',
})
export class BuilderDialogComponent implements OnInit {
  // expanderView: ExpanderView;

  constructor(
    private dialog: MatDialog,
    private dialogRef: MatDialogRef<BuilderDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public expanderView: ExpanderView) { }

  ngOnInit() {
    // this.expanderView = new ExpanderView();
    // this.expanderView.title = this.data.title;
    // this.expanderView.expanders = this.data.expanders;
    // this.expanderView.selectedExpander = this.data.selectedExpander;

    if (this.expanderView.expanders != null ||
      this.expanderView.selectedExpander == null) {

      if (this.expanderView.expanders.length > 0) {
        this.expanderView.selectedExpander = this.expanderView.expanders[0];
      }
    }
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
  constructor(
    public title: string,
    public selectedExpander: RequestExpander,
    public expanders: Array<RequestExpander>) { }
}
