package com.trips.Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tripsModels.Rol;

@Service
public class RolServiceImpl implements IRolService{
	List<Rol> lista = null;
	
	public RolServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	    lista = new LinkedList<Rol>();
	    try {
	    	Rol rol1 = new Rol();
	        rol1.setId(1);
	        rol1.setNombre("Vendedor");
	        rol1.setDescripción("Encargado de vender los viajes");
	        rol1.setFecha(sdf.parse("10-05-2022"));
	        rol1.setActivo(0);
	        
	        Rol rol2 = new Rol();
	        rol2.setId(2);
	        rol2.setNombre("Visitante");
	        rol2.setDescripción("Los turistas que compran los viajes");
	        rol2.setFecha(sdf.parse("10-05-2022"));
	        rol2.setActivo(0);
	        
	        Rol rol3 = new Rol();
	        rol3.setId(3);
	        rol3.setNombre("Programador");
	        rol3.setDescripción("Encargado de programar la pagina web de la empresa");
	        rol3.setFecha(sdf.parse("10-05-2022"));
	        rol3.setActivo(1);
	        
	        Rol rol4 = new Rol();
	        rol4.setId(4);
	        rol4.setNombre("Administrador");
	        rol4.setDescripción("Se ecnarga de la logistica de los trips y de administrar a los empleados");
	        rol4.setFecha(sdf.parse("10-05-2022"));
	        rol4.setActivo(1);
	        
	    	lista.add(rol1);
	        lista.add(rol2);
	        lista.add(rol3);
	        lista.add(rol4);
	    } catch (ParseException e) {
        System.out.println(e.getMessage());
        }
	  }
	public List<Rol> buscarTodo() {
		return lista;
	}
	public Rol buscarPorId(Integer idRol) {
		for (Rol rol: lista)
			if (rol.getId()==idRol)
				return rol;
		return null;
	}
}