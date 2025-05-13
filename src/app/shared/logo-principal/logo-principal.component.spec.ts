import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoPrincipalComponent } from './logo-principal.component';

describe('LogoPrincipalComponent', () => {
  let component: LogoPrincipalComponent;
  let fixture: ComponentFixture<LogoPrincipalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoPrincipalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LogoPrincipalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
