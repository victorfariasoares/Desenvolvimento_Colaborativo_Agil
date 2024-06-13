package br.edu.insper.desagil.aps3.fifthfloor;

import java.util.HashMap;
import java.util.Map;

public class Apartamento extends Imovel {
    private double condominio;
    public Apartamento(String descricao, String endereco, double condominio) {
        super(descricao, endereco);
        this.condominio = condominio;
    }
    public void setCondominio(double condominio) {
        this.condominio = condominio;
    }
    @Override
    public Map<String, String> resume() {
        Map<String, String> resumo = new HashMap<>();
        resumo.put("Descrição", getDescricao());
        resumo.put("Endereço", getEndereco());
        resumo.put("Condomínio", Double.toString(condominio));
        return resumo;
    }

}
