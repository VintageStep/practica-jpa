/**
 * 
 */
package com.devpredator.practicajpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.devpredator.practicajpa.dao.RestauranteDAO;
import com.devpredator.practicajpa.dao.TipoRestauranteDAO;
import com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl;
import com.devpredator.practicajpa.dao.impl.TipoRestauranteDAOImpl;
import com.devpredator.practicajpa.entity.Menu;
import com.devpredator.practicajpa.entity.Restaurante;
import com.devpredator.practicajpa.entity.TipoRestaurante;

/**
 * @author Tom
 *
 */
class RestauranteDAOImplTest {

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#guardar(com.devpredator.practicajpa.entity.Restaurante)}.
	 */
	
	private RestauranteDAO restauranteDAO = new RestauranteDAOImpl();
	
	private TipoRestauranteDAO tipoRestauranteDAO = new TipoRestauranteDAOImpl();
	
	@Test
	void testGuardar() {
				
		//Test habitual
		
//		Restaurante restaurante = new Restaurante();
//		restaurante.setNombre("El Gallego");
//		restaurante.setImagen("elgallego.png");
//		
//		restaurante.setFechaCreacion(LocalDateTime.now());
//		restaurante.setFechaModificacion(LocalDateTime.now());
//		restaurante.setEstado(true);
//		restaurante.setIdMenu(2);
//		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setDescripcion("Español");
//		tipoRestaurante.setFechaCreacion(LocalDateTime.now());
//		tipoRestaurante.setFechaModificacion(LocalDateTime.now());
//		tipoRestaurante.setEstado(true);
//		
//		restaurante.setTipoRestaurante(tipoRestaurante);
//
//		
//		this.restauranteDAO.guardar(restaurante);
		
		//Test para comprobar si se puede hacer un insert sólo de la tabla Restaurante usando un tipo de restaurante existente
		// -> Se puede si el CascadeType de la clase mapeada es SAVE_UPDATE
				
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNombre("El Santafereño");
		restaurante2.setImagen("santafereno.png");
		
		restaurante2.setFechaCreacion(LocalDateTime.now());
		restaurante2.setFechaModificacion(LocalDateTime.now());
		restaurante2.setEstado(true);
		
		TipoRestaurante tipoRestaurante2 = this.tipoRestauranteDAO.consultarById(8L);
		
		Menu menu = new Menu();
		
		menu.setClave("MENU_ST");
		menu.setDescripcion("Menú del Satanfereño");
		menu.setFechaCreacion(LocalDateTime.now());
		menu.setFehcaModificacion(LocalDateTime.now());
		menu.setEstado(true);
	
		restaurante2.setMenu(menu);
		restaurante2.setTipoRestaurante(tipoRestaurante2);
		
		this.restauranteDAO.guardar(restaurante2);
		
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#actualizar(com.devpredator.practicajpa.entity.Restaurante)}.
	 */
	@Test
	void testActualizar() {
		
		Restaurante restauranteConsultado = restauranteDAO.consultarById(17L);
		
		restauranteConsultado.setSlogan("El mejor sazón colombiano.");
		restauranteConsultado.setFechaModificacion(LocalDateTime.now());
		
		this.restauranteDAO.actualizar(restauranteConsultado);
		
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		
		this.restauranteDAO.eliminar(17L);
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		
		List<Restaurante> restaurantesConsultados = this.restauranteDAO.consultar();
		
		assertTrue(restaurantesConsultados.size() > 0);
		
		for (Restaurante restaurante : restaurantesConsultados) {
			System.out.printf("Restaurante: " + restaurante.getNombre() + " ");
			System.out.println("Tipo: " + restaurante.getTipoRestaurante().getDescripcion());
		}
		
		
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Restaurante restauranteConsultado = this.restauranteDAO.consultarById(16L);
		
		System.out.println(restauranteConsultado.getNombre());
	}

}
