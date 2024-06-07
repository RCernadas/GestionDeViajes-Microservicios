package com.curso.inicio;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.curso.enums.Categoria;
import com.curso.model.Hotel;
import com.curso.service.HotelService;

@SpringBootTest()
@AutoConfigureMockMvc
class HotelControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private HotelService hotelService;

	@BeforeEach
	public void setup() {
		Hotel hotel = new Hotel("Hotel", Categoria.DOS, 200, true);
		when(hotelService.buscarHotelPorNombre("Hotel")).thenReturn(hotel);
	}

	@Test
	public void buscarHotelPorNombreTest() throws Exception {

		// Act y Assert
		mockMvc.perform(get("/hoteles/Hotel")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.nombre", is("Hotel")));
	}
	
	@Test
	public void listarHotelesTest() throws Exception {
		mockMvc.perform(get("/hoteles")).andExpect(status().isOk());
	}

}
