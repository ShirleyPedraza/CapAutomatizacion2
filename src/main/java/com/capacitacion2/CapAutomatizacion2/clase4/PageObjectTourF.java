package com.capacitacion2.CapAutomatizacion2.clase4;

import java.awt.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectTourF extends PageFactory{ //esta extension me permite trabajar cosas de una forma dinamica por notaciones

	private WebDriver webDriver;
	
	public PageObjectTourF(WebDriver webDriver) {
		this.webDriver= webDriver;
		PageFactory.initElements(webDriver,this);
		
	}
	
@FindBy(id="selectdweb")
private WebElement listaSeleccionMultiple;

@FindBy(className = "ue.table-ranking_cyclist-name")
private List<WebElement> listaCiclistas;

public void seleccionListaDesplegar (String opcion) {
	Select select = new Select(listaSeleccionMultiple);
	select.selectByVisibleText(opcion);
	
}
public void imprimirListaCiclista() {
	int acumulador = 1;
	for (WebElement posicion:listaCiclistas ) {
		System.out.println(acumulador + ": " + posicion.getText());
		acumulador++;
	
}

}}
