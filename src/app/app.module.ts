import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { InicioComponent } from './inicio/inicio.component';
import { GestionCategoriasComponent } from './gestion-categorias/gestion-categorias.component';

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
