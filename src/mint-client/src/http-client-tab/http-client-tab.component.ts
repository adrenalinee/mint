import { Component, OnInit, Input } from '@angular/core';
import { MatMenuTrigger, MatSnackBar } from '@angular/material';
import { RequestView } from '../requestViews';
import { RequestExpansion } from '../requestExpansions';
import { DefaultRequestExpansionBuilder } from '../expansions/DefaultRequestExpansionBuilder';
import { HttpClientConfig } from '../httpClientConfig';
import { HttpClientsPreference } from '../httpClientsPreference';

@Component({
  selector: 'mint-http-client-tab',
  templateUrl: './http-client-tab.component.html',
  // providers: [HttpClientExpansionService]
})
export class HttpClientTabComponent implements OnInit {
  @Input() preference?: HttpClientsPreference;

  // requestViews: Array<RequestView> = new Array();

  // httpClientConfigs: HttpClientConfig[] = [];
  clientTabs: ClientTab[] = [];

  // requestExpansions?: Array<RequestExpansion>;

  /**
   * 탭 생성할때 부여할 번호. 이름을 구분하기 위해 사용
   */
  private tabCount = 1;

  /**
   * 현재 포커스를 가지고 있는 탭의 인덱스
   */
  private selectedIndex = 0;

  constructor(// private httpClientExpansionService: HttpClientExpansionService,
    private snackBar: MatSnackBar) {
  }

  /**
   *
   */
  ngOnInit() {
    if (this.preference == null) {
      // TODO 기본 설정을 사용
      this.preference = new HttpClientsPreference();
      // this.preference.addAllDefaultStatus();
    }

    // if (this.requestExpansions == null) {
    //   // this.requestExpansions = new Array(); //TODO 입력받은 값이 없을 경우 기본 확장 셋이 등록되어야 한다.
    //   this.requestExpansions = DefaultRequestExpansionBuilder.build();
    // }

    this.addClient();

    // const requestView: RequestView = new RequestView("SandBox-" + this.tabCount++);
    // this.requestViews.push(requestView);

    // TODO 아래 내용들은 http-clients 밖에서 정의된후 넘어와야 한다.
    // const requestExpansion = new RequestExpansion();
    // requestExpansion.headerBuilders.add('authorization', {
    //   name: 'Basic Auth',
    //   component: AuthorizationBasicComponent
    // });

    // requestExpansion.queryParamBuilders.add('test', {
    //   name: 'test',
    //   component: AuthorizationBasicComponent
    // });

    // requestExpansion.urlParamBuilders.add('test', {
    //   name: 'test',
    //   component: AuthorizationBasicComponent
    // });

    // requestExpansion.bodyBuilders.add('application/x-www-form-urlencoded', {
    //   name: 'Default',
    //   component: XWwwFormUrlencodedComponent
    // });
    // requestExpansion.bodyBuilders.add('text/plain', {
    //   name: 'Default',
    //   component: TextPlainComponent
    // });

    // requestExpansion.resBodyVeiwers.add('text/html', {
    //   name: 'HTML View',
    //   component: TextHtmlViewerComponent
    // });

    // this.requestExpansions.push(requestExpansion);
  }

  /**
   * 클라이언트 탭 추가
   *
   * @param focus 추가된 탭이 포커스를 가지게 할지 여부
   * @param position 추가될 탭의 위치, 지정하지 않으면 마지막에 추가됨
   * @param config
   */
  addClient(focus: boolean = true, position?: number, config?: HttpClientConfig) {
    console.log('addClient');

    if (!this.isAvailableAddTab()) {
      return;
    }

    // TODO config 처리..
    if (config == null) {
      config = new HttpClientConfig();
    }

    const addedIndex = this.clientTabs.push(new ClientTab(config, 'SandBox-' + this.tabCount++));
    if (focus) {
      this.selectedIndex = addedIndex;
    }


    // const requestView: RequestView = new RequestView('SandBox-' + this.tabCount++);
    // const addedIndex = this.requestViews.push(requestView);
    // if (focus) {
    //   this.selectedIndex = addedIndex;
    // }
  }

  /**
   * 클라이언트 탭 닫기
   * @param index
   */
  closeClient(index: number) {
    this.clientTabs.splice(index, 1);
  }

  /**
   * 탭 복제
   * 입력 받은 인덱스의 탭과 같은 요청 정보가 셋팅된 클라이언트 탭을 추가
   * @param index
   */
  duplicateClient(index: number) {
    if (!this.isAvailableAddTab()) {
      return;
    }

    const clientTab = this.clientTabs[index];

    const httpClientConfig = new HttpClientConfig();

    const newClientTab = new ClientTab(httpClientConfig, 'SandBox-' + this.tabCount++);
    // TODO 필요한 정보를 모두 복사

    this.clientTabs.splice(index + 1, 0, newClientTab);

    // const requestView: RequestView = this.requestViews[index];
    // const newRequestView = new RequestView('SandBox-' + this.tabCount++);
    // newRequestView.requestUrl = requestView.requestUrl;
    // // TODO 필요한 정보를 모두 복사
    //
    // this.requestViews.splice(index + 1, 0, newRequestView);
  }

  /**
   * 클라이언트 탭 을 추가로 생성할 수 있는지 알려준다.
   */
  private isAvailableAddTab(): boolean {
    if (this.clientTabs.length >= this.preference.maxClientTabCount) {
      this.snackBar.open('You can not create tabs any more .', null, {
        duration: 3000
      });
      return false;
    } else {
      return true;
    }
  }
}

class ClientTab {
  constructor(
    public httpClientConfig: HttpClientConfig,
    public name: string) {
  }
}
