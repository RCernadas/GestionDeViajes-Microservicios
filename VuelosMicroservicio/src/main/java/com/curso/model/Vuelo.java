package com.curso.model;

import java.time.LocalDate;

import com.curso.enums.Aerolinea;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase Vuelo que representa un vuelo y las propiedades del mismo con las
 * cuales vamos a tratar
 */
@Entity
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVuelo;

	@Enumerated(value = EnumType.STRING)
	private Aerolinea aerolinea;
	private LocalDate fechaVuelo;
	private double precio;
	private int plazasDisponibles;

	public Vuelo() {

	}

	public Vuelo(Aerolinea aerolinea, LocalDate fechaVuelo, double precio, int plazasDisponibles) {
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
