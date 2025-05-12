import { Component, OnInit } from '@angular/core';
import { Usuario } from '../../model/usuario';
import { USUARIOS } from 'src/app/mock-usuarios';
import { LoginService } from '../../service/login.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

// const PERSONAS: Usuario[] = [
//       { dni:'11111111A', 
//         pin:'123456'}
//   ];

export class LoginComponent implements OnInit {
  texto: string = '';
  usuarios: Usuario = {
    dni: '', pin: ''
  };
  

  // getUsuarios(): Usuario[]{
  //   return USUARIOS;
  // }

  constructor(private loginService: LoginService, private router:Router) { }

  ngOnInit(): void {
  }

  getCredenciales(form: NgForm): void {
    if (!form.valid) {
      alert('Por favor, completa todos los campos.');
      return;
    }
  
    const acceso = this.loginService.login(this.usuarios);
    if (acceso) {
      this.router.navigate(['/acceso']);
    } else {
      alert('Datos incorrectos');
    }
  }
}