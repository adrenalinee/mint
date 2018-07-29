import { RequestExpander } from './requestExpansions';
import { isNull, isUndefined } from 'util';

/**
 * 하나의 request를 화면에 그리기 위한 모든 데이터 저장
 * http client component 에서 사용
 */
export class RequestView {
  /**
   * 해당 요청의 탭에 표시될 이름
   * //TODO client tab 쪽에서 처리해야 함
   */
  title?: string;

  /**
   * 사용자가 입력한 요청 경로
   * 이 경로가 바로 요청에 사용되지는 않고 parameter 값들을 binding 한 값을 최종 요청 경로로 사용하게 된다.
   */
  requestUrl: string; // http://localhost:4200/assets/test.json';

  /**
   * request body의 content type
   * 요청 해더에 입력한 content type을 이 필드에 따로 저장한다.
   * 요청 바디의 syntax highlight 처리를 위해 이값을 따로 관리함
   */
  reqContentType = '';

  /**
   * 요청 바디를 화면에 표시할 방법
   * ace editor 에 의존적인 값으로 요청 바디를 그리는 ace editor의 syntax highlight를 지정하는 값이다.
   * 참조: https://ace.c9.io/build/kitchen-sink.html (모드 종류)
   */
  reqDisplayMode = 'text';

  /**
   *
   */
  isOpenParams: boolean;

  /**
   *
   */
  paramTebSelectedIndex: number;

  reqBodyWrap: boolean;

  /**
   *
   */
  enableReqBodyBuilder: boolean;

  /**
   *
   */
  requestStatus: RequestStatus = RequestStatus.PreSend;

  // isOpenResponse: boolean;
  resContentType = ''; // response viewer 를 결정
  resDisplayMode = 'text'; // syntax high light 를 결정
  resBodyWrap = true;
  resBodyFormat = false;

  request: RequestInfo = new RequestInfo();
  response: ResponseInfo = new ResponseInfo();

  constructor(title?: string) {
    this.title = title;
  }

  duplicate(): RequestView {
    const requestModel = new RequestView();
    requestModel.title = this.title;
    requestModel.requestUrl = this.requestUrl;
    requestModel.reqContentType = this.reqContentType;
    requestModel.reqDisplayMode = this.reqDisplayMode;
    requestModel.isOpenParams = this.isOpenParams;
    requestModel.paramTebSelectedIndex = this.paramTebSelectedIndex;
    requestModel.reqBodyWrap = this.reqBodyWrap;
    requestModel.enableReqBodyBuilder = this.enableReqBodyBuilder;
    requestModel.resContentType = this.resContentType;
    requestModel.resDisplayMode = this.resDisplayMode;
    requestModel.resBodyWrap = this.resBodyWrap;
    requestModel.resBodyFormat = this.resBodyFormat;

    requestModel.request = this.request.duplicate();

    return requestModel;
  }
}

export class RequestInfo {
  url: string;
  method; // = 'GET';
  queryParams = [new NameValue()];
  urlParams = [new NameValue()];

  headers: Array<NameValue> = [new NameValue()];
  body: string;

  duplicate(): RequestInfo {
    const request = new RequestInfo();
    request.url = this.url;
    request.method = this.method;
    request.body = this.body;

    // TODO queryParams, urlParams, headers 복사..

    request.queryParams = this.queryParams.map(nameValue => nameValue.duplicate());
    request.urlParams = this.urlParams.map(nameValue => nameValue.duplicate());
    request.headers = this.headers.map(nameValue => nameValue.duplicate());

    return request;
  }
}

export class ResponseInfo {
  elapseTime: number;
  status: number;
  statusText: string | null;
  headers: NameValue[] = [];

  body: string | null;
}

/**
 *
 */
export class NameValue {
  name: string;

  value: string;

  /**
   * client에서 해당 이름이 고정인지 여부
   * (고정이면 지울 수 없음)
   */
  FixedName: boolean;

  /**
   * client에서 해당 값이 고정인지 여부
   * (고정이면 지울 수 없음)
   */
  FixedValue: boolean;

  enableBuilder?: boolean;

  selectedExpander?: RequestExpander;

  /**
   * 닫기 버튼을 표시할지 여부
   */
  showCloseButton?: boolean;

  /**
   * 사용중인지 알려줌
   */
  enabled = true;

  constructor(name?: string, value?: string) {
    this.name = isUndefined(name) ? '' : <string> name;
    this.value = isUndefined(value) ? '' : <string> value;
  }

  static new(name: string | null, value: string | null): NameValue {
    const nameValue = new NameValue();
    nameValue.name = isNull(name) ? '' : <string> name;
    nameValue.value = isNull(value) ? '' : <string> value;
    return nameValue;
  }

  isEmpty(): boolean {
    return this.name === '' && this.value === '';
  }

  duplicate(): NameValue {
    const nameValue = new NameValue();
    nameValue.name = this.name;
    nameValue.value = this.value;
    nameValue.FixedName = this.FixedName;
    nameValue.FixedValue = this.FixedValue;
    nameValue.enableBuilder = this.enableBuilder;
    nameValue.showCloseButton = this.showCloseButton;
    nameValue.enabled = this.enabled;





    return nameValue;
  }
}

export enum RequestStatus {
  /**
   * 초기 상태. 요청을 하지 않은 상태
   */
  PreSend,

  /**
   * 요청중. 아직 응답은 받지 못한 상태
   */
  Sending,

  /**
   * 요청 성공. 서버에서 응답을 받은 상태
   */
  SendSuccess,

  /**
   * 요청 실패. 서버에서 응답을 받지 못함
   * (서버 무응답(time out..), 인터넷 불가등..)
   */
  SendFail
}
