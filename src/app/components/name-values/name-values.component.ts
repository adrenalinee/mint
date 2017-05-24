import { Component, OnInit, Input } from '@angular/core';
import { MdDialog, MdDialogRef } from '@angular/material';
import { NameValue } from 'app/nameValue';
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

  nameValueMeta: Array<NameValueMeta> = new Array();

  constructor(private dialog: MdDialog) { }

  ngOnInit() {
    if (this.nameValueBuilders == null) {
      this.nameValueBuilders = new Array();
    }

    if (this.nameValues == null) {
      this.nameValues = new Array();
    }

    this.nameValues.forEach(b => {
      this.nameValueMeta.push(new NameValueMeta());
    });
  }

  findBuilder(selectedIndex) {
    //TODO rxjs 로 변경 예정
    const header: NameValue = this.nameValues[selectedIndex];

    const headerBuilder = this.nameValueBuilders.find(b => b[header.name] != null);
    if (headerBuilder != null) {
      this.nameValueMeta[selectedIndex].enableBuilder = true;
    } else {
      this.nameValueMeta[selectedIndex].enableBuilder = false;
    }
  }

  openBuilder(selectedIndex) {
    const header: NameValue = this.nameValues[selectedIndex];
    const matchedHeaderBuilders: Array<RequestExpander> =
      this.nameValueBuilders
        .filter(builder => builder[header.name] != null)
        .map(builder => builder[header.name]);

    this.dialog.open(BuilderDialogComponent, {
      data: {
        title: header.name + ' Builder Select',
        expanders: matchedHeaderBuilders,
        selectedExpander: this.nameValueMeta[selectedIndex].selectedExpander
      }
    })
    .afterClosed()
    .subscribe(data => {
      if (data != null) {
        if (data.value != null) {
          header.value = data.value;
          this.nameValueMeta[selectedIndex].selectedExpander = data.selectedExpander
        }
      }
    });
  }

  addNameValue(selectedIndex) {
    if (selectedIndex == this.nameValues.length - 1) {
      this.nameValues.push(new NameValue(null, null));
      this.nameValueMeta.push(new NameValueMeta());
    }
  }

  checkForNext(selectedIndex) {
    if (selectedIndex < this.nameValues.length - 1) {
      let currentHeader: NameValue = this.nameValues[selectedIndex];
      if (currentHeader.name == null && currentHeader.value == null) {
        if (selectedIndex + 1 == this.nameValues.length - 1) {
          this.nameValues.pop();
          this.nameValueMeta.pop();
        }
      }
    }
  }
}

class NameValueMeta {
  enableBuilder: boolean = false;
  selectedExpander: RequestExpander;
}