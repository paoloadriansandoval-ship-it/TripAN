package com.trips.Services;

import java.util.List;

import com.tripsModels.Trip;

public interface ITripServices {
	List<Trip> buscarTodo();
	Trip buscarPorId(Integer idTrip);
	void guardar (Trip trip);
}
