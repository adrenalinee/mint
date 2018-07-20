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

export interface ClientExpansionRegister {
  (expansionRegistry: ClientExpansionRegistry);
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
  private readonly headerBuilders = new Map<string, RequestExpander[]>();

  /**
   * url parameter 값을 생성해주는 빌더
   */
  private readonly urlParamBuilders = new Map<string, RequestExpander[]>();

  /**
   * request body 를 생성해주는 빌더
   */
  private readonly reqBodyBuilders = new Map<string, RequestExpander[]>();

  /**
   * response body 를 보여주는 뷰어
   */
  private readonly resBodyVeiwers = new Map<string, RequestExpander[]>();

  addHeaderBuilder(headerName: string, expansion: RequestExpander) {
    if (!this.headerBuilders.has(headerName)) {
      this.headerBuilders.set(headerName, new Array<RequestExpander>());
    }

    this.headerBuilders.get(headerName).push(expansion);
    return this;
  }

  addUrlParamBuilder(paramName: string, expansion: RequestExpander) {
    if (!this.urlParamBuilders.has(paramName)) {
      this.urlParamBuilders.set(paramName, new Array<RequestExpander>());
    }

    this.urlParamBuilders.get(paramName).push(expansion);
    return this;
  }

  addReqBodyBuilder(contentType: string, expansion: RequestExpander) {
    if (!this.reqBodyBuilders.has(contentType)) {
      this.reqBodyBuilders.set(contentType, new Array<RequestExpander>());
    }

    this.reqBodyBuilders.get(contentType).push(expansion);
    return this;
  }

  addResBodyVeiwer(contentType: string, expansion: RequestExpander) {
    if (!this.resBodyVeiwers.has(contentType)) {
      this.resBodyVeiwers.set(contentType, new Array<RequestExpander>());
    }

    this.resBodyVeiwers.get(contentType).push(expansion);
    return this;
  }

  createRequestExpansion(): RequestExpansion {
    const requestExpansion = new RequestExpansion();
    requestExpansion.headerBuilders = this.headerBuilders;
    requestExpansion.urlParamBuilders = this.urlParamBuilders;
    requestExpansion.bodyBuilders = this.reqBodyBuilders;
    requestExpansion.resBodyVeiwers = this.resBodyVeiwers;

    return requestExpansion;
  }
}
