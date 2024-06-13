package br.edu.insper.desagil.pi.copa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class PartidaTest {
    private Time MandanteTest;
    private Time VisitanteTest;
    private int golsMandante;
    private int golsVisitante;

    private Partida partidaTest;

    @BeforeEach
    void setUp(){
        MandanteTest = mock(Time.class);
        VisitanteTest = mock(Time.class);
        partidaTest = new Partida(MandanteTest, VisitanteTest);
    }

    @Test
    void controi(){
        assertEquals(MandanteTest, partidaTest.getTimeMandante());
        assertEquals(VisitanteTest, partidaTest.getTimeVisitante());
        assertEquals(0, partidaTest.getGolsMandante());
        assertEquals(0, partidaTest.getGolsVisitante());
    }
    @Test
    void marcaGolMandante(){
        partidaTest.marcaGolMandante();
        assertEquals(1, partidaTest.getGolsMandante());
    }
    @Test
    void marcaGolVisitante(){
        partidaTest.marcaGolVisitante();
        assertEquals(1, partidaTest.getGolsVisitante());
    }
}
