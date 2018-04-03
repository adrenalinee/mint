import { NameValue } from './requestViews';
import { RequestExpansion } from './requestExpansions';
import { DefaultRequestExpansionBuilder } from './expansions/DefaultRequestExpansionBuilder';

/**
 * http client 의 설정 정보
 */
export class HttpClientConfig {
  // /**
  //  * clinet 의 이름. tab 에서 tab의 이름이 된다.
  //  */
  // private name: string;

  /**
   * 기본적으로 추가되어 있는 확장. RequestExpansion 설명 참조
   */
requestExpansions: Array<RequestExpansion> = [];

  /**
   * 기본 지정된 요청 정보. DefinedRequestInfo 설명 참조
   */
  definedRequestInfo: DefinedRequestInfo = new DefinedRequestInfo();

  /**
   * DefaultRequestExpansionBuilder 를 통해 기본적인 http request 정보를 생성할 수 있는
   * expander 를 추가한다.
   * @type {boolean}
   */
  useDefaultExpander: Boolean = true;

  /**
   * TODO
   * strict mode 에서는 미리 입력된 정보들(DefinedRequestInfo)을 지울 수 없다
   * @type {boolean}
   */
  useStrictMode: Boolean = false;
}


/**
 * 미리 정의된 request 정보, http client 를 생성하자마자 입력된 값을 보여주려고 할때 사용
 * 여기에 지정된 내용들은 기본적으로 client 에서 지우거나 수정할 수 없다.
 */
export class DefinedRequestInfo {
  url: string;
  method = 'GET';
  queryParams: Array<NameValue> = [new NameValue()];
  urlParams: Array<NameValue> = [new NameValue()];

  headers: Array<NameValue> = [new NameValue()];
  body: string;
}

/**
 *
 */
export class HttpClientConfigs {
  private static defulatConfig?: HttpClientConfig;

  // private static requestExpansions: Array<RequestExpansion>;
  private static useDefaultExpander: Boolean = true;

  private static useStrictMode: Boolean = false;

  private static definedRequestInfo = (): DefinedRequestInfo => {
    return new DefinedRequestInfo();
  }

  static requestExpansion = (): RequestExpansion => {
    // return new RequestExpansion();
    return DefaultRequestExpansionBuilder.build();
  }

  // static create(): HttpClientConfig {
  //   return new HttpClientConfig();
  // }

  static setDefault(config: HttpClientConfig) {
    this.defulatConfig = config;
  }

  static createDefault(): HttpClientConfig {
    return this.duplicate(this.defulatConfig);

    // const config = new HttpClientConfig();
    // config.useDefaultExpander = HttpClientConfigs.useDefaultExpander;
    // config.useStrictMode = HttpClientConfigs.useStrictMode;
    // config.definedRequestInfo = HttpClientConfigs.definedRequestInfo();
    // config.requestExpansions.push(HttpClientConfigs.requestExpansion());
    //
    // return config;
  }

  static duplicate(source: HttpClientConfig): HttpClientConfig {
    // const json = JSON.stringify(source);
    // console.log(json);
    // const config: HttpClientConfig = JSON.parse(json);
    // console.log(config.definedRequestInfo.url);
    //
    // return config;

    return null;

    // const config = new HttpClientConfig();
    // config.useStrictMode = source.useStrictMode;
    // config.useDefaultExpander = source.useDefaultExpander;
    //
    // if (source.definedRequestInfo != null) {
    //   const requestInfo = new DefinedRequestInfo();
    //   requestInfo.method = source.definedRequestInfo.method;
    //   requestInfo.body = source.definedRequestInfo.body;
    //   // TODO
    //   config.definedRequestInfo = requestInfo;
    // }
    //
    // return config;
  }

}
