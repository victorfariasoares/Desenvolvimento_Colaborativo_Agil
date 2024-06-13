package br.edu.insper.desagil.aps2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiretorTest {
    private Diretor d;

    @BeforeEach
    void setUp() {
        d = new Diretor(0, "Bill Lawrence");
    }

    @Test
    void constroi() {
        assertEquals(0, d.getId());
        assertEquals("Bill Lawrence", d.getNome());
    }

    @Test
    void mudaNome() {
        d.setNome("William Van Duzer Lawrence IV");
        assertEquals("William Van Duzer Lawrence IV", d.getNome());
    }
}
