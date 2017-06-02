package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Viajero;

@Service("servicioViajero")
@Transactional
public class ServicioViajeroImpl implements ServicioViajero{

	@Override
	public List<Viajero> agregarViajero(Viajero viajero){
		List<Viajero> viajeros = new ArrayList<Viajero>();
		viajeros.add(viajero);
		return viajeros;
	}
	
	@Override
	public List<Viajero> listarViajeros(){
		//List<Viajero> viajeros = new ArrayList<Viajero>();
		return this.listarViajeros();
	}

}
