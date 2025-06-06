import { Injectable } from '@angular/core';
import { Usuario } from '../model/usuario';
// import { USUARIOS } from 'src/app/mock-usuarios';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private apiUrl = '/api/login'

  constructor(private httpClient: HttpClient) { }


  login(usuario: Usuario): Observable<any> {
    return this.httpClient.post(this.apiUrl, usuario, { responseType: 'text' }).pipe(
      catchError(this.handleError)
    );
  }

  private handleError(error: HttpErrorResponse) {
    return throwError(() => error);
  }

  }

  // login(datos: Usuario): Observable<any> {
  //   //la siguiente ruta es con un ejemplo de prueba en el servidor SoapUi, por lo que si no está activo, no se puede hacer el login.
  //   return this.httpClient.request('GET', "http://localhost:8080/heroesMockService/login" + '?' + 'dni='+ datos.dni +'pin='+datos.pin, {responseType:'json'});
  // }




//usando este login, los datos los recibiría del mock y no de la url
// login(usuario: Usuario): boolean {
//   for (let u of USUARIOS) {
//     if (u.nif === usuario.nif && u.pin === usuario.pin) {
//       return true;
//     }
//   }
//   return false;
// }
