package com.acuestapdev.microservicios.datos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.acuestapdev.microservicios.entidad.Vacaciones;

public interface Repositorio extends MongoRepository<Vacaciones, String> {
    
    public Vacaciones findByEmpleado(String empleado);



}
