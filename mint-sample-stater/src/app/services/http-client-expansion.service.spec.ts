import { TestBed, inject } from '@angular/core/testing';

import { HttpClientExpansionService } from './http-client-expansion.service';

describe('HttpClientExpansionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [HttpClientExpansionService]
    });
  });

  it('should ...', inject([HttpClientExpansionService], (service: HttpClientExpansionService) => {
    expect(service).toBeTruthy();
  }));
});
