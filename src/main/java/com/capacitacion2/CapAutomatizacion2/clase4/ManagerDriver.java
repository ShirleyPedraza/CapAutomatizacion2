package com.capacitacion2.CapAutomatizacion2.clase4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ManagerDriver {
//una clase que nos permita de manera basica el lanzamiento de diferentes navegadores
	private WebDriver webDriver;
	private String urlPagina;
	private String nombreNavegador;
	
		
	
	public WebDriver getWebDriver() {
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public String getUrlPagina() {
		return urlPagina;
	}

	public void setUrlPagina(String urlPagina) {
		this.urlPagina = urlPagina;
	}

	public String getNombreNavegador() {
		return nombreNavegador;
	}

	public void setNombreNavegador(String nombreNavegador) {
		this.nombreNavegador = nombreNavegador;
	}

	public ManagerDriver (String nombreNavegador, String urlPagina) {
		this.nombreNavegador = nombreNavegador;
		this.urlPagina = urlPagina;
		seleccionarNavegador();
		
	}
	
	private  void seleccionarNavegador() {
		switch (nombreNavegador.toLowerCase().trim()) {//lower case para volver minuscula  trim me quita espacios de los extremos
		case "google":
			System.setProperty("webdriver.chrome.driver","src\\\\main\\\\java\\\\resources\\\\drivers\\\\chromedriver.exe\"");
			webDriver = new ChromeDriver();
			break;

		case "firefox":
			
			break;

		case "ie":
			
			break;
		
		default:
			break;
		}
		
	}
	
	public void navegarAPagina() {
		webDriver.get(urlPagina);
		
	}
	
	public void cerrarNavegador () {
		webDriver.close();
	}
}
