import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './proyecto/login/login.component';
import { CategoriasComponent } from './proyecto/categorias/categorias.component';
import { InicioComponent } from './shared/inicio/inicio.component';
import { GestionCategoriasComponent } from './proyecto/gestion-categorias/gestion-categorias.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CategoriasComponent,
    InicioComponent,
    GestionCategoriasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
