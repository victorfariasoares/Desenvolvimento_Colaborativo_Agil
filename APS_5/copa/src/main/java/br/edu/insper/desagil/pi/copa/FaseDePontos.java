package br.edu.insper.desagil.pi.copa;

import java.util.*;

public class FaseDePontos extends Fase{
    public FaseDePontos(List<Partida> partidas) {
        super(partidas);
    }

    private Map<String, Integer> definePontos() {

        Map<String, Integer> pontos = new HashMap<>();

        for (Partida partida : getPartidas()) {
            String mandante = partida.getTimeMandante().getSigla();
            String visitante = partida.getTimeVisitante().getSigla();
            int golsMandante = partida.getGolsMandante();
            int golsVisitante = partida.getGolsVisitante();

            if (golsMandante > golsVisitante) {
                pontos.put(mandante, pontos.getOrDefault(mandante, 0) + 2);
            } else if (golsMandante == golsVisitante) {
                pontos.put(mandante, pontos.getOrDefault(mandante, 0) + 1);
                pontos.put(visitante, pontos.getOrDefault(visitante, 0) + 1);
            } else {
                pontos.put(visitante, pontos.getOrDefault(visitante, 0) + 2);
            }
        }
        return pontos;
    }
    @Override
    public List<String> defineClassificados() {
        Map<String, Integer> pontos = definePontos();
        int maximo = Collections.max(pontos.values());

        List<String> classificados = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : pontos.entrySet()) {
            if (entry.getValue() == maximo) {
                classificados.add(entry.getKey());
            }
        }
        return classificados;
    }
}

