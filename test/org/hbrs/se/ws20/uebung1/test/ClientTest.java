package org.hbrs.se.ws20.uebung1.test;
import org.hbrs.se.ws20.uebung1.control.*;
import org.hbrs.se.ws20.uebung1.view.Client;

class ClientTest {
    Client client ;
    private Translator translator ;
    public ClientTest() {
        client = new Client();
        translator = new GermanTranslator();
        client.setTranslator( translator );
    }
    public void test(){
// Positivtests
        client.display( 1 ); // Äquivalenzklasse AK (1 <= x <=10)
// Negativtests
        client.display ( 11 ); // Äquivalenzklasse AK (x > 10)
        client.display ( -1 ); // Äquivalenzklasse AK (x < 0)
        client.display ( 0 ); // Spezial-Testfall
    }
    public void testAutomatisiert() {
        String ergebnis = this.translator.translateNumber(1);
        if ( ergebnis.equals("eins") ) {
            System.out.println("Test erfolgreich!");
        } else {
            System.out.println("Test nicht erfolgreich!");
        }
    }
    public static void main(String[] args) {
        ClientTest ass = new ClientTest();
        ass.test();
    }



}