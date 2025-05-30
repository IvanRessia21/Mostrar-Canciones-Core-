package com.ivanressia.modelos;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="canciones")
public class Cancion {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=5 , max=30 , message="Por favor proporcione un titulo valido , debe tener 5 caracteres como minimo.")
	private String titulo;
	
	@Size(min=3 , max=30 , message="Por favor proporcione un artista valido , debe tener 3 caracteres como minimo.")
	private String artista;
	
	@Size(min=3 , max=30 , message="Por favor proporcione un album valido , debe tener 3 caracteres como minimo.")
	private String album;
	
	@Size(min=3 , max=30 , message="Por favor proporcione un genero valido , debe tener 3 caracteres como minimo.")
	private String genero;
	
	@Size(min=3 , max=30 , message="Por favor proporcione un idioma valido , debe tener 3 caracteres como minimo.")
	private String idioma;
	

	@Column(updatable = false , name="fecha_creacion" )
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaCreacion;
	
	@Column(name="fecha_actualizacion" )
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaActualizacion;
	
	
	@PrePersist
	   protected void  onCreate() {
		this.fechaCreacion = new Date();
		this.fechaActualizacion = new Date();
	}
	
	@PreUpdate
	  protected void onUpdate() {
		this.fechaActualizacion = new Date();
		
	}
	
	public Cancion (){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	
	
	
}
