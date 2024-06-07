package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

public interface HotelService {

	/**
	 * Método que devuelve todos los hoteles.
	 * 
	 * @return lista de hoteles
	 */
	public List<Hotel> todosLosHoteles();

	/**
	 * Método en el que pasamos por parámetro el nombre de un hotel y nos devuelve
	 * la info del mismo.
	 * 
	 * @param nombreHotel nombre del hotel que queremos encontrar
	 * @return Hotel el hotel coincidente con el nombre introducido en la búsqueda
	 */
	public Hotel buscarHotelPorNombre(String nombreHotel);
}
