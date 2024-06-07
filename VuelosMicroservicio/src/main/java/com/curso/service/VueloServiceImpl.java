package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VueloDao;
import com.curso.model.Vuelo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	VueloDao dao;

	@Override
	public List<Vuelo> vuelosConPlazasDisponibles(int plazasAReservar) {
		List<Vuelo> vuelos = dao.findAll();
		List<Vuelo> vuelosConPlazasSuficientes = new ArrayList<>();
		for (Vuelo vuelo : vuelos) {
			int plazasDisponiblesTrasReserva = vuelo.getPlazasDisponibles() - plazasAReservar;
			if (plazasDisponiblesTrasReserva > 0) {
				vuelosConPlazasSuficientes.add(vuelo);
			}
		}
		return vuelosConPlazasSuficientes;
	}

	@Override
	public void actualizarDatosVuelo(int id, int plazasAReservar) {
		Vuelo vueloEncontrado = dao.findById(id).orElseThrow(() -> new EntityNotFoundException());
		int plazasDisponiblesTrasReserva = vueloEncontrado.getPlazasDisponibles() - plazasAReservar;
		if (plazasDisponiblesTrasReserva > 0) {
			vueloEncontrado.setPlazasDisponibles(plazasDisponiblesTrasReserva);
			dao.save(vueloEncontrado);
		}

	}

}
