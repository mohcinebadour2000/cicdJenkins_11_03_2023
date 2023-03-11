package com.cicd.cicdjenkins;

import org.apache.catalina.webresources.AbstractSingleArchiveResourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {
    Calculatrice calcul ;

    @BeforeEach
    void setup(){
        calcul = new Calculatrice(1,2) ;
    }
    @Test
    public  void testSomme(){
        assertEquals(3,calcul.somme()) ;
    }
    @Test
    void testSoustraction(){
        assertTrue(calcul.soustraction()<0);
    }
    @Test
    void testMultupl(){
        assertNotEquals(0,calcul.multuplication());
    }
    @Test
    void testGreatest(){
        assertEquals("b",calcul.greatest());
    }

}