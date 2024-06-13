package br.edu.insper.desagil.pi.copa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FaseMataMataTest {
    private Partida partida1Test;
    private Partida partida2Test;
    private FaseMataMata faseTest;
    private Time time1test;
    private Time time3test;


    @BeforeEach
    void setUp(){
        List<Partida> partidasTest = new ArrayList<>();
        time1test = new Time("BARCELONA", "BAR");
        Time time2test = new Time("CUIABA", "CUI");
        time3test = new Time("FLAMENGO", "FLA");;
        Time time4test = new Time("GOIAS", "GOI");
        partida1Test = new Partida(time1test, time2test);
        partida2Test = new Partida(time3test, time4test);
        partidasTest.add(partida1Test);
        partidasTest.add(partida2Test);
        faseTest = new FaseMataMata(partidasTest);
    }
    @Test
    void comEmpate(){
        partida1Test.marcaGolMandante();

        assertThrows(IllegalStateException.class, faseTest::defineClassificados);

    }
    @Test
    void semEmpate(){
        partida1Test.marcaGolMandante();
        partida2Test.marcaGolMandante();
        List<String> classificadosTest = new ArrayList<>();
        classificadosTest.add(time1test.getSigla());
        classificadosTest.add(time3test.getSigla());
        assertEquals(classificadosTest, faseTest.defineClassificados());
    }
}