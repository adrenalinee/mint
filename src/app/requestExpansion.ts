import { ComponentType } from '@angular/material';
import { Dictionary } from 'app/Dictionary';
// import { RequestHeaderAuthorizationComponent } from 'app/components/expansions/request-header-authorization/request-header-authorization.component';

/**
 * http client 에 확장 포인트를 정의
 * 여기서 말하는 확장이라함은 http request의 구성 요소를 그냥 text로 작성하는 방식이 아닌
 * 좀더 쉬운 방법을 제공해주는 역할과 response 데이터도 단순히 text가 아닌 정형화된 형태로
 * 보여줄수 있는 방법을 말한다.
 * 확장은 http request 의 구성요소중 지정된 요소에 대해서 가능하며 하나의 http request 에
 * 여러거의 확장 객체를 가질 수 있다.
 */
export class RequestExpansion {
    headerBuilders: Dictionary<HeaderBuilder> = new Dictionary<HeaderBuilder>();
}

export class Builder {
    name: string;
}

export class HeaderBuilder implements Builder {
    name: string;
    builder: ComponentType<any>;
    viewModel: any = {};
}