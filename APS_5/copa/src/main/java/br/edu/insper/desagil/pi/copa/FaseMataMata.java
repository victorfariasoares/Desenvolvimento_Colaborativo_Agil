package br.edu.insper.desagil.pi.copa;

import java.util.ArrayList;
import java.util.List;

public class FaseMataMata extends Fase {

    public FaseMataMata(List<Partida> partidas) {
        super(partidas);
    }
    @Override
    public List<String> defineClassificados() {
        List<String> classificados = new ArrayList<>();
        for (Partida partida : getPartidas()) {
            try {
                if (partida.getGolsMandante() == partida.getGolsVisitante()) {
                    // Aqui, a exceção é lançada
                    throw new IllegalStateException("Disputa de Penaltis!");
                } else if (partida.getGolsMandante() > partida.getGolsVisitante()) {
                    classificados.add(partida.getTimeMandante().getSigla());
                } else {
                    classificados.add(partida.getTimeVisitante().getSigla());
                }
            } catch (IllegalStateException e) {
                // Aqui, a excessão é tratada.
                System.err.println(e.getMessage());
            }
        }
        return classificados;
    }
}