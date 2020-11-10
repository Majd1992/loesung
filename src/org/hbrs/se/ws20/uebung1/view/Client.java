package org.hbrs.se.ws20.uebung1.view;


import org.hbrs.se.ws20.uebung1.control.Factory;
import org.hbrs.se.ws20.uebung1.control.Translator;

public class Client {
	private Translator translator;
	public void setTranslator(Translator translator) {
		this.translator = translator;
	}
	public void display( int aNumber ){
		/*In dieser Methode werden Objecte der Klasse GermanTranslator erzeugt,
		* ohne die new Operator zu verwenden.
		*/
		Translator trans = Factory.createTranslator();



		System.out.println("Das Ergebnis der Berechnung: " +
				trans.translateNumber(aNumber));

	}
}




