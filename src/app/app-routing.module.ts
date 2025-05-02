import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoriasComponent } from './proyecto/categorias/categorias.component';
import { LoginComponent } from './proyecto/login/login.component';
import { InicioComponent } from './shared/inicio/inicio.component';

const routes: Routes = [
  { path: '', component: InicioComponent },
  { path: 'categorias', component: CategoriasComponent },
  { path: 'login', component: LoginComponent },
  { path: 'gestion', component: CategoriasComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
