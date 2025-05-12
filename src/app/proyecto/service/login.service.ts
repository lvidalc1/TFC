import { Injectable } from '@angular/core';
import { Usuario } from '../model/usuario';
import { USUARIOS } from 'src/app/mock-usuarios';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }
  // private credencialesValidas: Usuario = {
  //   dni: '11111111A',
  //   pin: '123456'
  // };
  login(usuario: Usuario): boolean {
    for (let u of USUARIOS) {
      if (u.dni === usuario.dni && u.pin === usuario.pin) {
        return true;
      }
    }
    return false;
  }
}
