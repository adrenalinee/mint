// import { RequestExpander } from 'app/requestExpansion';

import { RequestExpander } from './requestExpansions';
import { isNull, isUndefined } from 'util';

/**
 * 하나의 request를 화면에 그리기 위한 모든 데이터 저장
 * http client component 에서 사용
 */
export class RequestView {
    /**
     * 해당 요청의 탭에 표시될 이름
     */
    title?: string;

    /**
     * 사용자가 입력한 요청 경로
     * 이 경로가 바로 요청에 사용되지는 않고 parameter 값들을 binding 한 값을 최종 요청 경로로 사용하게 된다.
     */
    requestUrl: string; // http://localhost:4200/assets/test.json';

    /**
     * request body의 content type
     * 요청 해더에 입력한 content type을 이 필드에 따로 저장합니다.
     * 요청 바디의 syntax highlight 처리를 위해 이값을 따로 관리함
     */
    reqContentType: string = '';

    /**
     * 요청 바디를 화면에 표시할 방법
     * ace editor 에 의존적인 값으로 요청 바디를 그리는 ace editor의 syntax highlight를 지정하는 값이다.
     * 참조: https://ace.c9.io/build/kitchen-sink.html (모드 종류)
     */
    reqDisplayMode: string = 'text';

    /**
     *
     */
    isOpenParams: boolean;
    paramTebSelectedIndex: number;

    reqBodyWrap: boolean;
    enableReqBodyBuilder: boolean;
    // reqSyntaxHightlight: boolean = false;
    // headerBuilders: Array<NameValue> = new Array();


    requestStatus: RequestStatus = RequestStatus.PreSend;

    // isOpenResponse: boolean;
    resContentType: string = '';
    resDisplayMode: string = 'text';
    resBodyWrap: boolean = true;
    resBodyFormat: boolean = false;

    request: RequestInfo = new RequestInfo();
    response: ResponseInfo = new ResponseInfo();

    constructor(title?: string) {
        this.title = title;
    }
}

export class RequestInfo {
    url: string;
    method: string = 'GET';
    queryParams = [new NameValue()];
    urlParams = [new NameValue()];

    headers: Array<NameValue> = [new NameValue()];
    body: string;
}

export class ResponseInfo {
    elapseTime: number;
    status: number;
    statusText: string | null;
    headers: NameValue[] = [];

    body: string;
}

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
    showCloseButton?: boolean;
    enabled: boolean = true;

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
