package com.acuestapdev.microservicios.modelo;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cesta")
public class Cesta {
	private String codigoCliente;
	private List<Producto> producto;
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Cesta [codigoCliente=" + codigoCliente + ", producto=" + producto + "]";
	}
	
	

}
