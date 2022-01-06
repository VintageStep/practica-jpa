/**
 * 
 */
package com.devpredator.practicajpa.dao;

import java.util.List;

import com.devpredator.practicajpa.entity.Restaurante;

/**
 * @author VintageStep
 * Interfaz DAO que describe el CRUD con JPA para la tabla de restaurante.
 *
 */
public interface RestauranteDAO {
	
	/*
	 * Metodo que permite guardar un restaurante
	 * @param restaurante {@link Restaurante} objeto a guardar.
	 */
	void guardar(Restaurante restaurante);
	
	/*
	 * Metodo que permite actualizar un restaurante
	 * @param restaurante {@link Restaurante} objeto a actualizar.
	 */
	void actualizar(Restaurante restaurante);
	
	/*
	 * Metodo que permite eliminar un restaurante por su identificador
	 * @param idRestaurante {@link Long} identificador del restaurante a eliminar.
	 */
	void eliminar(Long id);
	
	/*
	 * Metodo que permite consultar la lista de restaurantes.
	 * @return {@link Lista} lista de restaurantes consultados.
	 */
	List<Restaurante> consultar();
	
	/*
	 * Metodo que permite consultar un restaurante a partir de su identificador.
	 * @param id {@link Long} identificador del restaurante a consultar.
	 * @return {@link Restaurante} un objeto restaurante consultado.
	 */
	Restaurante consultarById(Long id);


}
