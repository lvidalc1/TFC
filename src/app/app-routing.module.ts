import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoriasComponent } from './proyecto/component/categorias/categorias.component';
import { LoginComponent } from './proyecto/component/login/login.component';
import { InicioComponent } from './shared/inicio/inicio.component';
import { GestionCategoriasComponent } from './proyecto/component/gestion-categorias/gestion-categorias.component';

const routes: Routes = [
  { path: '', component: InicioComponent },
  { path: 'categorias', component: CategoriasComponent },
  { path: 'login', component: LoginComponent },
  { path: 'gestion', component: GestionCategoriasComponent },
  { path: 'acceso', component: CategoriasComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
