package br.edu.insper.desagil.aps2;

public class Diretor {
    private int id;
    private String nome;

    public Diretor(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
