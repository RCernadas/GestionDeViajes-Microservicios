package com.curso.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {
	
	Hotel findByNombre(String nombre);
}
