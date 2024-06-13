package br.edu.insper.desagil.aps3.fifthfloor;
public class Oferta {
    private final String cpf;
    private double preco;
    private boolean aceita;

    public Oferta(String cpf, double preco) {
        this.cpf = cpf;
        this.preco = preco;
        this.aceita = false;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAceita() {
        return aceita;
    }

    public void setAceita(boolean aceita) {
        this.aceita = aceita;
    }
}