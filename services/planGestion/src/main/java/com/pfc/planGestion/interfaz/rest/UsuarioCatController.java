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
        //obtener usuario actual desde sesión
        String nif = (String) session.getAttribute("usuario");
        if (nif == null) {
            return ResponseEntity.status(401).body("Usuario no autenticado");
        }

        dto.setNif(nif); // asegurar que se guarde con el usuario logueado
        
        System.out.println("Recibido presupuesto para categoría: " + dto.getCategoria() +
                " | Presupuesto: " + dto.getPresupuesto() +
                " | Frecuencia: " + dto.getFrecuencia() +
                " | Usuario: " + dto.getNif());

        usuarioCatService.guardarPresupuesto(dto);
        return ResponseEntity.ok("Presupuesto guardado correctamente");
    }

}
