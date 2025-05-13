import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OpcionesCategoriasComponent } from './opciones-categorias.component';

describe('OpcionesCategoriasComponent', () => {
  let component: OpcionesCategoriasComponent;
  let fixture: ComponentFixture<OpcionesCategoriasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OpcionesCategoriasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OpcionesCategoriasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
