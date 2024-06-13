package br.edu.insper.desagil.aps2;
import java.util.*;

public class Temporada {

    private Map<Integer, Episodio> dict = new HashMap<>();

    public void adicionaEpisodio(int numero, Episodio episodio){

        dict.put(numero, episodio);

    }

    public String duracaoEmHoras() {

        int somaDeMinutos = 0;
        int horas = 0;
        int minutoExedentes = 0;
        String stringHoras = "";
        String stringMinutosExendentes = "";

        for (int n : dict.keySet()) {

            Episodio episodio = dict.get(n);
            somaDeMinutos += episodio.duracaoEmMinutos();

        }

        horas = somaDeMinutos / 60;
        minutoExedentes = somaDeMinutos - horas * 60;

        stringHoras = Integer.toString(horas);
        stringMinutosExendentes = Integer.toString(minutoExedentes);

        if (minutoExedentes < 10) {

            return stringHoras + ":" + "0" + stringMinutosExendentes;

        } else {

            return stringHoras + ":" + stringMinutosExendentes;

        }
    }

    public List<Episodio> getEpisodios(){

        List<Episodio> episodios = new ArrayList<>();
        for(Episodio ep : this.dict.values()){

            episodios.add(ep);

        }

        return episodios;
    }

}
