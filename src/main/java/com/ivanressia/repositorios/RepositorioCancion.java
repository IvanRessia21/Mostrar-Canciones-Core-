package com.ivanressia.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivanressia.modelos.Cancion;

@Repository
public interface RepositorioCancion extends CrudRepository < Cancion, Long > {
	 List<Cancion> findAll();
	 Optional<Cancion> findById(Long id);
	 
	 

}
