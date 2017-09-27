import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TextPlainComponent } from './text-plain.component';

describe('TextPlainComponent', () => {
  let component: TextPlainComponent;
  let fixture: ComponentFixture<TextPlainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TextPlainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TextPlainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
