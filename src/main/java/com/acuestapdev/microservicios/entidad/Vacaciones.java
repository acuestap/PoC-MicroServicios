package com.acuestapdev.microservicios.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field; 

@Document(collection="vacaciones")
public class Vacaciones {
	@Id
    public String id;
    @Field ("empleado")
    private String empleado;
    @Field ("intercambio")
    private String intercambio;
    
    public Vacaciones(String id, String empleado, String intercambio) {
        super();
        this.id = id;
        this.empleado = empleado;
        this.intercambio = intercambio;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getIntercambio() {
        return intercambio;
    }

    public void setIntercambio(String intercambio) {
        this.intercambio = intercambio;
    }

}
