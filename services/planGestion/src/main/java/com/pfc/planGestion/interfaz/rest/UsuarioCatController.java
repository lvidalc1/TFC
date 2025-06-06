package com.pfc.planGestion.interfaz.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.UsuarioCatService;
import com.pfc.planGestion.interfaz.dto.UsuarioCatDTO;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/usuario-categorias")
public class UsuarioCatController {
	
	private final UsuarioCatService usuarioCatService;

    public UsuarioCatController(UsuarioCatService usuarioCatService) {
        this.usuarioCatService = usuarioCatService;
    }

    //listar todas las usuario-categorias
    @GetMapping
    public List<UsuarioCatDTO> listarTodas() {
        return usuarioCatService.findAll();
    }

 //consultar por frecuencia
    @GetMapping("/por-frecuencia/{frecuencia}")
    public List<UsuarioCatDTO> listarPorFrecuencia(@PathVariable String frecuencia) {
        return usuarioCatService.findByFrecuencia(frecuencia);
    }


    //listar por categoria
    @GetMapping("/por-categoria/{idCategoria}")
    public List<UsuarioCatDTO> listarPorCategoria(@PathVariable long idCategoria) {
        return usuarioCatService.findByIdCategoria(idCategoria);
    }
    
    @PostMapping
    public ResponseEntity<?> guardarPresupuesto(@RequestBody UsuarioCatDTO dto, HttpSession session) {
        String nif = (String) session.getAttribute("usuario");
        if (nif == null) {
            return ResponseEntity.status(401).body("Usuario no autenticado");
        }
        if (dto.getPresupuesto() == null || dto.getPresupuesto() < 0) {
            return ResponseEntity.badRequest().body("El presupuesto debe ser un número positivo.");
        }
        if (dto.getCategoria() <= 0) {
            return ResponseEntity.badRequest().body("Categoría inválida.");
        }
        if (dto.getFrecuencia() == null || dto.getFrecuencia().isBlank()) {
        	dto.setFrecuencia("Mensual");
        }System.out.println("DTO recibido:");
        System.out.println("Categoría ID: " + dto.getCategoria());
        System.out.println("Presupuesto: " + dto.getPresupuesto());
        System.out.println("Frecuencia: " + dto.getFrecuencia());
        System.out.println("NIF: " + nif);
        

        dto.setNif(nif);
        usuarioCatService.guardarPresupuesto(dto);
        return ResponseEntity.ok("Presupuesto guardado correctamente");
        
        
        
    }


}
