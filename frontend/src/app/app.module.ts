import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './proyecto/component/login/login.component';
import { CategoriasComponent } from './proyecto/component/categorias/categorias.component';
import { InicioComponent } from './proyecto/component/inicio/inicio.component';
import { GestionCategoriasComponent } from './proyecto/component/gestion-categorias/gestion-categorias.component';
import { CabeceraPieComponent } from './shared/cabecera-pie/cabecera-pie.component';
import { AccesoComponent } from './proyecto/component/acceso/acceso.component';
import { LogoPrincipalComponent } from './shared/logo-principal/logo-principal.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PosicionGlobalComponent } from './proyecto/component/posicion-global/posicion-global.component';
import { OpcionesCategoriasComponent } from './shared/opciones-categorias/opciones-categorias.component';
import { MenuLateralComponent } from './shared/menu-lateral/menu-lateral.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CategoriasComponent,
    InicioComponent,
    GestionCategoriasComponent,
    CabeceraPieComponent,
    AccesoComponent,
    PosicionGlobalComponent,
    OpcionesCategoriasComponent,
    LogoPrincipalComponent,
    MenuLateralComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
