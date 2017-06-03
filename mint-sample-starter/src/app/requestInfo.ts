import { RequestExpander } from 'app/requestExpansion';

export class RequestView {
    title: string;

    requestUrl: string = "http://localhost:4200/assets/test.json";
    contentType: string = "application/json";
    isOpenParams: boolean;
    paramTebSelectedIndex: number;

    reqDisplayMode: string = "text";
    reqBodyWrap: boolean = true;
    // reqSyntaxHightlight: boolean = false;
    // headerBuilders: Array<NameValue> = new Array();

    isOpenResponse: boolean;
    resDisplayMode: string = "text";
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
    method: string = "GET";
    queryParams: Array<NameValue> = [new NameValue(null, null)];
    urlParams: Array<NameValue> = [new NameValue(null, null)];

    headers: Array<NameValue> = [new NameValue(null, null)];
    body: string;
}

export class ResponseInfo {
    status: number;
    statusText: string;
    headers: Array<NameValue> = new Array();

    body: string;
}

export class NameValue {
    name: string;
    value: string;

    enableBuilder?: boolean = false;
    selectedExpander?: RequestExpander;
    showCloseButton?: boolean;

    constructor(name: string, value: string) {
        this.name = name;
        this.value = value;
    }
}