import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu-lateral',
  templateUrl: './menu-lateral.component.html',
  styleUrls: ['./menu-lateral.component.css']
})
export class MenuLateralComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  selectedMenu: string = '';
  //selectedMenu es una propiedad que guarda el nombre de la opción del menú seleccionada, para así poder usar la clase activo.

  selectMenu(menu: string) {
    this.selectedMenu = menu;
  }//este método cambia el valor de selectedMenu por el nombre de la opción de cada div, que se pasa como parámetro.

}
