import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoriasComponent } from './proyecto/component/categorias/categorias.component';
import { LoginComponent } from './proyecto/component/login/login.component';
import { InicioComponent } from './proyecto/component/inicio/inicio.component';
import { GestionCategoriasComponent } from './proyecto/component/gestion-categorias/gestion-categorias.component';
import { PosicionGlobalComponent } from './proyecto/component/posicion-global/posicion-global.component';
import { AccesoComponent } from './proyecto/component/acceso/acceso.component';

const routes: Routes = [
  { path: '', component: InicioComponent },
  { path: 'categorias', component: CategoriasComponent },
  { path: 'login', component: LoginComponent },
  { path: 'gestion', component: GestionCategoriasComponent },
  { path: 'acceso', component: AccesoComponent },
  { path: 'posicionGlobal', component: PosicionGlobalComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
