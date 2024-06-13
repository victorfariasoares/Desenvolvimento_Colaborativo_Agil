package br.edu.insper.desagil.aps2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SerieTest {
    private List<Temporada> temporadas;
    private Serie s;

    @BeforeEach
    void setUp() {
        temporadas = new ArrayList<>();
        s = new Serie(temporadas);
    }

    @Test
    void constroiVazia() {
        assertEquals(List.of(), s.resumo());
    }

    @Test
    void constroiComUma() {
        adicionaSerie("0:30");
        assertEquals(List.of("0:30"), s.resumo());
    }

    @Test
    void constroiComDuas() {
        adicionaSerie("0:30");
        adicionaSerie("1:05");
        assertEquals(List.of("0:30", "1:05"), s.resumo());
    }

    @Test
    void constroiComTrues() {
        adicionaSerie("0:30");
        adicionaSerie("1:05");
        adicionaSerie("2:35");
        assertEquals(List.of("0:30", "1:05", "2:35"), s.resumo());
    }

    private void adicionaSerie(String duracao) {
        Temporada temporada = mock(Temporada.class);
        when(temporada.duracaoEmHoras()).thenReturn(duracao);
        temporadas.add(temporada);
    }
}
