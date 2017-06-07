package ar.edu.unlam.tallerweb1.modelo;

import java.util.Date;

public class Visita {
	
	private Long id;
	private String nombre;
	private String lugar;
	private String descripcion;
	private String imagenPath;
	private Date fechaHora;
	
	//Constructor
	public Visita(){
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagenPath() {
		return imagenPath;
	}

	public void setImagenPath(String imagenPath) {
		this.imagenPath = imagenPath;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

}
