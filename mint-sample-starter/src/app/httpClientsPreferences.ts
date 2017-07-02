// import { Dictionary } from 'app/Dictionary';
import { RequestExpansion } from 'app/requestExpansion';

/**
 * 
 */
export class HttpClientsPreference {
    maxClientTabCount: number = 10;

    definedMethods: Array<string> = new Array();

    definedHeaders: Array<Header> = new Array();

    addAllDefaultStatus() {
        this.definedMethods.push('GET');
        this.definedMethods.push('POST');
        this.definedMethods.push('PUT');
        this.definedMethods.push('PATCH');
        this.definedMethods.push('DELETE');
        this.definedMethods.push('OPTIONS');

        this.definedHeaders.push(new Header('Accept', null));
    }
}




/**
 * 
 */
export class HttpClientConfig {
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

    constructor(name: string, values: Array<string>) {
        this.name = name;
        this.values = values;
    }
}