import { ComponentType } from '@angular/material';
import { Dictionary } from 'app/Dictionary';
import { RequestHeaderAuthorizationComponent } from 'app/components/expansions/request-header-authorization/request-header-authorization.component';

export class RequestExpansion {
    headerBuilders: Dictionary = new Dictionary();
}

export class HeaderBuilder {
    name: string;
    builder: ComponentType<any>;
    viewModel: any = {};
}