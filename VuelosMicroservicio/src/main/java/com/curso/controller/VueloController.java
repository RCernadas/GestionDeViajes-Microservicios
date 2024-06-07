package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VueloService;

@RestController
public class VueloController {

	@Autowired
	VueloService service;

	@GetMapping(value = "/vuelos/disponibilidad/{numPlazasAReservar}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Vuelo> vuelosConPlazasDisponibles(@PathVariable int numPlazasAReservar) {
		return service.vuelosConPlazasDisponibles(numPlazasAReservar);
	}

	@PutMapping(value = "/vuelos/actualizar")
	void actualizarDatosVuelo(@RequestParam("x") int id, @RequestParam("y") int plazasAReservar) {
		service.actualizarDatosVuelo(id, plazasAReservar);
	}

}
