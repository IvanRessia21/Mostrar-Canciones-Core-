package com.ivanressia.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	
	@GetMapping("/canciones/formulario/editar/{idCancion}")
	public String formularioEditarCancion(@ModelAttribute("cancion") Cancion cancion ,
			                               @PathVariable("idCancion")Long idCancion,
			                               Model modelo) {
		Cancion cancionActual = this.servicioCancion.obtenerCancionPorId(idCancion);
		modelo.addAttribute("cancion", cancionActual);
		
		return"editarCancion.jsp";
		
	}

	@PutMapping("/canciones/procesa/editar/{idCancion}")
	public String procesarEditarCancion(@Valid @ModelAttribute ("cancion") Cancion cancion ,
                                        BindingResult validaciones,
	                                    @PathVariable("idCancion")Long idCancion){
		
		if(validaciones.hasErrors()) {
			return"editarCancion.jsp";
		}
		
		cancion.setId(idCancion);
		
	  this.servicioCancion.editarCancion(cancion);
	  return"redirect:/canciones";
	}

	
	@DeleteMapping("/canciones/eliminar/{idCancion}")
	public String procesarEliminarCancion(@PathVariable("idCancion")Long idCancion) {
		this.servicioCancion.eliminarCancion(idCancion);
		return"redirect:/canciones";
	}
}


