package br.edu.ifpr.irati.ads;

import java.util.Comparator;

public class PartidaComparator implements Comparator<Partida> {

    @Override
    public int compare(Partida p1, Partida p2) {
        return (int) (p1.getScore() - p2.getScore());
    }
}
