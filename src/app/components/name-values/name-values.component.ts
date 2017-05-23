import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
import { NameValue } from 'app/nameValue';
import { Dictionary } from 'app/Dictionary';
import { HeaderBuilder } from 'app/requestExpansion';
import { BuilderDialogComponent } from 'app/components/builder-dialog/builder-dialog.component';

@Component({
  selector: 'app-name-values',
  templateUrl: './name-values.component.html',
  styleUrls: ['./name-values.component.css']
})
export class NameValuesComponent implements OnInit {
  @Input() nameValueBuilders: Array<Dictionary<HeaderBuilder>>;

  @Input() nameValues: Array<NameValue>;

  nameValueMeta: Array<{
    enableBuilder: boolean,
    selectedBuilder: number
  }> = new Array();

  // headerBuilders: Dictionary<HeaderBuilder> = new Dictionary<HeaderBuilder>();

  constructor(private dialog: MdDialog) { }

  ngOnInit() {
    if (this.nameValueBuilders == null) {
      this.nameValueBuilders = new Array();
    }

  }

  findBuilder(selectedIndex) {
    //TODO rxjs 로 변경 예정
    const header: NameValue = this.nameValues[selectedIndex];

    const headerBuilder = this.nameValueBuilders.find(b => b[header.name] != null);
    if (headerBuilder != null) {
      this.nameValues[selectedIndex].builder = true;
    } else {
      this.nameValues[selectedIndex].builder = false;
    }
  }

  openBuilder(header: NameValue) {
    const matchedHeaderBuilders: Array<HeaderBuilder> =
      this.nameValueBuilders
        .filter(builder => builder[header.name] != null)
        .map(builder => builder[header.name]);

    this.dialog.open(BuilderDialogComponent, {
      data: {
        title: header.name + ' Builder Select',
        builders: matchedHeaderBuilders
      }
    })
    .afterClosed()
    .subscribe(data => {
      if (data != null) {
        if (data.value != null) {
          header.value = data.value;
        }
      }
    });
  }

  addNameValue(selectedIndex) {
    if (selectedIndex == this.nameValues.length - 1) {
      this.nameValues.push(new NameValue(null, null));
    }
  }

  checkForNext(selectedIndex) {
    if (selectedIndex < this.nameValues.length - 1) {
      let currentHeader: NameValue = this.nameValues[selectedIndex];
      if (currentHeader.name == null && currentHeader.value == null) {
        if (selectedIndex + 1 == this.nameValues.length - 1) {
          this.nameValues.pop();
        }
      }
    }
  }
}
