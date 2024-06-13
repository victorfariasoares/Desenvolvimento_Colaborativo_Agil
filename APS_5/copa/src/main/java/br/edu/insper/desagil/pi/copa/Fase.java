package br.edu.insper.desagil.pi.copa;

import java.util.ArrayList;
import java.util.List;


public abstract class Fase {
    private List<Partida> partidas;

    public Fase (List<Partida> partidas){
        this.partidas = partidas;
    }

    public List<Partida> getPartidas(){
        return partidas;
    }
    public abstract List<String> defineClassificados();
}

