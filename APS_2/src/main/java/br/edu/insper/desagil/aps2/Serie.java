package br.edu.insper.desagil.aps2;
import java.util.ArrayList;
import java.util.List;


public class Serie {

    private List<Temporada> temporadas;

    public Serie(List<Temporada> temporadas){

        this.temporadas = temporadas;

    };

    public List<String> resumo(){

        List<String> listaTempoTemporada = new ArrayList<>();
        String tempoDaTemporada;

        for (Temporada temporada : temporadas){

            tempoDaTemporada = temporada.duracaoEmHoras();
            listaTempoTemporada.add(tempoDaTemporada);

        }

        return listaTempoTemporada;

    }



}
