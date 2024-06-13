package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinterTest {
    private Linter l;

    @BeforeEach
    void setUp() {
        l = new Linter();
    }

    @Test
    void digitos() {
        assertEquals("", l.limpa("012"));
    }

    @Test
    void digitosMaiusculas() {
        assertEquals("abc", l.limpa("012ABC"));
    }

    @Test
    void digitosMaiusculasAlternados() {
        assertEquals("abc", l.limpa("0A1B2C"));
    }

    @Test
    void digitosMaiusculasMinusculas() {
        assertEquals("abcxyz", l.limpa("012ABCxyz"));
    }

    @Test
    void digitosMaiusculasMinusculasAlternados() {
        assertEquals("axbycz", l.limpa("0Ax1By2Cz"));
    }

    @Test
    void digitosMinusculas() {
        assertEquals("xyz", l.limpa("012xyz"));
    }

    @Test
    void digitosMinusculasAlternados() {
        assertEquals("xyz", l.limpa("0x1y2z"));
    }

    @Test
    void digitosMinusculasMaiusculas() {
        assertEquals("xyzabc", l.limpa("012xyzABC"));
    }

    @Test
    void digitosMinusculasMaiusculasAlternados() {
        assertEquals("xaybzc", l.limpa("0xA1yB2zC"));
    }

    @Test
    void maiusculas() {
        assertEquals("abc", l.limpa("ABC"));
    }

    @Test
    void maiusculasDigitos() {
        assertEquals("abc", l.limpa("ABC012"));
    }

    @Test
    void maiusculasDigitosAlternados() {
        assertEquals("abc", l.limpa("A0B1C2"));
    }

    @Test
    void maiusculasDigitosMinusculas() {
        assertEquals("abcxyz", l.limpa("ABC012xyz"));
    }

    @Test
    void maiusculasDigitosMinusculasAlternados() {
        assertEquals("axbycz", l.limpa("A0xB1yC2z"));
    }

    @Test
    void maiusculasMinusculas() {
        assertEquals("abcxyz", l.limpa("ABCxyz"));
    }

    @Test
    void maiusculasMinusculasAlternadas() {
        assertEquals("axbycz", l.limpa("AxByCz"));
    }

    @Test
    void maiusculasMinusculasDigitos() {
        assertEquals("abcxyz", l.limpa("ABCxyz012"));
    }

    @Test
    void maiusculasMinusculasDigitosAlternados() {
        assertEquals("axbycz", l.limpa("Ax0By1Cz2"));
    }

    @Test
    void minusculas() {
        assertEquals("xyz", l.limpa("xyz"));
    }

    @Test
    void minusculasDigitos() {
        assertEquals("xyz", l.limpa("xyz012"));
    }

    @Test
    void minusculasDigitosAlternados() {
        assertEquals("xyz", l.limpa("x0y1z2"));
    }

    @Test
    void minusculasDigitosMaiusculas() {
        assertEquals("xyzabc", l.limpa("xyz012ABC"));
    }

    @Test
    void minusculasDigitosMaiusculasAlternados() {
        assertEquals("xaybzc", l.limpa("x0Ay1Bz2C"));
    }

    @Test
    void minusculasMaiusculas() {
        assertEquals("xyzabc", l.limpa("xyzABC"));
    }

    @Test
    void minusculasMaiusculasAlternadas() {
        assertEquals("xaybzc", l.limpa("xAyBzC"));
    }

    @Test
    void minusculasMaiusculasDigitos() {
        assertEquals("xyzabc", l.limpa("xyzABC012"));
    }

    @Test
    void minusculasMaiusculasDigitosAlternados() {
        assertEquals("xaybzc", l.limpa("xA0yB1zC2"));
    }
}
