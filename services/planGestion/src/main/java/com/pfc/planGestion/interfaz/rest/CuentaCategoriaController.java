package com.pfc.planGestion.interfaz.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.CuentaCategoriaService;
import com.pfc.planGestion.dominio.modelo.CuentaCategoria;

@RestController
@RequestMapping("/cuenta-categorias")
public class CuentaCategoriaController {
	
	private final CuentaCategoriaService cuentaCategoriaService;

    public CuentaCategoriaController(CuentaCategoriaService cuentaCategoriaService) {
        this.cuentaCategoriaService = cuentaCategoriaService;
    }

    //listar todas las cuenta-categorias
    @GetMapping
    public List<CuentaCategoria> listarTodas() {
        return cuentaCategoriaService.findAll();
    }

 //consultar por frecuencia
    @GetMapping("/por-frecuencia/{frecuencia}")
    public List<CuentaCategoria> listarPorFrecuencia(@PathVariable String frecuencia) {
        return cuentaCategoriaService.findByFrecuencia(frecuencia);
    }


    //listar por categoria
    @GetMapping("/por-categoria/{idCategoria}")
    public List<CuentaCategoria> listarPorCategoria(@PathVariable int idCategoria) {
        return cuentaCategoriaService.findByIdCategoria(idCategoria);
    }

}
