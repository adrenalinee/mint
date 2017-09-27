import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpClientTabComponent } from './http-clientTab.component';

describe('HttpClientsComponent', () => {
  let component: HttpClientTabComponent;
  let fixture: ComponentFixture<HttpClientTabComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        HttpClientTabComponent,
      ],
      imports: [
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpClientTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
