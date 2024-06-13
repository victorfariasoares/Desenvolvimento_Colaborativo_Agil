package br.edu.insper.desagil.aps2;

public class Episodio {

    private Diretor diretor;
    private String titulo;
    private int segundos;

    Episodio(Diretor diretor, String titulo, int segundos){

        this.diretor = diretor;
        this.titulo = titulo;
        this.segundos = segundos;


    }

    public Diretor getDiretor(){

        return this.diretor;

    }

    public String getTitulo(){

        return this.titulo;

    }


    public int duracaoEmMinutos(){

        return this.segundos/60;

    }

}
