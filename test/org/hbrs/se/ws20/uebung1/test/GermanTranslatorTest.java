package org.hbrs.se.ws20.uebung1.test;

import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.control.Translator;
import org.hbrs.se.ws20.uebung1.view.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.ArrayIndexOutOfBoundsException;
import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {
    Translator trans;
    @BeforeEach
    void setup(){
        trans = new GermanTranslator();
    }
    @Test
    void translateNumbertest() {
        assertEquals("acht", trans.translateNumber(8));
        assertEquals("fuenf", trans.translateNumber(5));
        assertEquals("Übersetzung der Zahl ("+-11+") nicht moeglich("+ trans.version+")",trans.translateNumber(-11));
        assertEquals("Übersetzung der Zahl ("+15+") nicht moeglich("+ trans.version+")",trans.translateNumber(15));
        assertEquals("Übersetzung der Zahl ("+0+") nicht moeglich("+ trans.version+")",trans.translateNumber(0));
    }


        }

