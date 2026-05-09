package com.trips.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/categorias")
public class categoriaTripController {
	//@RequestMapping(value="/index", method=RequestMethod.GET)
	@GetMapping("/index")
	public String mostrarIndex() {
		return "categoriasTrip/listCategoria";
	}
	//@RequestMapping(value="/create", method=RequestMethod.GET)
	@GetMapping("/create")
	public String crear() {
		return "categoriasTrip/formCategoria";
	}
	//@RequestMapping(value="/save", method=RequestMethod.GET)
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre_categoria, @RequestParam("descripcion") String descripción){
		System.out.println("Nombre Categoria: " + nombre_categoria);
		System.out.println("Descripción: " + descripción);
		return "categoriasTrip/listCategoria";
	}
}
