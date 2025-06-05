package com.pfc.planGestion.interfaz.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.CategoriaService;
import com.pfc.planGestion.dominio.modelo.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    //listar categorias
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    //buscar categoria por nombre
    @GetMapping("/buscar")
    public Optional<Categoria> buscarPorNombre(
            @RequestParam String nombre) {
        return categoriaService.buscarPorNombre(nombre);
    }
}
