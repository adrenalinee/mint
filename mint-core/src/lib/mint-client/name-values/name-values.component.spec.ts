import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NameValuesComponent } from './name-values.component';

describe('NameValuesComponent', () => {
  let component: NameValuesComponent;
  let fixture: ComponentFixture<NameValuesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NameValuesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NameValuesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
