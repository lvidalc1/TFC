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


export class LoginComponent implements OnInit {
  texto: string = '';
  usuarios: Usuario = {
    dni: '', pin: ''
  };

  constructor(private loginService: LoginService, private router:Router) { }

  ngOnInit(): void {
  }

  getCredenciales(form: NgForm): void {
    if (!form.valid) {
      alert('Por favor, complete todos los campos.');
      return;
    }
  
    const acceso = this.loginService.login(this.usuarios);
    if (acceso) {
      this.router.navigate(['/posicionGlobal']);
    } else {
      alert('Datos incorrectos');
    }
  }
  //este código comentado es el equivalente al de arriba pero que recibiría datos de la url
  // dniU: string = '';
  // pinU: string = '';

  // constructor(
  //   private loginService: LoginService,
  //   private router: Router
  // ) { }

  // ngOnInit(): void { }

  // login() {
  //   this.router.navigate(['/acceso']);
  // }

  // onAcceder(): void {
  //   const usuario: Usuario = {
  //     dni: this.dniU,
  //     pin: this.pinU
  //   };
  //   this.loginService.login(usuario).subscribe((login: any) => {
  //     if (login?.esValido) {
  //       console.log('Datos introducidos correctemente');
  //       this.login();//si los datos son correctos, redirige a la página de acceso
  //     } else {
  //       //console.log('datos incorrectos');
  //       alert("El NIF o el PIN son incorrectos");
  //     }
  //   });
  // }
}
