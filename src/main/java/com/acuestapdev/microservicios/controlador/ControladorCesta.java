package com.acuestapdev.microservicios.controlador;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acuestapdev.microservicios.modelo.Cesta;
import com.acuestapdev.microservicios.servicio.ServicioCesta;

@RestController
@RequestMapping("/everis/capacitacion")
public class ControladorCesta {
	@Autowired
	private ServicioCesta servicioCesta;
	
	@PostMapping(path = "/taller1/cesta", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public void registrarItemsEnCesta(@RequestBody Cesta cesta) {
		servicioCesta.agregarItemsEnCesta(cesta);
	}
	
	@PostMapping(path = "/taller1/listar", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public Optional<Cesta> consultarProductosPorCliente(@RequestBody String idCliente) {
		return servicioCesta.listarItemsDeCesta(idCliente);
	}
	
	@PutMapping(path = "/taller1/actualizar/{idCliente}", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public String actualizarItemsEnCesta(@PathVariable String idCliente, @RequestBody Cesta cesta) {
		servicioCesta.actualizarItemsEnCesta(cesta);
		return "Actualizado";
	}


}
