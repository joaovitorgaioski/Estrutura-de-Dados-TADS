package br.edu.ifpr.irati.ads.prova2;

import java.util.Comparator;

public class ProdutoComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return (int) (100 * (p1.getPreco() - p2.getPreco()));
    }
}