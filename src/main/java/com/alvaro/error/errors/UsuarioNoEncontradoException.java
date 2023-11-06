package com.alvaro.error.errors;

public class UsuarioNoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L; // Sirve para serialización aunque en este caso no se usa

	public UsuarioNoEncontradoException(String id) {
		super("Usuario con ID: " + id + " no existe en el sistema");
	}
}
