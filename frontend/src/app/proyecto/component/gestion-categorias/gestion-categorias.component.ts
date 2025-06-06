import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gestion-categorias',
  templateUrl: './gestion-categorias.component.html',
  styleUrls: ['./gestion-categorias.component.css']
})
export class GestionCategoriasComponent implements OnInit {

  categorias = [
    { id: 1, nombre: 'Pagos y efectivo', icono: 'payments' },
    { id: 2, nombre: 'Suministros', icono: 'real_estate_agent' },
    { id: 3, nombre: 'Impuestos', icono: 'receipt' },
    { id: 4, nombre: 'Vivienda', icono: 'home' },
    { id: 5, nombre: 'Alimentación', icono: 'restaurant' },
    { id: 6, nombre: 'Transporte', icono: 'commute' },
    { id: 7, nombre: 'Ocio', icono: 'toys_and_games' },
    { id: 8, nombre: 'Salud', icono: 'vital_signs' },
    { id: 9, nombre: 'Ahorro', icono: 'savings' }
  ];

  categoriaSeleccionada: any = null;
  presupuesto: number = 0;
  frecuencia: string = 'Mensual';
  editable: boolean = false;

  constructor(private http: HttpClient) { }

  ngOnInit(): void { }

  seleccionarCategoria(categoria: any, event: Event): void {
    event.preventDefault();//evita que se recargue la página
    this.categoriaSeleccionada = categoria;
    this.presupuesto = 0;
    this.frecuencia = 'Mensual';
    this.editable = false;
  }

  guardarPresupuesto(): void {
    if (!this.categoriaSeleccionada) return;

    const dto = {
      categoria: this.categoriaSeleccionada.id,
      presupuesto: this.presupuesto,
      frecuencia: this.frecuencia
    };

    this.http.post('/api/usuario-categorias', dto, { withCredentials: true }).subscribe({
      next: () => {
        alert(`Presupuesto guardado correctamente para ${this.categoriaSeleccionada.nombre}`);
        this.editable = false;
      },
      error: err => {
        const mensaje = err.error?.message || JSON.stringify(err.error) || 'Error desconocido';
        alert('Error al guardar: ' + mensaje);
      }
    });
  }

  modificarCampos(): void {
    //modificar presupuesto
    this.editable = true;
  }
}
