/**
 * 
 */
package com.devpredator.practicajpa.dao;

import java.util.List;

import com.devpredator.practicajpa.entity.TipoRestaurante;

/**
 * @author VintageStep
 * Interfaz DAO que describe el CRUD con JPA para la tabla de restaurante.
 *
 */
public interface TipoRestauranteDAO {
	
	/*
	 * Metodo que permite guardar un tipoRestaurante
	 * @param restaurante {@link TipoRestaurante} objeto a guardar.
	 */
	void guardar(TipoRestaurante tipoRestaurante);
	
	/*
	 * Metodo que permite actualizar un tipoRestaurante
	 * @param restaurante {@link Restaurante} objeto a actualizar.
	 */
	void actualizar(TipoRestaurante tipoRestaurante);
	
	/*
	 * Metodo que permite eliminar un tipoRestaurante a partir de su identificador
	 * @param idTipoRestaurante {@link Long} identificador del tipoRestaurante a eliminar.
	 */
	void eliminar(Long id);
	
	/*
	 * Metodo que permite consultar la lista de tipoRestaurantes.
	 * @return {@link Lista} lista de tipo de restaurantes consultados.
	 */
	List<TipoRestaurante> consultar();
	
	/*
	 * Metodo que permite consultar un tipoRestaurante a partir de su identificador.
	 * @param id {@link Long} identificador del tipoRestaurante a consultar.
	 * @return {@link TipoRestaurante} un objeto tipoRestaurante consultado.
	 */
	TipoRestaurante consultarById(Long id);

	

}
