package com.pfc.planGestion.interfaz.rest;

import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
//import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

import com.pfc.planGestion.dominio.repositorio.UsuarioRepository;
import com.pfc.planGestion.interfaz.dto.LoginDTO;

@RestController
//RestController indica que esta clase va a manejar peticiones HTTP y que todos sus métodos devolverán directamente datos
@RequestMapping("/v1/login")
public class LoginController {

	private final UsuarioRepository usuarioRepository;// esto declara una variable que representa la conexion logica con la base de
										// datos para consultar usuarios

	public LoginController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@PostMapping
	public String login(@RequestBody LoginDTO loginDTO, HttpSession session) {
	    var usuario = usuarioRepository.findByNifAndPin(loginDTO.getNif(), loginDTO.getPin());

	    if (usuario.isPresent()) {
	        //con session para guardar al usuario en la sesión
	        session.setAttribute("usuario", usuario.get().getNif());
	        return "Inicio de sesión correcto";
	    } else {
	        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "NIF o PIN incorrectos");
//			con throw indico que se esta lanzando una excepcion
//			unauthorized: indica el tipo de error 401, que significa no autorizado
//			y despues el mensaje indicando que el NIF o el PIN son incorrectos
	    }
	}
	

//	get del login
//	@GetMapping("/login")
//	public String login(@RequestParam String nif, @RequestParam String pin) {
//		return "Datos recibidos correctamente: NIF:" + nif + " PIN: " + pin ;
//	}
}
