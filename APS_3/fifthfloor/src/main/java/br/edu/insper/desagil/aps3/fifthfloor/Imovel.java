package br.edu.insper.desagil.aps3.fifthfloor;

import java.util.Map;
public abstract class Imovel {
    protected String descricao;
    private String endereco;

    public Imovel(String descricao, String endereco) {
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public abstract Map<String, String> resume();
}
