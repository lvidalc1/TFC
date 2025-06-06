package com.pfc.planGestion.aplicacion.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Usuario;
import com.pfc.planGestion.interfaz.dto.UsuarioDTO;

@Component
public class UsuarioDTOMapper {
	
	//convertir de entidad a dominio
	public Usuario toDomain(UsuarioDTO dto) {
		if(dto==null) return null;
		
		return new Usuario(
				dto.getNif(),
				dto.getPin(),
				dto.getNombre(),
				dto.getApel1(),
				dto.getApel2(),
				dto.getDireccion(),
				dto.getCorreo()
	     );
	}
	
	//convertir de dominio a entidad
	public UsuarioDTO toDTO(Usuario usuario) {
		if(usuario==null) return null;
		
		return new UsuarioDTO(
				usuario.getNif(),
				null,
	            usuario.getNombre(),
	            usuario.getApel1(),
	            usuario.getApel2(),
	            usuario.getDireccion(),
	            usuario.getCorreo()
				);
	}

}
