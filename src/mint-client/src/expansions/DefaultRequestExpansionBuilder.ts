import { RequestExpander, RequestExpansion } from '../requestExpansions';
import { AuthorizationBasicComponent } from './authorization-basic/authorization-basic.component';
import { XWwwFormUrlencodedComponent } from './xwww-form-urlencoded/xwww-form-urlencoded.component';
import { TextPlainComponent } from './text-plain/text-plain.component';
import { TextHtmlViewerComponent } from './text-html-viewer/text-html-viewer.component';

/**
 * 기본적으로 사용할 확장기능 정의 및 전달
 */
export class DefaultRequestExpansionBuilder {

    static build(): Array<RequestExpansion> {
        const requestExpansion = new RequestExpansion();
        requestExpansion.headerBuilders.set('authorization', new RequestExpander('Basic Auth', AuthorizationBasicComponent));
        requestExpansion.bodyBuilders.set('application/x-www-form-urlencoded', new RequestExpander('Default', XWwwFormUrlencodedComponent));
        requestExpansion.bodyBuilders.set('text/plain', new RequestExpander('Default', TextPlainComponent));
        requestExpansion.resBodyVeiwers.set('text/html', new RequestExpander('HTML View', TextHtmlViewerComponent));

        const requestExpansions = new Array<RequestExpansion>();
        requestExpansions.push(requestExpansion);

        return requestExpansions;
    }
}
