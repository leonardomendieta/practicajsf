/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author DevPredator
 * Clase que permite realizar la logica de negocio para empleados.
 */
public class RestauranteService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Restaurante} lista de empleados.
	 */
	public List<Restaurante> consultarRestaurantes() {
		
		//Generar la lista de empleados a consultar.
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante restauranteMcDonalds = new Restaurante();
		Restaurante restauranteLaVidArgentina = new Restaurante();
		Restaurante restauranteLaChilaca = new Restaurante();
		Restaurante restauranteSocarrat = new Restaurante();
		Restaurante restauranteCienaga = new Restaurante();
		
		//:::::::: PRIMER RESTAURANTE ::::::::::::::
		
		restauranteMcDonalds.setNombre("McDonalds");
		restauranteMcDonalds.setDireccion("Dirección 1");
		restauranteMcDonalds.setPais("Estados Unidos");
		
		Gerente gerenteMcDonalds = new Gerente();
		gerenteMcDonalds.setNombre("Diego");
		gerenteMcDonalds.setPrimerApellido("Paniagua");
		gerenteMcDonalds.setSegundoApellido("López");
		
		restauranteMcDonalds.setGerente(gerenteMcDonalds);

		//:::::::: SEGUNDO RESTAURANTE ::::::::::::::
		
		restauranteLaVidArgentina.setNombre("La Vid Argentina");
		restauranteLaVidArgentina.setDireccion("Dirección 2");
		restauranteLaVidArgentina.setPais("Argentina");
		
		Gerente gerenteLaVidArgentina = new Gerente();
		gerenteLaVidArgentina.setNombre("Erick");
		gerenteLaVidArgentina.setPrimerApellido("Guerrero");
		gerenteLaVidArgentina.setSegundoApellido("Gómez");
		
		restauranteLaVidArgentina.setGerente(gerenteLaVidArgentina);
		
		//:::::::: TERCER RESTAURANTE ::::::::::::::

		restauranteLaChilaca.setNombre("La Chilaca");
		restauranteLaChilaca.setDireccion("Direccion 3");
		restauranteLaChilaca.setPais("Chile");

		Gerente gerenteLaChilaca = new Gerente();
		gerenteLaChilaca.setNombre("Luís Jesús");
		gerenteLaChilaca.setPrimerApellido("López");
		gerenteLaChilaca.setSegundoApellido("Romero");
		
		restauranteLaChilaca.setGerente(gerenteLaChilaca);
		
		//:::::::: CUARTO RESTAURANTE ::::::::::::::

		restauranteSocarrat.setNombre("Socarrat");
		restauranteSocarrat.setDireccion("Direccion 4");
		restauranteSocarrat.setPais("España");

		Gerente gerenteSocarrat = new Gerente();
		gerenteSocarrat.setNombre("Daniel");
		gerenteSocarrat.setPrimerApellido("López");
		gerenteSocarrat.setSegundoApellido("Romero");
		
		restauranteSocarrat.setGerente(gerenteSocarrat);

		//:::::::: QUINTO RESTAURANTE ::::::::::::::

		restauranteCienaga.setNombre("Cienaga");
		restauranteCienaga.setDireccion("Direccion 5");
		restauranteCienaga.setPais("Colombia");

		Gerente gerenteCienaga = new Gerente();
		gerenteCienaga.setNombre("Gerardo");
		gerenteCienaga.setPrimerApellido("Guerrero");
		gerenteCienaga.setSegundoApellido("Gómez");
		
		restauranteCienaga.setGerente(gerenteCienaga);
		
		restaurantes.add(restauranteMcDonalds);
		restaurantes.add(restauranteLaVidArgentina);
		restaurantes.add(restauranteLaChilaca);
		restaurantes.add(restauranteCienaga);
		restaurantes.add(restauranteSocarrat);
		
		return restaurantes;
	}
}
