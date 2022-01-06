/**
 * 
 */
package com.devpredator.practicajpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VintageStep
 * @apiNote Clase que representa la entidad de restaurante
 *
 */

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMenu")
	private Long idMenu;
	
	@Column(name="clave", length = 11)
	private String clave;
	
	@Column(name="descripcion", length = 500)
	private String descripcion;
	
	@Column(name="fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name="fechaModificacion")
	private LocalDateTime fehcaModificacion;
	
	@Column(name="estado")
	private boolean estado;

	/**
	 * @return the idMenu
	 */
	public Long getIdMenu() {
		return idMenu;
	}

	/**
	 * @param idMenu the idMenu to set
	 */
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fehcaModificacion
	 */
	public LocalDateTime getFehcaModificacion() {
		return fehcaModificacion;
	}

	/**
	 * @param fehcaModificacion the fehcaModificacion to set
	 */
	public void setFehcaModificacion(LocalDateTime fehcaModificacion) {
		this.fehcaModificacion = fehcaModificacion;
	}

	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
