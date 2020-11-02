package com.capacitacion2.CapAutomatizacion2;

import com.capacitacion2.CapAutomatizacion2.clase3.AutoPaginaWeb;
import com.capacitacion2.CapAutomatizacion2.clase4.ManagerDriver;
import com.capacitacion2.CapAutomatizacion2.clase4.PageObjectTourF;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   String urlPagina =  " https://www.marca.com/ciclismo/tour-francia/clasificacion.html " ;
    		ManagerDriver objManager =  new  ManagerDriver ( " google " , urlPagina);
    		objManager . navegarAPagina ();
    		PageObjectTourF objTour =  new  PageObjectTourF(objManager.getWebDriver());
    		objTour.seleccionListaDesplegar("Etapa 17");
    		espera(5);    		
    		objTour.imprimirListaCiclista();
    		
    		objManager.cerrarNavegador(); 
	
    }

public static void espera(int tiempo) {
	try {
		Thread.sleep(tiempo*1000);
	}catch (Exception e) {
		// TODO: handle exception
	}
}
 


	public void clase3() {
		
		AutoPaginaWeb objLanzaPagina = new AutoPaginaWeb();
		objLanzaPagina.interactuarGmail();
	}
}

