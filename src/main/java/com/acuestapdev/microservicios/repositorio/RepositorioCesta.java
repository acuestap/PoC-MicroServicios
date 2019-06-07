package com.acuestapdev.microservicios.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.acuestapdev.microservicios.modelo.Cesta;


public interface RepositorioCesta extends MongoRepository <Cesta, String>{

}
