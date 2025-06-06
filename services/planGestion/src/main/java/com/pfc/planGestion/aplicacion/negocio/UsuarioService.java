package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.aplicacion.mapper.UsuarioDTOMapper;
import com.pfc.planGestion.dominio.repositorio.UsuarioRepository;
import com.pfc.planGestion.interfaz.dto.UsuarioDTO;


@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;//para declarar una dependencia a UsuarioRepository. Se usa para acceder a la base de datos
	private UsuarioDTOMapper usuarioDTOMapper;
	
	public UsuarioService(UsuarioRepository repo, UsuarioDTOMapper usuarioDTOMapper) {
		this.usuarioRepository = repo;
		this.usuarioDTOMapper = usuarioDTOMapper;
	}//constructor de la clase UsuarioService. Sirve para inyectar de forma automática la instancia de UsuarioRepository.

	public Optional<UsuarioDTO> login(String nif, String pin) {
		return Optional.of(usuarioDTOMapper.toDTO(usuarioRepository.findByNifAndPin(nif, pin).get()));
	}//método que busca usuario por nif y pin

	public boolean usuarioExiste(String nif) {
		return usuarioRepository.existsById(nif);
	}
	
	public List<UsuarioDTO> listarUsuarios(){
		return usuarioRepository.findAll().stream().map(usuarioDTOMapper::toDTO).collect(Collectors.toList());
	}
	
	public boolean registrarUsuario(UsuarioDTO usuario) {
		if(usuarioExiste(usuario.getNif())) {
			return false;
		}else{
			usuarioRepository.save(usuarioDTOMapper.toDomain(usuario));
			return true;
		}
	}
	public void eliminarUsuario(String nif) {
		usuarioRepository.deleteById(nif);
	}

}
