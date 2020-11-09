package org.hbrs.se.ws20.uebung1.control;
import java.lang.ArrayIndexOutOfBoundsException;
public class GermanTranslator implements Translator {

	public String date = "Okt/2020"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		try {
			String[] erg = {"eins", "zwei", "drei", "vier", "fuenf", "sechs", "sieben", "acht", "neun", "zehn"};
			return erg[number - 1];
		}
		catch(ArrayIndexOutOfBoundsException e) {
		return "Übersetzung der Zahl ("+number+") nicht moeglich("+ version+")";

		}
	}
		
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo() {
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Nov/2020))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
