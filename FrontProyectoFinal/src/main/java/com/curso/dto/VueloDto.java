package com.curso.dto;

import java.time.LocalDate;

import com.curso.enums.Aerolinea;

/**
 * Clase VueloDto que utilizamos para mapear los datos del microservicio de vuelos
 */
public class VueloDto {

	private int idVuelo;
	private Aerolinea aerolinea;
	private LocalDate fechaVuelo;
	private double precio;
	private int plazasDisponibles;

	public VueloDto() {

	}

	public VueloDto(Aerolinea aerolinea, LocalDate fechaVuelo, double precio, int plazasDisponibles) {
		super();
		this.aerolinea = aerolinea;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

}
