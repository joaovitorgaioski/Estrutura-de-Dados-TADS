package br.edu.ifpr.irati.ads.lista_ordenacao;

import java.util.Comparator;

public class CarroComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro c1, Carro c2) {
        return (int) ((c1.getPreco() - c2.getPreco()) * 100);
    }
}
