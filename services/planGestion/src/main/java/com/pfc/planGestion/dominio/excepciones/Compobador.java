package com.pfc.planGestion.dominio.excepciones;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Compobador {
	@GetMapping("/check")
//	GetMapping para indicar que un método debe responder a una petición HTTP GET
	public String check() {
		return "Conectado";
	}
}
