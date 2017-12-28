import { Component, OnInit, Input } from '@angular/core';
import { MatDialog } from '@angular/material';
import { NameValue } from '../requestViews';
import { RequestExpander } from '../requestExpansions';
import { BuilderDialogComponent, ExpanderView } from '../builder-dialog/builder-dialog.component';
import { isUndefined } from 'util';

@Component({
  selector: 'mint-name-values',
  templateUrl: './name-values.component.html',
})
export class NameValuesComponent implements OnInit {
  @Input() nameValueBuilders: Map<string, RequestExpander>[];

  @Input() nameValues: Array<NameValue>;

  constructor(private dialog: MatDialog) {
  }

  ngOnInit() {
    if (this.nameValueBuilders == null) {
      this.nameValueBuilders = new Array<Map<string, RequestExpander>>();
    }

    if (this.nameValues == null) {
      this.nameValues = new Array<NameValue>();
    }
  }

  findBuilder(selectedIndex: number) {
    const header: NameValue = this.nameValues[selectedIndex];
    if (header.name == null) {
      // TODO 에러 처리
      return;
    }

    const headerName: string = header.name.toLowerCase();

    const headerBuilder = this.nameValueBuilders.find(b => !isUndefined(b.get(headerName)));
    if (headerBuilder != null) {
      this.nameValues[selectedIndex].enableBuilder = true;
    } else {
      this.nameValues[selectedIndex].enableBuilder = false;
    }
  }

  openBuilder(selectedIndex: number) {
    const header: NameValue = this.nameValues[selectedIndex];
    if (header.name == null) {
      // TODO 에러 처리
      return;
    }

    // TODO 좀더 효율적인 검색 방법을 찾아야함
    const headerName: string = header.name.toLowerCase();

    const matchedHeaderBuilders: RequestExpander[] =
      this.nameValueBuilders
        .filter(builder => !isUndefined(builder.get(headerName)))
        .map(builder => <RequestExpander> builder.get(headerName));

    // TODO matchedHeaderBuilders 가 한개 항목밖에 없을 선택 다이얼로그 없이 경우 바로 빌더를 띄운다
    if (matchedHeaderBuilders.length === 1) {

    }

    this.dialog.open(BuilderDialogComponent, {
      data: new ExpanderView(
        header.name + ' Builder Select',
        this.nameValues[selectedIndex].selectedExpander,
        matchedHeaderBuilders)
      // data: {
      //   title: header.name + ' Builder Select',
      //   expanders: matchedHeaderBuilders,
      //   selectedExpander: this.nameValues[selectedIndex].selectedExpander
      // }
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

  addNameValue(selectedIndex: number) {
    if (selectedIndex === this.nameValues.length - 1) {
      this.nameValues.push(new NameValue());
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
    if (nameValue.value == null || nameValue.value === '') {
      if (nameValue.name == null || nameValue.name === '') {
        return true;
      }
    }
    return false;
  }

  /**
   * 선택된 항목을 배열에서 삭제
   * @param selectedIndex
   */
  remove(selectedIndex: number) {
    this.nameValues.splice(selectedIndex, 1);
  }

  disabled(selectedIndex: number) {
    const selectedNameValue: NameValue = this.nameValues[selectedIndex];
    selectedNameValue.enabled = false;
  }

  enabled(selectedIndex: number) {
    const selectedNameValue: NameValue = this.nameValues[selectedIndex];
    selectedNameValue.enabled = true;
  }
}
