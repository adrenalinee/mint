import { NameValue } from './requestViews';
import {RequestExpander} from './requestExpansions';
import {ClientExpansionRegister, ClientExpansionRegistry} from './httpClientConfigurer';
import {TextHtmlViewerComponent} from './expansions/text-html-viewer/text-html-viewer.component';
import {AuthorizationBasicComponent} from './expansions/authorization-basic/authorization-basic.component';
import {TextPlainComponent} from './expansions/text-plain/text-plain.component';
import {XWwwFormUrlencodedComponent} from './expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';

/**
 * http client 의 설정 정보
 */
export class HttpClientConfig {
  // private static defulatConfig: HttpClientConfig;

  // /**
  //  * clinet 의 이름. tab 에서 tab의 이름이 된다.
  //  */
  // private name: string;

  // requestExpansions: Array<RequestExpansion> = [];

  // requestExpansion: RequestExpansion;

  expansionRegister: ClientExpansionRegister;

  /**
   * 기본 지정된 요청 정보. DefinedRequestInfo 설명 참조
   */
  definedRequestInfo: DefinedRequestInfo; // = new DefinedRequestInfo();

  /**
   * DefaultRequestExpansionBuilder 를 통해 기본적인 http request 정보를 생성할 수 있는
   * expander 를 추가한다.
   */
  useDefaultExpander: Boolean = true;

  useBasicExpander: Boolean = true;

  /**
   * strict mode 에서는 미리 입력된 정보들(DefinedRequestInfo)을 지울 수 없다
   */
  useStrictMode: Boolean = false;

  static duplicate(config: HttpClientConfig): HttpClientConfig {
    return clone(config);
  }
}


/**
 * 미리 정의된 request 정보, http client 를 생성하자마자 입력된 값을 보여주려고 할때 사용
 * 여기에 지정된 내용들은 기본적으로 client 에서 지우거나 수정할 수 없다.
 */
export class DefinedRequestInfo {
  url: string;
  method = 'GET';
  queryParams = [new NameValue()];
  urlParams = [new NameValue()];

  headers = [new NameValue()];
  body: string;

  constructor() {}
}

/**
 * 
 */
export class HttpClientConfigs {
  // private static configurer = new Array<HttpClientConfigurer>();
  private static expansionRegisters = new Array<ClientExpansionRegister>();

  private static useDefaultExpander: Boolean = true;

  private static useBasicExpander: Boolean = true;

  private static useStrictMode: Boolean = false;

  static createDefaultConfig(): HttpClientConfig {
    const config = new HttpClientConfig();
    config.useDefaultExpander = HttpClientConfigs.useDefaultExpander;
    config.useBasicExpander = HttpClientConfigs.useBasicExpander;
    config.useStrictMode = HttpClientConfigs.useStrictMode;

    return config;
  }

  static addDefaultExpansionRegister(expansionRegister: ClientExpansionRegister) {
    HttpClientConfigs.expansionRegisters.push(expansionRegister);
  }

  static applyDefaultExpansions(expansionRegistry: ClientExpansionRegistry) {
    HttpClientConfigs.expansionRegisters.forEach(expansionRegister => {
      expansionRegister(expansionRegistry);
    });
  }

  static applyBasicExpander(expansionRegistry: ClientExpansionRegistry) {
    expansionRegistry.addHeaderBuilder('authorization', new RequestExpander('Basic Auth', AuthorizationBasicComponent));
    expansionRegistry.addReqBodyBuilder('application/x-www-form-urlencoded', new RequestExpander('Default', XWwwFormUrlencodedComponent));
    expansionRegistry.addReqBodyBuilder('text/plain', new RequestExpander('Request data builder', TextPlainComponent));
    expansionRegistry.addResBodyVeiwer('text/html', new RequestExpander('HTML view', TextHtmlViewerComponent));
  }
}

export function clone<T>(instance: T): T {
  const copy = new (instance.constructor as { new (): T })();
  Object.assign(copy, instance);
  return copy;
}
