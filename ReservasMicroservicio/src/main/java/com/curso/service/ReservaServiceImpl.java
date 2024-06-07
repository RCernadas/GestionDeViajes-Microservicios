package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.dto.HotelDto;
import com.curso.model.Reserva;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaDao dao;

	@Autowired
	RestTemplate template;

	private String urlVuelos = "http://localhost:8000/vuelos/actualizar";
	private String urlHotel = "http://localhost:7000/hoteles";

	@Override
	public void registrarReserva(@RequestBody Reserva reserva, int numPersonas) {
		dao.save(reserva);

		String urlActualizarPlazasDisponibles = urlVuelos + "?x=" + reserva.getIdVuelo() + "&y=" + numPersonas;

		template.put(urlActualizarPlazasDisponibles, null);

	}

	@Override
	public List<Reserva> obtenerReservasEnHotel(String nombreHotel) {

		HotelDto hotelEncontrado = new HotelDto();
		List<Reserva> listaReservas = new ArrayList<>();
		List<Reserva> listaReservasAsociadasAHotel = new ArrayList<>();

		hotelEncontrado = template.getForObject(urlHotel + "/" + nombreHotel, HotelDto.class);

		listaReservas = dao.findAll();

		for (Reserva reserva : listaReservas) {
			if (reserva.getIdHotel() == hotelEncontrado.getIdHotel()) {
				listaReservasAsociadasAHotel.add(reserva);
			}
		}
		return listaReservasAsociadasAHotel;
	}
}
