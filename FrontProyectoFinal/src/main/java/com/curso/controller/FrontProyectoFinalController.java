package com.curso.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.curso.dto.HotelDto;
import com.curso.dto.ReservaDto;
import com.curso.dto.VueloDto;

@Controller
public class FrontProyectoFinalController {

	@Autowired
	RestTemplate template;

	String urlHoteles = "http://localhost:7000/hoteles";
	String urlVuelos = "http://localhost:8000/vuelos";
	String urlReservas = "http://localhost:6000/reservas";

	@GetMapping("/inicio")
	public String mostrarInicio() {
		return "inicio";
	}

	@GetMapping("/hoteles")
	public String listaHoteles(Model model) {
		List<HotelDto> respuesta = Arrays.asList(template.getForObject(urlHoteles, HotelDto[].class));
		model.addAttribute("hoteles", respuesta);
		return "hoteles";
	}

	@GetMapping("/hoteles/buscar")
	public String buscarHotelPorNombre(Model model, @RequestParam(name = "nombre") String nombre) {
		HotelDto respuesta = template.getForObject(urlHoteles + "/" + nombre, HotelDto.class);
		model.addAttribute("hoteles", respuesta);
		return "hoteles";
	}

	@GetMapping("/vuelos")
	public String mostrarInicioVuelos() {
		return "vuelos";
	}

	@GetMapping("/vuelos/buscar")
	public String vuelosConPlazasDisponibles(Model model, @RequestParam(name = "numPlazas") int numPlazas) {
		List<VueloDto> respuesta = Arrays
				.asList(template.getForObject(urlVuelos + "/disponibilidad/" + numPlazas, VueloDto[].class));
		model.addAttribute("vuelos", respuesta);
		model.addAttribute("numPlazas", numPlazas);
		return "vuelos";
	}

	@GetMapping("/vuelos/reservar")
	public String reservarVuelo(Model model, @RequestParam(name = "x") int id,
			@RequestParam(name = "y") int numPlazas) {

		template.put(urlVuelos + "/actualizar?x=" + id + "&y=" + numPlazas, null);
		return "infoVueloReservado";
	}
	
	@GetMapping("/reservas")
	public String mostrarInicioReservas(Model model, @ModelAttribute ReservaDto reserva) {
		reserva = new ReservaDto();
		model.addAttribute("numPersonas", 1);
		return "formularioReservas";
	}
	
	@PostMapping("/reservas/nueva/{numPersonas}")
	public String hacerReserva(Model model, @ModelAttribute ReservaDto reserva, @PathVariable(name = "numPersonas") int numPersonas) {
		System.out.println(reserva.toString());
		template.postForLocation(urlReservas + "/" + numPersonas, reserva);
		model.addAttribute("reserva", reserva);
		model.addAttribute("numPersonas", numPersonas);
		return "infoHotelYVueloReservado";
	}
	
	@GetMapping("/reservas/lista")
	public String listaReservas(Model model) {
		return "listaReservas";
	}
	
	@GetMapping("/reservas/buscar")
	public String buscarReservaPorNombre(Model model, @RequestParam(name = "nombre") String nombre) {
		List<ReservaDto> respuesta = Arrays.asList(template.getForObject(urlReservas + "/buscar?nombre=" + nombre, ReservaDto[].class));
		model.addAttribute("reservas", respuesta);
		System.out.println(respuesta);
		return "listaReservas";
	}
}
