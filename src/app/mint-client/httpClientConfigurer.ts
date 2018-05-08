import {RequestExpander, RequestExpansion} from './requestExpansions';
import {DefinedRequestInfo} from './httpClientConfig';

/**
 * http client 의 설정 정보
 */
export abstract class HttpClientConfigurer {

  abstract addRequestExpansion(expansionRegistry: ClientExpansionRegistry);

  abstract configureDefinedRequestInfo(definedRequestInfo: DefinedRequestInfo);

  abstract configureAvailableHttpMethod(httpMethodRegistry: HttpMethodRegistry);
}


/**
 *
 */
export class HttpMethodRegistry {

  private readonly httpMethods: string[] = [];

  addHttpMethod(httpMethod: string): HttpMethodRegistry {

    return this;
  }
}

/**
 *
 */
export class ClientExpansionRegistry {

  /**
   * header 값을 생성해주는 빌더
   */
  private readonly headerBuilders = new Map<string, RequestExpander>();

  /**
   * url parameter 값을 생성해주는 빌더
   */
  private readonly urlParamBuilders = new Map<string, RequestExpander>();

  /**
   * request body 를 생성해주는 빌더
   */
  private readonly reqBodyBuilders = new Map<string, RequestExpander>();

  /**
   * response body 를 보여주는 뷰어
   */
  private readonly resBodyVeiwers = new Map<string, RequestExpander>();

  addHeaderBuilder(headerName: string, expansion: RequestExpander) {
    this.headerBuilders.set(headerName, expansion);
    return this;
  }

  addUrlParamBuilder(paramName: string, expansion: RequestExpander) {
    this.urlParamBuilders.set(paramName, expansion);
    return this;
  }

  addReqBodyBuilder(contentType: string, expansion: RequestExpander) {
    this.reqBodyBuilders.set(contentType, expansion);
    return this;
  }

  addResBodyVeiwer(contentType: string, expansion: RequestExpander) {
    this.resBodyVeiwers.set(contentType, expansion);
    return this;
  }
}
