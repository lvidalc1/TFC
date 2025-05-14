import { Injectable } from '@angular/core';
import { Usuario } from '../model/usuario';
import { USUARIOS } from 'src/app/mock-usuarios';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }
  // constructor(private httpClient: HttpClient) { }

  // login(datos: Usuario): Observable<any> {
  //   //la siguiente ruta es con un ejemplo de prueba en el servidor SoapUi, por lo que si no está activo, no se puede hacer el login.
  //   return this.httpClient.request('GET', "http://localhost:8080/heroesMockService/login" + '?' + 'dni='+ datos.dni +'pin='+datos.pin, {responseType:'json'});
  // }
  login(usuario: Usuario): boolean {
    for (let u of USUARIOS) {
      if (u.dni === usuario.dni && u.pin === usuario.pin) {
        return true;
      }
    }
    return false;
  }
}
//usando este login, los datos los recibiría del mock y no de la url
