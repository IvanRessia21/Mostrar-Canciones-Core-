package com.ivanressia.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ivanressia.modelos.Cancion;
import com.ivanressia.servicios.ServicioCancion;

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
	


}


