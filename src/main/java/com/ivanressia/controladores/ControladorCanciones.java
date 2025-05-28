package com.ivanressia.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ivanressia.modelos.Cancion;
import com.ivanressia.servicios.ServicioCancion;

import jakarta.validation.Valid;

import java.util.List;

@Controller
public class ControladorCanciones {
	
	@Autowired
    private final ServicioCancion servicioCancion;
	
	public  ControladorCanciones ( ServicioCancion servicioCancion) {
		this.servicioCancion = servicioCancion;
		
		
	}
	
	@GetMapping("/canciones")
	public String   desplegarCanciones(Model modelo){
		
		List <Cancion> listaCanciones = this.servicioCancion.obtenerTodasLasCanciones();
		modelo.addAttribute("listaCanciones", listaCanciones);
		return "canciones.jsp";
			
		
	}
	
	@GetMapping("/canciones/detalle/{idCancion}")
		public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion , Model modelo ) {
		
		
		Cancion cancionPorId = this.servicioCancion.obtenerCancionPorId(idCancion);
		modelo.addAttribute("cancionCompleta", cancionPorId);
		
		return "detalleCancion.jsp";
		
	
			
		}
	
	@GetMapping("/canciones/formulario")
	public String formularioAgregarCancion(@ModelAttribute ("cancion") Cancion cancion ) {
		return "agregarCancion.jsp";
	}
	
	@PostMapping("/canciones/procesa/agregar")
	public String procesarAgregarCancion(@Valid @ModelAttribute ("cancion") Cancion cancion ,
			                              BindingResult validaciones) {
		
		if(validaciones.hasErrors()) {
			return"agregarCancion.jsp";
		}
		
		this.servicioCancion.agregarCancion(cancion);
		return "redirect:/canciones";
	}
	


}


