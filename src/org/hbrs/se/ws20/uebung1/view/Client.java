package org.hbrs.se.ws20.uebung1.view;


import org.hbrs.se.ws20.uebung1.control.Factory;
import org.hbrs.se.ws20.uebung1.control.Translator;

public class Client {

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		Translator trans = Factory.translator();




		// In dieser Methode soll die Methode translateNumber
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		System.out.println("Das Ergebnis der Berechnung: " +
				trans.translateNumber(aNumber));

	}
}




