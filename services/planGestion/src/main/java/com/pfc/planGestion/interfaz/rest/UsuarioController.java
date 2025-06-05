package com.pfc.planGestion.interfaz.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.UsuarioService;
import com.pfc.planGestion.dominio.modelo.Usuario;
import com.pfc.planGestion.interfaz.dto.UsuarioDTO;
import com.pfc.planGestion.interfaz.request.NifRequest;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}//Esta parte del código está inyectando el servicio UsuarioService al controlador UsuarioController
	
	
	//listar usuarios
	@GetMapping
	public List<UsuarioDTO> listarUsuarios(){
		return usuarioService.listarUsuarios();
	}
	
	//registrar usuarios
	@PostMapping("/registrar")
	public ResponseEntity<String> registrar(@RequestBody Usuario usuario) {
		boolean registrado=usuarioService.registrarUsuario(usuario);

		if(registrado) {
			return ResponseEntity.status(HttpStatus.CREATED).body("Usuario registrado correctamente");
			
		}else {
	        return ResponseEntity.status(HttpStatus.CONFLICT).body("El usuario ya está registrado con ese NIF");
	    }
	}
	//con ResponseEntity puedo controlar el cuerpo de la respuesta el código de estado HTTP(en Spring es 200 OK por defecto) y las cabeceras HTTP
	
	//eliminar usuarios
	@DeleteMapping("/eliminar")
	public ResponseEntity<String> eliminar(@RequestBody NifRequest request) {
	    String nif = request.getNif();

	    if (!usuarioService.usuarioExiste(nif)) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
	    }

	    usuarioService.eliminarUsuario(nif);
	    return ResponseEntity.ok("Usuario eliminado correctamente");
	}


}
