package com.acuestapdev.microservicios.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cesta")
public class Producto {
	private int codigoProducto;
	private int cantidad;
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
