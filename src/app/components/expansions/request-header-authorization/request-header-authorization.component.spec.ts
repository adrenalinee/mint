import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestHeaderAuthorizationComponent } from './request-header-authorization.component';

describe('RequestHeaderAuthorizationComponent', () => {
  let component: RequestHeaderAuthorizationComponent;
  let fixture: ComponentFixture<RequestHeaderAuthorizationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestHeaderAuthorizationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestHeaderAuthorizationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
