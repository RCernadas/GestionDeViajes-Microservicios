package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase Reserva que representa una reserva y las propiedades de la misma con las
 * cuales vamos a tratar
 */
@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReserva;
	private String nombreCliente;
	private String dni;
	private int idHotel;
	private int idVuelo;
	
	public Reserva() {
		
	}
	
	public Reserva(String nombreCliente, String dni, int idHotel, int idVuelo) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;

	}

	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
}
