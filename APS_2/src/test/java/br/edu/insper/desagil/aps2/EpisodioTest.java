package br.edu.insper.desagil.aps2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

public class EpisodioTest {
    private Diretor diretor;
    private Episodio e;

    @BeforeEach
    void setUp() {
        diretor = mock(Diretor.class);
    }

    @Test
    void constroiComDuracaoExata() {
        e = new Episodio(diretor, "My First Day", 1680);
        assertSame(diretor, e.getDiretor());
        assertEquals("My First Day", e.getTitulo());
        assertEquals(28, e.duracaoEmMinutos());
    }

    @Test
    void constroiComDuracaoArredondada() {
        e = new Episodio(diretor, "My Mentor", 1775);
        assertSame(diretor, e.getDiretor());
        assertEquals("My Mentor", e.getTitulo());
        assertEquals(29, e.duracaoEmMinutos());
    }
}
