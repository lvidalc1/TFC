import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gestion-categorias',
  templateUrl: './gestion-categorias.component.html',
  styleUrls: ['./gestion-categorias.component.css']
})
export class GestionCategoriasComponent implements OnInit {

  categorias = [
    { nombre: 'Pagos y efectivo', icono: 'payments' },
    { nombre: 'Suministros', icono: 'real_estate_agent' },
    { nombre: 'Impuestos', icono: 'receipt' },
    { nombre: 'Vivienda', icono: 'home' },
    { nombre: 'Alimentación', icono: 'restaurant' },
    { nombre: 'Transporte', icono: 'commute' },
    { nombre: 'Ocio', icono: 'toys_and_games' },
    { nombre: 'Salud', icono: 'vital_signs' },
    { nombre: 'Ahorro', icono: 'savings' }
  ];

  categoriaSeleccionada: string = '';
  presupuesto: number = 0;

  presupuestos: { [categoria: string]: number } = {};

  constructor() {}

  ngOnInit(): void {}

  seleccionarCategoria(nombre: string, event: Event): void {
  event.preventDefault();//evita que se recargue la página
  this.categoriaSeleccionada = nombre;
  this.presupuesto = this.presupuestos[nombre] || 0;//0 por defecto
}

  guardarPresupuesto(): void {
    this.presupuestos[this.categoriaSeleccionada] = this.presupuesto;
    console.log(`Presupuesto guardado: ${this.presupuesto} € para ${this.categoriaSeleccionada}`);
  }

  modificarCampos(): void {
    //modificar presupuesto
  }
}
