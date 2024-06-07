package com.curso.dto;

/**
 * Clase ReservaDto que utilizamos para mapear los datos del microservicio de reservas
 */
public class ReservaDto {

	private int idReserva;
	private String nombreCliente;
	private String dni;
	private int idHotel;
	private int idVuelo;
	
	public ReservaDto() {
		
	}
	
	public ReservaDto(String nombreCliente, String dni, int idHotel, int idVuelo) {
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