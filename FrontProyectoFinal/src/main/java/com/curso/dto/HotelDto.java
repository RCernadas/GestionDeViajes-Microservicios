package com.curso.dto;

import com.curso.enums.Categoria;

/**
 * Clase HotelDto que utilizamos para mapear los datos del microservicio de hoteles
 */
public class HotelDto {

	private int idHotel;
	private String nombre;
	private Categoria categoria;
	private double precio;
	private Boolean disponible;

	public HotelDto() {

	}

	public HotelDto(String nombre, Categoria categoria, double precio, Boolean disponible) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

}