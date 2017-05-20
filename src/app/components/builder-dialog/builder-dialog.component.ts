import { Component, OnInit, Inject } from '@angular/core';
import { MdDialog, MdDialogRef, MD_DIALOG_DATA } from '@angular/material';
import { HeaderBuilder } from 'app/requestExpansion';

@Component({
  selector: 'app-builder-dialog',
  templateUrl: './builder-dialog.component.html',
  styleUrls: ['./builder-dialog.component.css']
})
export class BuilderDialogComponent implements OnInit {
  builderView: BuilderView;

  constructor(
    private dialog: MdDialog,
    private dialogRef: MdDialogRef<BuilderDialogComponent>,
    @Inject(MD_DIALOG_DATA) private data: any) { }

  ngOnInit() {
    this.builderView = new BuilderView();
    this.builderView.title = this.data.title;
    this.builderView.builders = this.data.builders;
  }

  openBuilder() {
    const selectedBuilder: HeaderBuilder = this.builderView.selectedBuilder;

    this.dialog.open(selectedBuilder.builder, {
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
          value: data.value
        });
      }
    });
  }

  close() {
    this.dialogRef.close();
  }
}

export class BuilderView {
  title: string;
  selectedBuilder: HeaderBuilder;
  builders: Array<HeaderBuilder>;
}