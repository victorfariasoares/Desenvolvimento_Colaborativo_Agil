package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeibnizTest {
    private static final double DELTA = 0.000001;

    private Leibniz l;

    @BeforeEach
    void setUp() {
        l = new Leibniz();
    }

    @Test
    void calculaPara1() {
        assertEquals(2.666666, l.aproxima(1), DELTA);
    }

    @Test
    void calculaPara2() {
        assertEquals(3.466666, l.aproxima(2), DELTA);
    }

    @Test
    void calculaPara3() {
        assertEquals(2.895238, l.aproxima(3), DELTA);
    }

    @Test
    void calculaPara4() {
        assertEquals(3.339682, l.aproxima(4), DELTA);
    }

    @Test
    void calculaPara5() {
        assertEquals(2.976046, l.aproxima(5), DELTA);
    }

    @Test
    void calculaPara6() {
        assertEquals(3.283738, l.aproxima(6), DELTA);
    }

    @Test
    void calculaPara7() {
        assertEquals(3.017071, l.aproxima(7), DELTA);
    }

    @Test
    void calculaPara8() {
        assertEquals(3.252365, l.aproxima(8), DELTA);
    }

    @Test
    void calculaPara16() {
        assertEquals(3.200365, l.aproxima(16), DELTA);
    }

    @Test
    void calculaPara32() {
        assertEquals(3.171888, l.aproxima(32), DELTA);
    }

    @Test
    void calculaPara64() {
        assertEquals(3.156976, l.aproxima(64), DELTA);
    }

    @Test
    void calculaPara128() {
        assertEquals(3.149344, l.aproxima(128), DELTA);
    }

    @Test
    void calculaPara256() {
        assertEquals(3.145483, l.aproxima(256), DELTA);
    }

    @Test
    void calculaPara512() {
        assertEquals(3.143541, l.aproxima(512), DELTA);
    }

    @Test
    void calculaPara1024() {
        assertEquals(3.142568, l.aproxima(1024), DELTA);
    }

    @Test
    void calculaPara2048() {
        assertEquals(3.142080, l.aproxima(2048), DELTA);
    }

    @Test
    void calculaPara4096() {
        assertEquals(3.141836, l.aproxima(4096), DELTA);
    }

    @Test
    void calculaPara8192() {
        assertEquals(3.141714, l.aproxima(8192), DELTA);
    }

    @Test
    void calculaPara16384() {
        assertEquals(3.141653, l.aproxima(16384), DELTA);
    }

    @Test
    void calculaPara32768() {
        assertEquals(3.141623, l.aproxima(32768), DELTA);
    }

    @Test
    void calculaPara65536() {
        assertEquals(3.141607, l.aproxima(65536), DELTA);
    }

    @Test
    void calculaPara131072() {
        assertEquals(3.141600, l.aproxima(131072), DELTA);
    }

    @Test
    void calculaPara262144() {
        assertEquals(3.141596, l.aproxima(262144), DELTA);
    }

    @Test
    void calculaPara524288() {
        assertEquals(3.141594, l.aproxima(524288), DELTA);
    }

    @Test
    void calculaPara1048576() {
        assertEquals(3.141593, l.aproxima(1048576), DELTA);
    }
}
