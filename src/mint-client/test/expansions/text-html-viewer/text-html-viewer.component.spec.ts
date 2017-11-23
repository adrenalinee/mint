import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TextHtmlViewerComponent } from './text-html-viewer.component';

describe('TextHtmlViewerComponent', () => {
  let component: TextHtmlViewerComponent;
  let fixture: ComponentFixture<TextHtmlViewerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TextHtmlViewerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TextHtmlViewerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
