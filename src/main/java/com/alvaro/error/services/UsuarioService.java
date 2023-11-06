package com.alvaro.error.services;

import java.util.List;
import java.util.Optional;

import com.alvaro.error.models.Usuario;


public interface UsuarioService {

	public List<Usuario> listar();
	
	public Usuario obtenerPorId(Integer id);
	
	public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
