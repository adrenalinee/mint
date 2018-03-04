import { Component, OnInit, Input } from '@angular/core';
import { MatDialog } from '@angular/material';
import { NameValue, RequestView } from '../requestViews';
import { RequestExpander } from '../requestExpansions';
import { BuilderDialogComponent, ExpanderView } from '../builder-dialog/builder-dialog.component';


@Component({
  selector: 'mint-request-body',
  templateUrl: './request-body.component.html',
  styleUrls: ['./request-body.component.css']
})
export class RequestBodyComponent implements OnInit {
  @Input() requestView: RequestView;

  @Input() reqBodyBuilders: Array<Map<string, RequestExpander>>;

  contentTypes: string[];
  displayModes: string[];

  selectedReqBodyExpander: number;

  suggestedDisplayModes = new Map<string, string>();

  constructor(private dialog: MatDialog) {
  }

  ngOnInit() {
    this.contentTypes = [
      'application/json',
      'application/xml',
      'application/x-www-form-urlencoded',
      'multipart/form-data',
      'text/html',
      'text/plain'
    ];
    this.displayModes = [
      'css',
      'html',
      'javascript',
      'json',
      'text',
      'properties',
      'xml'
    ];

    this.suggestedDisplayModes.set('application/json', 'json');
    this.suggestedDisplayModes.set('application/xml', 'xml');
    this.suggestedDisplayModes.set('application/x-www-form-urlencoded', 'text');
    this.suggestedDisplayModes.set('multipart/form-data', 'text');
    this.suggestedDisplayModes.set('text/html', 'html');
    this.suggestedDisplayModes.set('text/plain', 'properties');
    this.suggestedDisplayModes.set('text/javascript', 'javascript');
  }


  onChange(data: any) {
    console.log('onChange');
    this.requestView.request.body = data;
  }

  onChangeRequestBodyContentType() {
    const reqContentType: string = this.requestView.reqContentType;

    const displayMode = this.suggestedDisplayModes.get(reqContentType);
    if (displayMode != null) {
      this.requestView.reqDisplayMode = displayMode;
    } else {
      this.requestView.reqDisplayMode = 'text';
    }

    const reqBodyBuilder = this.reqBodyBuilders.find(builder => builder.has(reqContentType));
    if (reqBodyBuilder !== undefined) {
      this.requestView.enableReqBodyBuilder = true;
    } else {
      this.requestView.enableReqBodyBuilder = false;
    }

    const contentTypeHeader = this.requestView.request.headers
    // .filter((h: NameValue) => h.name != null)
      .find((h: NameValue) => h.name.toLowerCase() === 'content-type');

    if (contentTypeHeader != null) {
      contentTypeHeader.value = reqContentType;
    } else {
      this.requestView.request.headers.pop();
      this.requestView.request.headers.push(new NameValue('Content-Type', reqContentType));
      this.requestView.request.headers.push(new NameValue());
    }
  }

  openReqBodyBuilder() {
    const reqContentType: string = this.requestView.reqContentType;

    const matchedBuilders: RequestExpander[] =
      this.reqBodyBuilders
        .filter(builder => builder.has(reqContentType))
        .map(builder => <RequestExpander> builder.get(reqContentType));

    if (matchedBuilders.length === 1) {
      this.openBuilderDialog(matchedBuilders[0]);
    } else {
      this.openBuilderSelectDialog(matchedBuilders);
    }

    // this.dialog.open(BuilderDialogComponent, {
    //   data: {
    //     title: 'Request Body Builder Select',
    //     expanders: matchedBuilders,
    //     selectedExpander: this.selectedReqBodyExpander
    //   }
    // }).afterClosed()
    //   .subscribe((data) => {
    //     if (data != null) {
    //       if (data.value != null) {
    //         this.requestView.request.body = data.value;
    //         this.selectedReqBodyExpander = data.selectedExpander;
    //       }
    //     }
    //   });
  }

  private openBuilderSelectDialog(matchedBuilders: RequestExpander[]) {
    this.dialog.open(BuilderDialogComponent, {
      data: {
        title: 'Request Body Builder Select',
        expanders: matchedBuilders,
        selectedExpander: this.selectedReqBodyExpander
      }
    })
      .afterClosed()
      .subscribe((data) => {
        if (data != null) {
          if (data.value != null) {
            this.requestView.request.body = data.value;
            this.selectedReqBodyExpander = data.selectedExpander;
          }
        }
      });
  }

  private openBuilderDialog(reqBodyExpander: RequestExpander) {
    if (reqBodyExpander.component == null) {
      // TODO
      console.warn('not registered builder component!!');
      return;
    }

    this.dialog.open(reqBodyExpander.component, {
      disableClose: true,
      data: {
        viewModel: reqBodyExpander.viewModel
      }
    })
      .afterClosed()
      .subscribe(data => {
        if (data != null) {
          reqBodyExpander.viewModel = data.viewModel;
          this.requestView.request.body = data.value;
        }
      });
  }
}
