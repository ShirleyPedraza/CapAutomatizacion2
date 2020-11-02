package com.capacitacion2.CapAutomatizacion2.clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPaginaWeb {

	public void interactuarGmail() {
		String ubicacionDriver ="src\\main\\java\\resources\\drivers\\chromedriver.exe";
		String urlInicioGmail ="https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession";
		System.setProperty("webdriver.chrome.driver",ubicacionDriver);
		WebDriver  driver = new ChromeDriver();
		driver.get(urlInicioGmail);
		WebElement cajaTextoNombre =driver.findElement(By.id("identifierId"));
		cajaTextoNombre.sendKeys("spedraza16@gmail.com");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.close();
		
		} 
	
	
	
	
	
}
