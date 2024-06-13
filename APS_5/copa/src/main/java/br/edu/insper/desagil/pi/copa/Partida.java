package br.edu.insper.desagil.pi.copa;

public class Partida {

    private Time Mandante;
    private Time Visitante;
    private int golsMandante;
    private int golsVisitante;

    public Partida (Time timeMandante, Time timeVisitante){
        this.Mandante = timeMandante;
        this.Visitante = timeVisitante;
        this.golsMandante = 0;
        this.golsVisitante = 0;
    }

    public Time getTimeMandante() {return Mandante;}

    public Time getTimeVisitante() {return Visitante;}

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public void marcaGolMandante(){
        golsMandante ++;
    }

    public void marcaGolVisitante(){
        golsVisitante ++;
    }
}
