package com.capacitacion2.CapAutomatizacion2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.CapAutomatizacion2.Clase5.AnalizarTexto;

public class AnalizarTextoTest {
	
	private AnalizarTexto objAnalizarTexto;
	private String oracion;
	
	@Before
	public void before () {
		System.out.println("Se ejecutó antes before()");
	    oracion ="Clase de pruebas unitarias";
		objAnalizarTexto = new AnalizarTexto(oracion);
		
	}
	
	@Test
	public void testdeterminarNumeroPalabras () {
		System.out.println("Se ejecutó test determinarNumeroPalabras()");
		int ValorEsperado =4;
	    int valorRecibido = objAnalizarTexto.deterNumeroPalabras(oracion);
		assertEquals(ValorEsperado,valorRecibido);
	}
	
	@Test
	public void testcantidadCaracteres() {
		System.out.println("Test cantidadCaracteres()");
		int esperado=26;
		int resultado = objAnalizarTexto.cantidadCaracteres();
		assertEquals(esperado,resultado);
	}
	@After
	public void after() {
		System.out.println("Se ejecutó after()");
	}
	
	
}
