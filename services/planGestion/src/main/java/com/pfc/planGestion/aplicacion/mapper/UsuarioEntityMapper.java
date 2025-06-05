package com.pfc.planGestion.aplicacion.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Usuario;
import com.pfc.planGestion.repositorio.persistencia.component.UsuarioEntity;

@Component
public class UsuarioEntityMapper {
	
	//convertir de entidad a dominio
	public Usuario toDomain(UsuarioEntity entity) {
		if(entity==null) return null;
		
		return new Usuario(
				entity.getNif(),
	            entity.getPin(),
	            entity.getNombre(),
	            entity.getApel1(),
	            entity.getApel2(),
	            entity.getDireccion(),
	            entity.getCorreo()
	     );
	}
	
	//convertir de dominio a entidad
	public UsuarioEntity toEntity(Usuario usuario) {
		if(usuario==null) return null;
		
		return new UsuarioEntity(
				usuario.getNif(),
	            usuario.getPin(),
	            usuario.getNombre(),
	            usuario.getApel1(),
	            usuario.getApel2(),
	            usuario.getDireccion(),
	            usuario.getCorreo()
				);
	}

}
