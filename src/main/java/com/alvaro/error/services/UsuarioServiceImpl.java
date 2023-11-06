package com.alvaro.error.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alvaro.error.models.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = Arrays.asList(
			new Usuario(1, "Álvaro", "Sánchez"),
			new Usuario(2, "Roberto", "Romero"),
			new Usuario(3, "Andrés", "Enriquez"),
			new Usuario(4, "Juan Carlos", "Pérez"),
			new Usuario(5, "Francisco", "Sánchez")
			);
	}

	@Override
	public List<Usuario> listar() {

		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		
		for (Usuario u: this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}	
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		
		return Optional.ofNullable(usuario);
	}

}
