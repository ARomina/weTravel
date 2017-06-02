package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Viajero;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;
import ar.edu.unlam.tallerweb1.servicios.ServicioViajero;

@Controller
public class ControladorViajero {

	/*@Inject
	private ServicioViajero servicioViajero;*/
	
	@RequestMapping("/verViajeros")
	public ModelAndView verViajeros() {

		ModelMap modelo = new ModelMap();
		
		/*//Creo viajero1
		Viajero viajero1 = new Viajero();
		viajero1.setNombre("Marta");
		viajero1.setApellido("Gimenez");
		viajero1.setEmail("marta@hotmail.com");
		viajero1.setUsername("Marta01");
		viajero1.setPassword("123456");
		
		//Creo viajero2
		Viajero viajero2 = new Viajero();
		viajero2.setNombre("Julian");
		viajero2.setApellido("Gimenez");
		viajero2.setEmail("julian@hotmail.com");
		viajero2.setUsername("Julian02");
		viajero2.setPassword("67890");
		
		ServicioViajero servicioViajero = ServicioViajero.getInstance();
		servicioViajero.agregarViajero(viajero1);
		servicioViajero.agregarViajero(viajero2);
		
		servicioViajero.listarViajeros();*/
		
		return new ModelAndView("verViajeros", modelo);
	}
}
