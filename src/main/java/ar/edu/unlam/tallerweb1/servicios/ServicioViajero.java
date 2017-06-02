package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Viajero;

public interface ServicioViajero {

	List<Viajero> listarViajeros();
	List<Viajero> agregarViajero(Viajero viajero);

	static ServicioViajero getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
