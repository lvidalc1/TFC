package com.pfc.planGestion.aplicacion.negocio;

import com.pfc.planGestion.dominio.modelo.Usuario;
import com.pfc.planGestion.dominio.repositorio.UsuarioRepository;
import com.pfc.planGestion.interfaz.dto.UsuarioDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;//para declarar una dependencia a UsuarioRepository. Se usa para acceder a la base de datos

	public UsuarioService(UsuarioRepository repo) {
		this.usuarioRepository = repo;
	}//constructor de la clase UsuarioService. Sirve para inyectar de forma automática la instancia de UsuarioRepository.

	public Optional<Usuario> login(String nif, String pin) {
		return usuarioRepository.findByNifAndPin(nif, pin);
	}//método que busca usuario por nif y pin

	public boolean usuarioExiste(String nif) {
		return usuarioRepository.existsById(nif);
	}
	
	public List<UsuarioDTO> listarUsuarios(){
		List<UsuarioDTO> listadoUsuarios=new ArrayList<>();
		usuarioRepository.findAll().forEach(usuario -> listadoUsuarios.add(new UsuarioDTO(usuario)));
		
		return listadoUsuarios;
	}
	
	public boolean registrarUsuario(Usuario usuario) {
		if(usuarioExiste(usuario.getNif())) {
			return false;
		}else{
			usuarioRepository.save(usuario);
			return true;
		}
	}
	public void eliminarUsuario(String nif) {
		usuarioRepository.deleteById(nif);
	}

}
