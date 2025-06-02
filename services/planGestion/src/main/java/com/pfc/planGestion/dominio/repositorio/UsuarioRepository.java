package com.pfc.planGestion.dominio.repositorio;

import com.pfc.planGestion.dominio.modelo.Usuario;

import java.util.List;
import java.util.Optional;

	public interface UsuarioRepository{
		Optional<Usuario> findByNifAndPin(String nif, String pin);
		
		List<Usuario> findAll();
		
		boolean existsById(String nif);
		
		void save(Usuario usuario);
		
		void deleteById(String nif);
	}
	
	//Optional es un contendor que puede o no contener un valor, por lo que si encuentra un usuario que coincide con las credenciales introducidas, tomará los valores de este y sino quedará con valor vacío
	//JpaRepository es para acceder a la base de datos
	//el método finByNifAndPin, no es un método predefinido, pero de esta manera Spring lo puede interpretar para generar automaticamente la consulta SQL.
