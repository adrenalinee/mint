import { NameValue } from './nameValue';

export class RequestInfo {
    title: string;
    url: string;
    method: string = "GET";
    queryParams: NameValue[] = [new NameValue(null, null)];
    urlParams: NameValue[] = [new NameValue(null, null)];

    headers: NameValue[] = [new NameValue(null, null)];
    body: string;
    contentType: string = "application/json";

    response: ResponseInfo;

    isOpenParams: boolean;
    isOpenResponse: boolean;
}

export class ResponseInfo {
    status: number;
    headers: NameValue[] = [new NameValue(null, null)];

    body: string;
    format: string = "JSON";

    displayMethod = "formatted";
}
