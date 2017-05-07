import { NameValue } from './nameValue';

export class RequestView {
    title: string;
    contentType: string = "application/json";

    reqBodyWrap: boolean = true;

    request: RequestInfo = new RequestInfo();
    response: ResponseInfo = new ResponseInfo();

    isOpenParams: boolean;
    isOpenResponse: boolean;

    resDisplayMode: string = "text";
    resBodyWrap: boolean = true;
}

export class RequestInfo {
    url: string = "http://localhost:4200/assets/test.json";
    method: string = "GET";
    queryParams: NameValue[] = [new NameValue(null, null)];
    urlParams: NameValue[] = [new NameValue(null, null)];

    headers: NameValue[] = [new NameValue(null, null)];
    body: string;
}

export class ResponseInfo {
    status: number;
    statusText: string;
    headers: NameValue[] = [];

    body: string;
}
