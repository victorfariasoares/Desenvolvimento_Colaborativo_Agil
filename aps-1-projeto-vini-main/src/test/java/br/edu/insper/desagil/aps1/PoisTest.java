package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoisTest {
    private Pois p;

    @BeforeEach
    void setUp() {
        p = new Pois();
    }

    @Test
    void verifica1() {
        assertTrue(p.verifica(1));
    }

    @Test
    void verifica2() {
        assertTrue(p.verifica(2));
    }

    @Test
    void verifica3() {
        assertFalse(p.verifica(3));
    }

    @Test
    void verifica4() {
        assertTrue(p.verifica(4));
    }

    @Test
    void verifica5() {
        assertFalse(p.verifica(5));
    }

    @Test
    void verifica6() {
        assertFalse(p.verifica(6));
    }

    @Test
    void verifica7() {
        assertFalse(p.verifica(7));
    }

    @Test
    void verifica8() {
        assertTrue(p.verifica(8));
    }

    @Test
    void verifica9() {
        assertFalse(p.verifica(9));
    }

    @Test
    void verifica10() {
        assertFalse(p.verifica(10));
    }

    @Test
    void verifica11() {
        assertFalse(p.verifica(11));
    }

    @Test
    void verifica12() {
        assertFalse(p.verifica(12));
    }

    @Test
    void verifica13() {
        assertFalse(p.verifica(13));
    }

    @Test
    void verifica14() {
        assertFalse(p.verifica(14));
    }

    @Test
    void verifica15() {
        assertFalse(p.verifica(15));
    }

    @Test
    void verifica16() {
        assertTrue(p.verifica(16));
    }
}
