package br.edu.insper.desagil.aps2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TemporadaTest {
    private Temporada t;

    @BeforeEach
    void setUp() {
        t = new Temporada();
    }

    @Test
    void constroiVazia() {
        assertTrue(t.getEpisodios().isEmpty());
    }

    @Test
    void adicionaCom0h05() {
        adicionaEpisodio(1, 5);
        assertEquals("0:05", t.duracaoEmHoras());
    }

    @Test
    void adicionaCom0h30() {
        adicionaEpisodio(1, 5);
        adicionaEpisodio(2, 25);
        assertEquals("0:30", t.duracaoEmHoras());
    }

    @Test
    void adicionaCom1h05() {
        adicionaEpisodio(1, 5);
        adicionaEpisodio(2, 25);
        adicionaEpisodio(4, 35);
        assertEquals("1:05", t.duracaoEmHoras());
    }

    @Test
    void adicionaCom2h35() {
        adicionaEpisodio(1, 5);
        adicionaEpisodio(2, 25);
        adicionaEpisodio(4, 35);
        adicionaEpisodio(5, 90);
        assertEquals("2:35", t.duracaoEmHoras());
    }

    private void adicionaEpisodio(int numero, int duracao) {
        Episodio episodio = mock(Episodio.class);
        when(episodio.duracaoEmMinutos()).thenReturn(duracao);
        t.adicionaEpisodio(numero, episodio);
    }
}
