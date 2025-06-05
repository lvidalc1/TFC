package com.pfc.planGestion.interfaz.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.MovimientoService;
import com.pfc.planGestion.dominio.modelo.Movimiento;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
	private final MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

    // GET /movimientos
    @GetMapping
    public List<Movimiento> obtenerTodos() {
        return movimientoService.obtenerTodos();
    }

    // GET /movimientos/{id}
    @GetMapping("/{idMov}")
    public Optional<Movimiento> obtenerPorId(@PathVariable int idMov) {
        return movimientoService.obtenerPorId(idMov);
    }

    // GET /movimientos/por-iban?iban=...
    @GetMapping("/por-iban")
    public List<Movimiento> obtenerPorCuenta_Iban(@RequestParam String iban) {
        return movimientoService.obtenerPorCuenta_Iban(iban);
    }

    // POST /movimientos
    @PostMapping
    public Movimiento guardarMovimiento(@RequestBody Movimiento movimiento) {
        return movimientoService.guardarMovimiento(movimiento);
    }

    // DELETE /movimientos/{id}
//    @DeleteMapping("/{id}")
//    public void eliminarMovimiento(@PathVariable int id) {
//        movimientoService.eliminarMovimiento(id);
//    }

}

//get-http://localhost:8082/movimiento
//http://localhost:8082/movimientos/1
//	http://localhost:8082/movimientos/por-iban?iban=es123..
//		post-http://localhost:8082/movimientos
//			delete-http://localhost:8082/movimientos/1