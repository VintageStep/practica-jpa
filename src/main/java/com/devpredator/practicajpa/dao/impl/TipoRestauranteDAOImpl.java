/**
 * 
 */
package com.devpredator.practicajpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.devpredator.practicajpa.dao.TipoRestauranteDAO;
import com.devpredator.practicajpa.entity.TipoRestaurante;

/**
 * @author VintageStep 
 * 
 * Clase que implementa el CRUD para las transacciones para
 * la tabla de restaurante.
 */


public class TipoRestauranteDAOImpl implements TipoRestauranteDAO{
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceDevPredator");	

	@Override
	public void guardar(TipoRestaurante tipoRestaurante) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		try {
			
			em.persist(tipoRestaurante);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}	
		
	}

	@Override
	public void actualizar(TipoRestaurante tipoRestaurante) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		try {
			em.merge(tipoRestaurante);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}	
		
		
	}

	@Override
	public void eliminar(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TipoRestaurante tipoRestauranteConsultado = em.find(TipoRestaurante.class, id);
		
		EntityTransaction et = em.getTransaction();	
		
		et.begin();
		
		try {
			em.remove(tipoRestauranteConsultado);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
		
	}

	@Override
	public List<TipoRestaurante> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TypedQuery<TipoRestaurante> typedQuery = (TypedQuery<TipoRestaurante>) em.createQuery("FROM TipoRestaurante ORDER BY descripcion");
		
		return typedQuery.getResultList();
	}

	@Override
	public TipoRestaurante consultarById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		return em.find(TipoRestaurante.class, id);
	}
	
	

}
