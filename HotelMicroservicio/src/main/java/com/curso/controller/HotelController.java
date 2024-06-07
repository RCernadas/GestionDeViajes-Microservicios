package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService service;
	@GetMapping(value="/hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
	List<Hotel> todosLosHoteles(){
		return service.todosLosHoteles();
	}
	
	@GetMapping(value="/hoteles/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	Hotel buscarHotelPorNombre(@PathVariable String nombre) {
		return service.buscarHotelPorNombre(nombre);
	}
}
