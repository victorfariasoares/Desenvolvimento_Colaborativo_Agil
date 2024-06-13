package br.edu.insper.desagil.aps3.fifthfloor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasaTest {
    private Casa casaTeste;
    private Map<String, String> MapTeste;

    @Test
    void constroi(){
        casaTeste = new Casa("bonita", "rua quata" , false);
        MapTeste = casaTeste.resume();
        assertEquals("bonita", MapTeste.get("Descrição"));
        assertEquals("rua quata", MapTeste.get("Endereço"));
        assertEquals("NÃO", MapTeste.get("Vila?"));
    }
}
