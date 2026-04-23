package br.edu.ifpr.irati.ads.lista_ordenacao;

import br.edu.ifpr.irati.ads.*;

public class Exercicio10 {
    static void main(String[] args) throws OverflowException {
        Produto p1 = new Produto("Computador", 3500, 3.0f);
        Produto p2 = new Produto("Notebook", 3500, 3.5f);
        Produto p3 = new Produto("Monitor", 1000.99, 4.0f);
        Produto p4 = new Produto("Smartphone", 1200, 2.0f);
        Produto p5 = new Produto("SmartTV 55", 3400, 4.7f);

        IArray<Produto> produtos = new Array<>(5);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        System.out.println("Produtos:");
        System.out.println(produtos);
        System.out.println("Produtos ordenados:");
        produtos.sort(SortAlgorithm.INSERTIONSORT, Order.ASC, new ProdutoComparator());
        System.out.println(produtos);
    }
}
