package br.edu.insper.desagil.aps3.fifthfloor;

import java.util.HashMap;
import java.util.Map;

public class Casa extends Imovel{
    private boolean deVila;
    public Casa(String descricao, String endereco, boolean deVila) {
        super(descricao, endereco);
        this.deVila = deVila;
    }
    @Override
    public Map<String, String> resume() {
        Map<String, String> resumo = new HashMap<>();
        resumo.put("Descrição", getDescricao());
        resumo.put("Endereço", getEndereco());
        if (deVila) {
            resumo.put("Vila?", "SIM");
        } else {
            resumo.put("Vila?", "NÃO");
        }
        return resumo;
    }
}
