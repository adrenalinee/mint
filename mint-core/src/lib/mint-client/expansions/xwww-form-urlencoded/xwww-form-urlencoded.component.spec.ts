import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { XWwwFormUrlencodedComponent } from './xwww-form-urlencoded.component';

describe('XWwwFormUrlencodedComponent', () => {
  let component: XWwwFormUrlencodedComponent;
  let fixture: ComponentFixture<XWwwFormUrlencodedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ XWwwFormUrlencodedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(XWwwFormUrlencodedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
