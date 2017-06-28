// import { Dictionary } from 'app/Dictionary';
import { RequestExpansion } from 'app/requestExpansion';

export class HttpClientsPreference {
    maxClientTabCount: number = 10;

    
}

export class HttpClientConfig {
    private definedMethods: Array<string>;

    private definedHeaders: Array<Header>;

    private requestExpansions: Array<RequestExpansion>;

    private responseStatuses: Array<Status>;

    // findDefinedHeaders(name: string): Array<Header> {
    //     return null;
    // }

    // getDefinedMethods(): Array<string> {
    //     return null;
    // }
}

export class Header {
    name: string;
    values: Array<string>;
}

export class Status {
    code: number;
    text: string;
    description: string;
}