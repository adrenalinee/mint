import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { MaterialModule } from '@angular/material';

import { HttpClientsComponent } from './http-clients.component';
import { HttpClientComponent } from 'app/components/http-client/http-client.component';

describe('HttpClientsComponent', () => {
  let component: HttpClientsComponent;
  let fixture: ComponentFixture<HttpClientsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        HttpClientsComponent,
        HttpClientComponent
      ],
      imports: [
        MaterialModule
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpClientsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
