import { Component, OnInit, Input } from '@angular/core';
import { MatMenuTrigger, MatSnackBar } from '@angular/material';
import { RequestView } from '../requestViews';
import { RequestExpansion } from '../requestExpansions';
import {HttpClientConfig, HttpClientConfigs} from '../httpClientConfig';
import { HttpClientsPreference } from '../httpClientsPreference';

@Component({
  selector: 'mint-http-client-tab',
  templateUrl: './http-client-tab.component.html',
  // providers: [HttpClientExpansionService]
})
export class HttpClientTabComponent implements OnInit {
  @Input() preference?: HttpClientsPreference;

  clients: SingleClient[] = [];

  /**
   * 탭 생성할때 부여할 번호. 이름을 구분하기 위해 사용
   */
  private tabCount = 1;

  /**
   * 현재 포커스를 가지고 있는 탭의 인덱스
   */
  private selectedIndex = 0;

  constructor(private snackBar: MatSnackBar) {
  }

  /**
   *
   */
  ngOnInit() {
    if (this.preference == null) {
      // TODO 기본 설정을 사용
      this.preference = new HttpClientsPreference();
    }

    this.addClient();
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
      config = HttpClientConfigs.createDefaultConfig();
    }
    
    const requestModel = new RequestView();
    const addedIndex = this.clients.push(new SingleClient(config, requestModel, 'SandBox-' + this.tabCount++));
    if (focus) {
      this.selectedIndex = addedIndex;
    }
  }

  /**
   * 클라이언트 탭 닫기
   * @param index
   */
  closeClient(index: number) {
    this.clients.splice(index, 1);
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

    const singleClient = this.clients[index];
    const httpClientConfig = HttpClientConfig.duplicate(singleClient.httpClientConfig);
    const requestModel = singleClient.requestModel.duplicate();

    const newClient = new SingleClient(httpClientConfig, requestModel, singleClient.name + ' copy');
    // TODO 필요한 정보를 모두 복사

    this.clients.splice(index + 1, 0, newClient);
  }

  /**
   * 클라이언트 탭 을 추가로 생성할 수 있는지 알려준다.
   */
  private isAvailableAddTab(): boolean {
    if (this.clients.length >= this.preference.maxClientTabCount) {
      this.snackBar.open('You can not create tabs any more .', null, {
        duration: 3000
      });
      return false;
    } else {
      return true;
    }
  }
}

class SingleClient {
  constructor(
    public httpClientConfig: HttpClientConfig,
    public requestModel: RequestView,
    public name: string) {
  }
}
