package com.alvaro.error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alvaro.error.errors.UsuarioNoEncontradoException;
import com.alvaro.error.models.Usuario;
import com.alvaro.error.services.UsuarioService;

@Controller
public class AppController {

	@Autowired // Para inyectar el service
	private UsuarioService usuarioService;
	
	@GetMapping("/index")
	public String index (Model model) {
		
		//@SuppressWarnings("unused") // Error de aritmética
		//Integer valor = 100/0;
		
		@SuppressWarnings("unused") // Error de formato de número
		Integer valor = Integer.parseInt("10x");
		
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver (@PathVariable Integer id, Model model) {
		
       /* Sin usar Optional
        
        Usuario usuario = usuarioService.obtenerPorId(id);
        
        if (usuario == null) { // Si el id no existe lanza la excepción personalizada que hemos creado
	   	throw new UsuarioNoEncontradoException(id.toString());
	    }
        
       */
		
		
		// Usando Optional - Si el id no existe lanza la excepción personalizada que hemos creado
		
		Usuario usuario = usuarioService.obtenerPorIdOptional(id).orElseThrow(() ->
			new UsuarioNoEncontradoException(id.toString())); 
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle usuario: " + usuario.getNombre());
		
		return "ver";
	}
}
