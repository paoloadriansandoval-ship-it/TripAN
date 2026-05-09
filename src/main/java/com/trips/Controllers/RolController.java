package com.trips.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trips.Services.IRolService;
import com.tripsModels.Rol;

@Controller
public class RolController {
	@Autowired
	private IRolService RolService;
	
	@GetMapping("/tablaRol")
	public String mostrarTabla(Model model) {
		List<Rol> lista = RolService.buscarTodo();
		model.addAttribute("rol", lista);
		return "tablaRol";
	}
}