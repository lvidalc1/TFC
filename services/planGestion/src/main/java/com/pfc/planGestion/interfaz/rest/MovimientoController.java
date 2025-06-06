package com.pfc.planGestion.interfaz.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.MovimientoService;
import com.pfc.planGestion.interfaz.dto.MovimientoDTO;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
	private final MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

    // GET /movimientos
    @GetMapping
    public List<MovimientoDTO> obtenerTodos() {
        return movimientoService.obtenerTodos();
    }

    // GET /movimientos/{id}
    @GetMapping("/{idMov}")
    public Optional<MovimientoDTO> obtenerPorId(@PathVariable long idMov) {
        return movimientoService.obtenerPorId(idMov);
    }

    // GET /movimientos/por-iban?iban=...
    @GetMapping("/por-iban")
    public List<MovimientoDTO> obtenerPorCuenta_Iban(@RequestParam String iban) {
        return movimientoService.obtenerPorCuenta_Iban(iban);
    }

    // POST /movimientos
    @PostMapping
    public MovimientoDTO guardarMovimiento(@RequestBody MovimientoDTO movimiento) {
        return movimientoService.guardarMovimiento(movimiento);
    }
    
}