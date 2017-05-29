import { Component, OnInit, Inject } from '@angular/core';
import { MdDialog, MdDialogRef, MD_DIALOG_DATA } from '@angular/material';
import { RequestExpander } from 'app/requestExpansion';

@Component({
  selector: 'app-builder-dialog',
  templateUrl: './builder-dialog.component.html',
  styleUrls: ['./builder-dialog.component.css']
})
export class BuilderDialogComponent implements OnInit {
  expanderView: ExpanderView;

  constructor(
    private dialog: MdDialog,
    private dialogRef: MdDialogRef<BuilderDialogComponent>,
    @Inject(MD_DIALOG_DATA) private data: any) { }

  ngOnInit() {
    this.expanderView = new ExpanderView();
    this.expanderView.title = this.data.title;
    this.expanderView.expanders = this.data.expanders;
    this.expanderView.selectedExpander = this.data.selectedExpander;
  }

  openBuilder() {
    const selectedBuilder: RequestExpander = this.expanderView.selectedExpander;

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