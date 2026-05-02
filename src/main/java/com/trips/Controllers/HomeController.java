package com.trips.Controllers;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trips.Services.ITripServices;
import com.tripsModels.Trip;

@Controller
public class HomeController {
	@Autowired
	private ITripServices tripServices;
		
	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<Trip> lista = tripServices.buscarTodo();
		model.addAttribute("trips", lista);
		return "home";
	}
	@GetMapping("/Listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("En la montaña");
		lista.add("En la ciudad");
		lista.add("En los pueblos");
		lista.add("En las playas");
		model.addAttribute("ListadoTrips", lista);
		
		return "Listado";
	}
	@GetMapping("detalle{id}")
	public String mostrarDetalle(@RequestParam("id") int idTrip) {
		System.out.println("El ID trips es: " + idTrip);
		return "detalle";
	}
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Trip> lista = tripServices.buscarTodo();
		model.addAttribute("trips", lista);
		return "tabla";
	}
	
}