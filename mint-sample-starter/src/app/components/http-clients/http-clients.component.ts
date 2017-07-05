import { Component, OnInit, Input, ViewChild } from '@angular/core';
import { MdMenuTrigger, MdSnackBar } from '@angular/material';

import { RequestView, NameValue } from 'app/requestInfo';
import { RequestExpansion } from 'app/requestExpansion';
import { HttpClientsPreference } from 'app/httpClientsPreferences';
import { HttpClientExpansionService } from 'app/services/http-client-expansion.service';
import { AuthorizationBasicComponent } from 'app/components/expansions/authorization-basic/authorization-basic.component';
import { TextPlainComponent } from 'app/components/expansions/text-plain/text-plain.component';
import { XWwwFormUrlencodedComponent } from 'app/components/expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';
import { TextHtmlViewerComponent } from 'app/components/expansions/text-html-viewer/text-html-viewer.component';

/**
 * 
 */
@Component({
  selector: 'app-http-clients',
  templateUrl: './http-clients.component.html',
  styleUrls: ['./http-clients.component.css'],
  providers: [HttpClientExpansionService]
})
export class HttpClientsComponent implements OnInit {
  @Input() preference?: HttpClientsPreference;

  requestViews: Array<RequestView> = new Array();
  requestExpansions: Array<RequestExpansion> = new Array();

  /**
   * 탭 생성할때 부여할 번호. 이름을 구분하기 위해 사용
   */
  private tabCount = 1;

  /**
   * 현재 포커스를 가지고 있는 탭의 인덱스
   */
  private selectedIndex = 0;

  constructor(
    private httpClientExpansionService: HttpClientExpansionService,
    private snackBar: MdSnackBar) { }

  /**
   * 
   */
  ngOnInit() {
    if (this.preference == null) {
      //TODO 기본 설정을 사용
      this.preference = new HttpClientsPreference();
      // this.preference.addAllDefaultStatus();
    }

    this.addClient();

    // const requestView: RequestView = new RequestView("SandBox-" + this.tabCount++);
    // this.requestViews.push(requestView);

    const requestExpansion = new RequestExpansion();
    requestExpansion.headerBuilders.add('authorization', {
      name: 'Basic Auth',
      component: AuthorizationBasicComponent
    });
    
    requestExpansion.queryParamBuilders.add('test', {
      name: 'test',
      component: AuthorizationBasicComponent
    });
    
    requestExpansion.urlParamBuilders.add('test', {
      name: 'test',
      component: AuthorizationBasicComponent
    });
    
    requestExpansion.bodyBuilders.add('application/x-www-form-urlencoded', {
      name: 'Default',
      component: XWwwFormUrlencodedComponent
    });
    requestExpansion.bodyBuilders.add('text/plain', {
      name: 'Default',
      component: TextPlainComponent
    });

    requestExpansion.resBodyVeiwers.add('text/html', {
      name: 'HTML View',
      component: TextHtmlViewerComponent
    });

    this.requestExpansions.push(requestExpansion);
  }

  /**
   * 클라이언트 탭 추가
   * 
   * @param focus 
   * @param position 
   */
  addClient(focus: boolean = true, position?: number) {
    console.log('addClient');

    if (!this.isAvailableAddTab()) {
      return;
    }

    const requestView: RequestView = new RequestView("SandBox-" + this.tabCount++);
    const addedIndex = this.requestViews.push(requestView);
    if (focus) {
      this.selectedIndex = addedIndex;
    }
  }

  /**
   * 클라이언트 탭 닫기
   * @param index 
   */
  closeClient(index: number) {
    this.requestViews.splice(index, 1);
  }

/**
 * 입력 받은 인덱스의 탭과 같은 요청 정보가 셋팅된 클라이언트 탭을 추가
 * @param index 
 */
  duplicateClient(index: number) {
    if (!this.isAvailableAddTab()) {
      return;
    }

    const requestView: RequestView = this.requestViews[index];
    const newRequestView = new RequestView("SandBox-" + this.tabCount++);
    newRequestView.requestUrl = requestView.requestUrl;
    //TODO 필요한 정보를 모두 복사

    this.requestViews.splice(index + 1, 0, newRequestView);
  }

  /**
   * 클라이언트 탭 을 추가로 생성할 수 있는지 알려준다.
   */
  private isAvailableAddTab(): boolean {
    if (this.requestViews.length >= this.preference.maxClientTabCount) {
      this.snackBar.open('You can not create any more tabs.', null, {
        duration: 3000
      });
      return false;
    } else {
      return true;
    }
  }
}
