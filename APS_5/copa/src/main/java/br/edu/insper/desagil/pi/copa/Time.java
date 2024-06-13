package br.edu.insper.desagil.pi.copa;

public class Time {

    private String nome;
    private String sigla;

    public Time(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }
}
