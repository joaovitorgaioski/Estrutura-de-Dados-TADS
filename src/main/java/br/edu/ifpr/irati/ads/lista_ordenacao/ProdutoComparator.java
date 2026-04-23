package br.edu.ifpr.irati.ads.lista_ordenacao;

import java.util.Comparator;

public class ProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        if (p1.getPreco() > p2.getPreco())
            return 1;
        else if (p1.getPreco() < p2.getPreco())
            return -1;
        else
            return (int) (10 * -(p1.getAvaliacao() - p2.getAvaliacao()));
    }
}
