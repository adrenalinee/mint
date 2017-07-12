import { RequestExpansion } from 'app/requestExpansion';
import { NameValue } from 'app/requestInfo';

/**
 * 
 */
export class HttpClientsPreference {
    maxClientTabCount: number = 10;

    // definedMethods: Array<string> = new Array();

    // definedHeaders: Array<Header> = new Array();

    // addAllDefaultStatus() {
    //     this.definedMethods.push('GET');
    //     this.definedMethods.push('POST');
    //     this.definedMethods.push('PUT');
    //     this.definedMethods.push('PATCH');
    //     this.definedMethods.push('DELETE');
    //     this.definedMethods.push('OPTIONS');

    //     this.definedHeaders.push(new Header('Accept', null));
    // }
}

/**
 * 
 */
export class HttpClientConfig {
    private name: string;

    private requestExpansions: Array<RequestExpansion>;

    private definedRequestInfo: DefinedRequestInfo;
}

// export class Header {
//     name: string;
//     values: Array<string>;

//     constructor(name: string, values: Array<string>) {
//         this.name = name;
//         this.values = values;
//     }
// }

// export class Status {
//     code: number;
//     text: string;
//     description: string;
// }

/**
 * 미리 정의된 request 정보, http client 를 생성하자마자 입력된 값을 보여주려고 할때 사용
 * 여기에 지정된 내용들은 기본적으로 client 에서 지우거나 수정할 수 없다.
 */
export class DefinedRequestInfo {
    url: string;
    method: string = 'GET';
    queryParams: Array<NameValue> = [new NameValue(null, null)];
    urlParams: Array<NameValue> = [new NameValue(null, null)];

    headers: Array<NameValue> = [new NameValue(null, null)];
    body: string;
}