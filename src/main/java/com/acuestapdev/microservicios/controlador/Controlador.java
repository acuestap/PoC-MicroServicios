package com.acuestapdev.microservicios.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acuestapdev.microservicios.entidad.Entrada;
import com.acuestapdev.microservicios.datos.Repositorio;
import com.acuestapdev.microservicios.entidad.Vacaciones;

@RestController
public class Controlador {
	@Autowired
	private Repositorio myrepo;
	
	@RequestMapping(value="/novedades/consultar",method=RequestMethod.POST)
	public Vacaciones respuesta(@RequestBody Entrada e) {
	    return this.myrepo.findByEmpleado(e.getEmpleado());
	}
}
