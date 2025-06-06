package com.pfc.planGestion.interfaz.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.UsuarioCatService;
import com.pfc.planGestion.interfaz.dto.UsuarioCatDTO;

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

}
