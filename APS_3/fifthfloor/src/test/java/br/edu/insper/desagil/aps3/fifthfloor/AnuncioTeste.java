package br.edu.insper.desagil.aps3.fifthfloor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class AnuncioTeste {
    private Imovel testeImovel;
    private Anuncio testeAnuncio;
    @BeforeEach
    void setUp(){
        testeImovel = mock(Imovel.class);
        testeAnuncio = new Anuncio(testeImovel, 15700);
    }
    @Test
    void maiorOferta(){
        testeAnuncio.fazOferta("1234",15400);
        testeAnuncio.fazOferta("4321",15400);
        testeAnuncio.fazOferta("1212",15400);
        testeAnuncio.fazOferta("4321", 15600);
        Oferta maiorOferta = testeAnuncio.maiorOferta();
        assertEquals("4321", maiorOferta.getCpf());
        assertEquals(15600, maiorOferta.getPreco(), 0.01);
    }
    @Test
    void fecha(){
        testeAnuncio.fazOferta("1234",15400);
        testeAnuncio.fazOferta("4321",15300);
        testeAnuncio.fazOferta("1212",15200);
        testeAnuncio.fecha("1234");
        assertTrue((testeAnuncio.maiorOferta()).isAceita());
        assertFalse(testeAnuncio.isAtivo());
    }
}
