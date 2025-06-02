import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CabeceraPieComponent } from './cabecera-pie.component';

describe('CabeceraPieComponent', () => {
  let component: CabeceraPieComponent;
  let fixture: ComponentFixture<CabeceraPieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CabeceraPieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CabeceraPieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
