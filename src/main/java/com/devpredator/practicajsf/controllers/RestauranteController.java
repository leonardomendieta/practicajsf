/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author DevPredator
 * Clase controller que se encarga de procesar la informacion para la pantalla restaurantes.xhtml.
 */
@ManagedBean
@ViewScoped
public class RestauranteController {
	/**
	 * Lista de restaurantes para la tabla.
	 */
	private List<Restaurante> restaurantes;
	/**
	 * Lista de restaurantes filtrados.
	 */
	private List<Restaurante> restaurantesFiltrados;
	/**
	 * Servicio con los metodos que realizan la logica de negocio de restaurantes..
	 */
	private RestauranteService restauranteService = new RestauranteService();
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla de restaurantes.
	 */
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	
	/**
	 * Metodo que consulta la lista de empleados.
	 */
	public void consultarRestaurantes() {
		this.restaurantes = this.restauranteService.consultarRestaurantes();
	}
	/**
	 * @return the empleados
	 */
	public List<Restaurante> getEmpleados() {
		return restaurantes;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Restaurante> empleados) {
		this.restaurantes = empleados;
	}

	/**
	 * @return the empleadosFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restaurantesFiltrados the empleadosFiltrados to set
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	
}
