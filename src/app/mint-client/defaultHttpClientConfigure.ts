import {ClientExpansionRegistry, HttpClientConfigurer, HttpMethodRegistry} from './httpClientConfigurer';
import {DefinedRequestInfo} from './httpClientConfig';
import {AuthorizationBasicComponent} from './expansions/authorization-basic/authorization-basic.component';
import {RequestExpander} from './requestExpansions';
import {XWwwFormUrlencodedComponent} from './expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';
import {TextHtmlViewerComponent} from './expansions/text-html-viewer/text-html-viewer.component';
import {TextPlainComponent} from './expansions/text-plain/text-plain.component';

/**
 *
 */
export class DefaultHttpClientConfigere extends HttpClientConfigurer {

  addRequestExpansion(expansionRegistry: ClientExpansionRegistry) {
    expansionRegistry.addHeaderBuilder('authorization', new RequestExpander('Basic Auth', AuthorizationBasicComponent));
    expansionRegistry.addReqBodyBuilder('application/x-www-form-urlencoded', new RequestExpander('Default', XWwwFormUrlencodedComponent));
    expansionRegistry.addReqBodyBuilder('text/plain', new RequestExpander('Request data builder', TextPlainComponent));
    expansionRegistry.addResBodyVeiwer('text/html', new RequestExpander('HTML view', TextHtmlViewerComponent));
  }

  configureDefinedRequestInfo(definedRequestInfo: DefinedRequestInfo) {
  }

  configureAvailableHttpMethod(httpMethodRegistry: HttpMethodRegistry) {
    // httpMethodRegistry.addHttpMethod();
  }

}
