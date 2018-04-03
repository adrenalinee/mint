import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResponseBodyBasicComponent } from './response-body-basic.component';

describe('ResponseBodyBasicComponent', () => {
  let component: ResponseBodyBasicComponent;
  let fixture: ComponentFixture<ResponseBodyBasicComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResponseBodyBasicComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResponseBodyBasicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
