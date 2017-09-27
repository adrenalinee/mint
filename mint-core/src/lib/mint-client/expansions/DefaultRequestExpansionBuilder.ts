import { RequestExpansion } from 'app/requestExpansion';

import { AuthorizationBasicComponent } from 'app/components/expansions/authorization-basic/authorization-basic.component';
import { TextPlainComponent } from 'app/components/expansions/text-plain/text-plain.component';
import { XWwwFormUrlencodedComponent } from 'app/components/expansions/xwww-form-urlencoded/xwww-form-urlencoded.component';
import { TextHtmlViewerComponent } from 'app/components/expansions/text-html-viewer/text-html-viewer.component';

/**
 * 기본적으로 사용할 확장기능 정의 및 전달
 */
export class DefaultRequestExpansionBuilder {

    static build(): Array<RequestExpansion> {
        const requestExpansion = new RequestExpansion();
        requestExpansion.headerBuilders.add('authorization', {
          name: 'Basic Auth',
          component: AuthorizationBasicComponent
        });
        
        // requestExpansion.queryParamBuilders.add('test', {
        //   name: 'test',
        //   component: AuthorizationBasicComponent
        // });
        
        // requestExpansion.urlParamBuilders.add('test', {
        //   name: 'test',
        //   component: AuthorizationBasicComponent
        // });
        
        requestExpansion.bodyBuilders.add('application/x-www-form-urlencoded', {
          name: 'Default',
          component: XWwwFormUrlencodedComponent
        });
        requestExpansion.bodyBuilders.add('text/plain', {
          name: 'Default',
          component: TextPlainComponent
        });
        
        requestExpansion.resBodyVeiwers.add('text/html', {
          name: 'HTML View',
          component: TextHtmlViewerComponent
        });
        
        const requestExpansions = new Array();
        requestExpansions.push(requestExpansion);

        return requestExpansions;
    }
}