package com.capacitacion2.CapAutomatizacion2.Clase5;

public class AnalizarTexto {
	
	
	private String oracion;

	public String getOracion() {
		return oracion;
	}
	public void setOracion(String oracion) {
		this.oracion = oracion;
	}
	
	
	
	
	public AnalizarTexto(String oracion) {
		this.oracion = oracion;
		
		
	}
	public int deterNumeroPalabras (String oracion) {
		
		return oracion.trim().split(" ").length;
	}
	
	public int cantidadCaracteres() {
		return oracion.length();
	}
}
