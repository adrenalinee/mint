import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
import { NameValue } from 'app/requestInfo';
import { Dictionary } from 'app/Dictionary';
import { RequestExpander } from 'app/requestExpansion';
import { BuilderDialogComponent } from 'app/components/builder-dialog/builder-dialog.component';

@Component({
  selector: 'app-name-values',
  templateUrl: './name-values.component.html',
  styleUrls: ['./name-values.component.css']
})
export class NameValuesComponent implements OnInit {
  @Input() nameValueBuilders: Array<Dictionary<RequestExpander>>;

  @Input() nameValues: Array<NameValue>;

  constructor(private dialog: MdDialog) { }

  ngOnInit() {
    if (this.nameValueBuilders == null) {
      this.nameValueBuilders = new Array();
    }

    if (this.nameValues == null) {
      this.nameValues = new Array();
    }
  }

  findBuilder(selectedIndex) {
    const header: NameValue = this.nameValues[selectedIndex];
    if (header.name == null) {
      return;
    }

    const headerName: string = header.name.toLowerCase();

    const headerBuilder = this.nameValueBuilders.find(b => b[headerName] != null);
    if (headerBuilder != null) {
      this.nameValues[selectedIndex].enableBuilder = true;
    } else {
      this.nameValues[selectedIndex].enableBuilder = false;
    }
  }

  openBuilder(selectedIndex) {
    const header: NameValue = this.nameValues[selectedIndex];
    const headerName: string = header.name.toLowerCase();

    const matchedHeaderBuilders: Array<RequestExpander> =
      this.nameValueBuilders
        .filter(builder => builder[headerName] != null)
        .map(builder => builder[headerName]);

    this.dialog.open(BuilderDialogComponent, {
      data: {
        title: header.name + ' Builder Select',
        expanders: matchedHeaderBuilders,
        selectedExpander: this.nameValues[selectedIndex].selectedExpander
      }
    })
    .afterClosed()
    .subscribe(data => {
      if (data != null) {
        if (data.value != null) {
          header.value = data.value;
          this.nameValues[selectedIndex].selectedExpander = data.selectedExpander;
          this.addNameValue(selectedIndex);
        }
      }
    });
  }

  addNameValue(selectedIndex) {
    if (selectedIndex == this.nameValues.length - 1) {
      this.nameValues.push(new NameValue(null, null));
    }
  }

  optimize() {
    const length = this.nameValues.length;
    if (length <= 1) {
      return;
    }

    const lastNameValue: NameValue = this.nameValues[length - 1];
    const prevLastNameValue: NameValue = this.nameValues[length - 2];
    if (this.isEmpty(lastNameValue) && this.isEmpty(prevLastNameValue)) {
      this.nameValues.pop();
    }
  }

  isEmpty(nameValue: NameValue): boolean {
    if (nameValue.value == null || nameValue.value == '') {
      if (nameValue.name == null || nameValue.name == '') {
        return true;
      }
    }
      return false;
  }

  remove(selectedIndex) {
    this.nameValues.splice(selectedIndex, 1);
  }
}