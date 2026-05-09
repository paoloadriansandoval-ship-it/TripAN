package com.trips.Services;

import java.util.List;

import com.tripsModels.Rol;

public interface IRolService {
	List<Rol> buscarTodo();
	Rol buscarPorId(Integer idRol);
}
