package com.curso.inicio;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

class HotelServiceTest {

	@Test
	public void testBuscarHotelPorNombreNoSeDebeEncontrar() {
		// Arrange
		HotelService hotelService = mock(HotelService.class);
		when(hotelService.buscarHotelPorNombre("Hotel inventado")).thenReturn(null);

		// Act
		Hotel hotel = hotelService.buscarHotelPorNombre("Hotel inventado");

		// Assert
		assertNull(hotel);
	}

	@Test
	public void testTodosLosHotelesComprobacionListaDeHoteles() {
		// Arrange
		HotelService hotelService = mock(HotelService.class);
		List<Hotel> hotelesEsperados = new ArrayList<>();
		hotelesEsperados.add(new Hotel());
		hotelesEsperados.add(new Hotel());
		when(hotelService.todosLosHoteles()).thenReturn(hotelesEsperados);

		// Act
		List<Hotel> hoteles = hotelService.todosLosHoteles();

		// Assert
		assertEquals(2, hoteles.size());
	}
}
