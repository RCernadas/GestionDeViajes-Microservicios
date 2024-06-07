package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

public interface VueloService {

	/**
	 * Método al que pasamos por parámetra el número de plazas que queramos reservar
	 * y nos devuelve todos los vuelos en los que queden ese número de plazas
	 * 
	 * @param plazasAReservar número de plazas a reservar
	 * @return lista de vuelos con número de plazas disponibles
	 */
	List<Vuelo> vuelosConPlazasDisponibles(int plazasAReservar);

	/**
	 * Método para actualizar los datos de un vuelo. Pasamos por parámetro el id del
	 * vuelo y el número de plazas que vamos a reservar. Las plazas disponibles del
	 * vuelo se actualizarán en función del número de plazas reservadas
	 * 
	 * @param id id del vuelo
	 * @param plazasReservadas
	 */
	void actualizarDatosVuelo(int id, int plazasAReservar);

}
