package br.edu.insper.desagil.aps3.fifthfloor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Anuncio {

    private double preco;
    private final Imovel imovel;
    private final List<Oferta> ofertas;
    private boolean ativo;

    public Anuncio(Imovel imovel, double preco) {
        this.imovel = imovel;
        this.preco = preco;
        this.ofertas = new ArrayList<>();
        this.ativo = true;
    }

    public double getPreco() {
        return preco;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Oferta maiorOferta() {
        if (ofertas.isEmpty()){
            return null;
        }
        Oferta maior_oferta = null;
        double maior_preco = -0.1;

        for(Oferta oferta : ofertas) {
            double precoAtual = oferta.getPreco();
            if(precoAtual > maior_preco){
                maior_preco = precoAtual;
                maior_oferta = oferta;
                }
            }
            return maior_oferta;
    }

    public void fazOferta(String cpf, double preco) {
        boolean encontrou = false;
        for (Oferta oferta : ofertas) {
            if (oferta.getCpf().equals(cpf)) {
                oferta.setPreco(preco);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            ofertas.add(new Oferta(cpf, preco));
        }
    }

    public void fecha(String cpf) {
        for(Oferta oferta : ofertas){
            if (Objects.equals(cpf, oferta.getCpf())){
                oferta.setAceita(true);
                ativo = false;
            }
        }
    }
}