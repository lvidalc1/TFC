package com.pfc.planGestion.interfaz.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfc.planGestion.aplicacion.negocio.CuentaService;
import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.interfaz.dto.CuentaDTO;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
	private final CuentaService cuentaService;
	
	public CuentaController(CuentaService cuentaService) {
		this.cuentaService=cuentaService;
	}
	
	//listar todas las cuentas de todos los usuarios
//	@GetMapping
//	public List<CuentaDTO>listarCuentas(){
//		return cuentaService.listarCuentas();
//	}
	
	
	//listar cuentas por nif del usuario
	@GetMapping("/usuario/{nif}")
	public List<Cuenta> listarCuentasPorUsuario(@PathVariable String nif){
		return cuentaService.listarCuentasPorTitular(nif);
		
	}
	
	//crear cuenta
	@PostMapping("/crear")
    public CuentaDTO crearCuenta(@RequestBody CuentaDTO cuentaDto) {
        Cuenta cuenta = new Cuenta(
            cuentaDto.getIban(),
            cuentaDto.getNumCuenta(),
            cuentaDto.getTitular(),
            new BigDecimal(cuentaDto.getSaldo())
        );
        Cuenta registrada = cuentaService.registrarCuenta(cuenta);
        return new CuentaDTO(registrada);
    }
	
	//eliminar cuenta por iban
	@DeleteMapping("/eliminar/{iban}")
    public void eliminarCuenta(@PathVariable String iban) {
        cuentaService.eliminarCuenta(iban);
    }

}
