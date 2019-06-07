package com.acuestapdev.microservicios.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acuestapdev.microservicios.modelo.Cesta;
import com.acuestapdev.microservicios.repositorio.RepositorioCesta;

@Service
public class ServicioCesta {
	
	@Autowired
	private RepositorioCesta repositorioCesta;
	
	public Optional<Cesta> listarItemsDeCesta(String idCliente){
		return repositorioCesta.findById(idCliente);
	}
	
	public void agregarItemsEnCesta(Cesta cesta) {
		repositorioCesta.save(cesta);
	}
	
	

}
