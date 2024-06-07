package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.service.ReservaService;

@RestController
public class ReservaController {
	
	@Autowired
	ReservaService service;
	
	@PostMapping(value="reservas/{numPersonas}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void registrarReserva(@RequestBody Reserva reserva, @PathVariable int numPersonas) {
		service.registrarReserva(reserva, numPersonas);
	}
	
	@GetMapping(value="reservas/buscar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> obtenerReservasEnHotelString(@RequestParam("nombre") String nombreHotel){
		return service.obtenerReservasEnHotel(nombreHotel);
	}

}
