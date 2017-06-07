package ar.edu.unlam.tallerweb1.modelo;

public class Viaje {
	
	private Long id;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String medioTransporte;
	private String alojamiento;
	
	//Constructor
	public Viaje(){
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMedioTransporte() {
		return medioTransporte;
	}

	public void setMedioTransporte(String medioTransporte) {
		this.medioTransporte = medioTransporte;
	}

	public String getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(String alojamiento) {
		this.alojamiento = alojamiento;
	}	

}
