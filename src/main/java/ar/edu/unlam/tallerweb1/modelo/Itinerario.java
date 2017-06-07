package ar.edu.unlam.tallerweb1.modelo;

public class Itinerario {
	
	private Long id;
	private String datosTransporte;
	private String datosAlojamiento;
	
	//Constructor
	public Itinerario(){
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDatosTransporte() {
		return datosTransporte;
	}

	public void setDatosTransporte(String datosTransporte) {
		this.datosTransporte = datosTransporte;
	}

	public String getDatosAlojamiento() {
		return datosAlojamiento;
	}

	public void setDatosAlojamiento(String datosAlojamiento) {
		this.datosAlojamiento = datosAlojamiento;
	}

}
