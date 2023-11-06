package com.alvaro.error.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alvaro.error.errors.UsuarioNoEncontradoException;

@ControllerAdvice // IMPORTANTE: @ControllerAdvice para controladores de errores, no es para rutas
public class ErrorHandlerController {

	@ExceptionHandler(ArithmeticException.class)
	public String arithmeticError (ArithmeticException ex, Model model) {
		
		model.addAttribute("error", "Error de aritmética");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/arithmetic";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String NumberFormatError (NumberFormatException ex, Model model) {
		
		model.addAttribute("error", "Error de formato de número");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numberFormat";
	}
	
	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String UsuarioNoEncontradoError (UsuarioNoEncontradoException ex, Model model) {
		
		model.addAttribute("error", "Usuario no encontrado!");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/usuario";
	}
}
