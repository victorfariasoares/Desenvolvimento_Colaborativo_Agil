package br.edu.insper.desagil.aps3.fifthfloor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartamentoTest {
    private static final double DELTA = 0.01;
    private Apartamento apTeste;
    private Map<String, String> MapTeste;

    @Test
    void constroi(){
        apTeste = new Apartamento("Amplo e bem cuidado", "Rua Quatá", 4457.67);
        MapTeste = apTeste.resume();
        double valor = Double.parseDouble(MapTeste.get("Condomínio"));
        assertEquals("Amplo e bem cuidado", MapTeste.get("Descrição"));
        assertEquals("Rua Quatá", MapTeste.get("Endereço"));
        assertEquals(4457.67, valor, DELTA);
    }
}
