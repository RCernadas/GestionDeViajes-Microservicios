package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

public interface ReservaService {

	/**
	 * Método que registrará una reserva y a su vez actualizará el número de plazas
	 * disponibles para el vuelo asociado a la reserva en función del número de
	 * personas que forman parte de la reserva
	 * 
	 * @param reserva     una reserva con todos los datos
	 * @param numPersonas personas para reserva
	 */
	public void registrarReserva(Reserva reserva, int numPersonas);

	/**
	 * Método al que pasamos por parámetro el nombre de un hotel y nos devolverá una
	 * lista con las reservas asociadas a dicho hotel
	 * 
	 * @param nombreHotel nombre del hotel
	 * @return lista de reservas asociadas a ese hotel
	 */
	public List<Reserva> obtenerReservasEnHotel(String nombreHotel);

}
