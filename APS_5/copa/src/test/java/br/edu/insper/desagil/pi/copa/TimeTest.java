package br.edu.insper.desagil.pi.copa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    private Time timeTest;

    @BeforeEach
    void setUp(){
        timeTest = new Time("Palmeiras", "PAL");
    }
    @Test
    void constroi(){
    assertEquals("Palmeiras", timeTest.getNome());
    assertEquals("PAL", timeTest.getSigla());
    }

    @Test
    void mudaNome(){
        timeTest.setNome("MAIOR DO BRASIL");
        assertEquals("MAIOR DO BRASIL", timeTest.getNome());
    }
}
