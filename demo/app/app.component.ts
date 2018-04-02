/**
 * Angular 2 decorators and services
 */
import {
  Component,
  OnInit,
  ViewEncapsulation
} from '@angular/core';
import { AppState } from './app.service';
import { HttpClientConfigs } from '../../mint-client/src/httpClientConfig';
import { RequestExpander, RequestExpansion } from '../../mint-client/src/requestExpansions';
import { AuthorizationBasicComponent } from '../../mint-client/src/expansions/authorization-basic/authorization-basic.component';

/**
 * App Component
 * Top Level Component
 */
@Component({
  selector: 'app-root',
  encapsulation: ViewEncapsulation.None,
  styleUrls: [
    './app.component.css'
  ],
  template: `
      <app-header></app-header>

      <div class="content-container">
          <router-outlet></router-outlet>
      </div>`
})
export class AppComponent implements OnInit {
  public angularclassLogo = 'assets/img/angularclass-avatar.png';
  public name = 'Angular 2 Webpack Starter';
  public url = 'https://twitter.com/AngularClass';

  constructor(public appState: AppState) {
    HttpClientConfigs.requestExpansion = () => {
      const requestExpansion = new RequestExpansion();
      requestExpansion.queryParamBuilders.set('test', new RequestExpander('test param', AuthorizationBasicComponent));
      return requestExpansion;
    };
  }

  public ngOnInit() {
    console.log('Initial App State', this.appState.state);
  }

}

/**
 * Please review the https://github.com/AngularClass/angular2-examples/ repo for
 * more angular app examples that you may copy/paste
 * (The examples may not be updated as quickly. Please open an issue on github for us to update it)
 * For help or questions please contact us at @AngularClass on twitter
 * or our chat on Slack at https://AngularClass.com/slack-join
 */
