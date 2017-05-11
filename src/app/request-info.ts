import { NameValue } from './nameValue';

export class RequestView {
    title: string;

    contentType: string = "application/json";
    isOpenParams: boolean;
    reqDisplayMode: string = "text";
    reqBodyWrap: boolean = true;
    reqSyntaxHightlight: boolean = false;
    headerBuilders: Array<NameValue> = new Array();


    isOpenResponse: boolean;
    resDisplayMode: string = "text";
    resBodyWrap: boolean = true;
    resSyntaxHightlight: boolean = false;

    request: RequestInfo = new RequestInfo();
    response: ResponseInfo = new ResponseInfo();

    constructor(title: string) {
        this.title = title;
    }
}

export class RequestInfo {
    url: string = "http://localhost:4200/assets/test.json";
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
