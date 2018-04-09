/**
 * http client tab 전체를 관리하는 환경 설정 값 객체
 */
export class HttpClientsPreference {
  /**
   * 허용하는 탭의 최대 갯수
   */
  maxClientTabCount = 10;

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

// /**
//  * http client 의 설정 정보
//  */
// export class HttpClientConfig {
//   /**
//    * clinet 의 이름. tab 에서 tab의 이름이 된다.
//    */
//   private name: string;
//
//   /**
//    * 기본적으로 추가되어 있는 확장. RequestExpansion 설명 참조
//    */
//   private requestExpansions: Array<RequestExpansion>;
//
//   /**
//    * 기본 지정된 요청 정보. DefinedRequestInfo 설명 참조
//    */
//   private definedRequestInfo: DefinedRequestInfo;
// }
//
// // export class Header {
// //     name: string;
// //     values: Array<string>;
//
// //     constructor(name: string, values: Array<string>) {
// //         this.name = name;
// //         this.values = values;
// //     }
// // }
//
// // export class Status {
// //     code: number;
// //     text: string;
// //     description: string;
// // }
//
// /**
//  * 미리 정의된 request 정보, http client 를 생성하자마자 입력된 값을 보여주려고 할때 사용
//  * 여기에 지정된 내용들은 기본적으로 client 에서 지우거나 수정할 수 없다.
//  */
// export class DefinedRequestInfo {
//   url: string;
//   method: string = 'GET';
//   queryParams: Array<NameValue> = [new NameValue()];
//   urlParams: Array<NameValue> = [new NameValue()];
//
//   headers: Array<NameValue> = [new NameValue()];
//   body: string;
// }
