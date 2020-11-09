
/*
*Durch die Klasse Factory und derer Methode translator
*  können wir Objecte der Schnittstelle bzw. der Klassen, die dieser SChnittstelle implementieren, erzeugen.
* das garantiert uns, dass wir bei Aufruf dieser Klassenmethode Objecte ohne new erzeugen koennen
 */
package org.hbrs.se.ws20.uebung1.control;

public class Factory {
    public static Translator translator() {
        return new GermanTranslator();
    }
}
