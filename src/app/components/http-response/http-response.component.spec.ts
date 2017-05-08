import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpResponseComponent } from './http-response.component';

describe('HttpResponseComponent', () => {
  let component: HttpResponseComponent;
  let fixture: ComponentFixture<HttpResponseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HttpResponseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpResponseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
