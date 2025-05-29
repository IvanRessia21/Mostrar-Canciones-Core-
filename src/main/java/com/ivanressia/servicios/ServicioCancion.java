package com.ivanressia.servicios;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanressia.modelos.Cancion;
import com.ivanressia.repositorios.RepositorioCancion;

@Service
public class ServicioCancion {
	
	@Autowired
	private final RepositorioCancion repositorioCancion;
	
	
	public ServicioCancion (RepositorioCancion repositorioCancion) {
		
	      this.repositorioCancion = repositorioCancion;
	      
	}
	
	public List <Cancion> obtenerTodasLasCanciones(){
		return this.repositorioCancion.findAll();
		
	}
	
	public Cancion obtenerCancionPorId(Long id){
		return this.repositorioCancion.findById(id).orElse(null);
		
	}
	
	public Cancion agregarCancion(Cancion nuevaCancion) {
		return this.repositorioCancion.save(nuevaCancion);
	}
	
	public Cancion editarCancion(Cancion cancionActual) {
		return this.repositorioCancion.save(cancionActual);
	}
	

}
