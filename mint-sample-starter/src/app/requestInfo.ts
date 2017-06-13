import { RequestExpander } from 'app/requestExpansion';

export class RequestView {
    title: string;

    requestUrl: string = 'http://localhost:4200/assets/test.json';
    reqContentType: string = '';
    reqDisplayMode: string = "text";

    isOpenParams: boolean;
    paramTebSelectedIndex: number;

    reqBodyWrap: boolean;
    enableReqBodyBuilder: boolean;
    // reqSyntaxHightlight: boolean = false;
    // headerBuilders: Array<NameValue> = new Array();

    isOpenResponse: boolean;
    resContentType: string = '';
    resDisplayMode: string = 'text';
    resBodyWrap: boolean = true;
    // resSyntaxHightlight: boolean = false;

    request: RequestInfo = new RequestInfo();
    response: ResponseInfo = new ResponseInfo();

    constructor(title: string) {
        this.title = title;
    }
}

export class RequestInfo {
    url: string;
    method: string = 'GET';
    queryParams: Array<NameValue> = [new NameValue(null, null)];
    urlParams: Array<NameValue> = [new NameValue(null, null)];

    headers: Array<NameValue> = [new NameValue(null, null)];
    body: string;
}

export class ResponseInfo {
    elapseTime: number;
    status: number;
    statusText: string;
    headers: Array<NameValue> = new Array();

    body: string;
}

export class NameValue {
    name: string;
    value: string;

    enableBuilder?: boolean;
    selectedExpander?: RequestExpander;
    showCloseButton?: boolean;

    constructor(name: string, value: string) {
        this.name = name;
        this.value = value;
    }
}