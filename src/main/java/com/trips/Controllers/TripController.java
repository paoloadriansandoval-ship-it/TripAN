package com.trips.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trips.Services.ITripServices;
import com.tripsModels.Trip;

@Controller
@RequestMapping("/trips")
public class TripController {
	@Autowired
	private ITripServices tripServices;
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idTrip, Model model) {
		Trip trip = tripServices.buscarPorId(idTrip); 
		System.out.println("Trip: " + idTrip);
		model.addAttribute("trip" , trip);
		return "trips/detalle";
	}
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idTrip, Model model) {
		System.out.println("idTrip es: " + idTrip);
		model.addAttribute("id" , idTrip);
		return "mensaje";
	}
	@GetMapping("/create")
	public String crear() {
		return "trips/formTrip";
	}
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripción){
		System.out.println("Nombre del viaje: " + nombre);
		System.out.println("Descripción: " + descripción);
		return "trips/listTrips";
	}
}
