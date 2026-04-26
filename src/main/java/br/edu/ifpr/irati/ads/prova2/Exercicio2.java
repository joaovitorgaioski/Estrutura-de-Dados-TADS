package br.edu.ifpr.irati.ads.prova2;

import java.util.Random;

public class Exercicio2 {

    public static Produto gerarProduto() {
        Random random = new Random();
        Produto p = new Produto();

        p.setNome("Produto" + random.nextInt(1, 1000000));
        p.setPreco(random.nextDouble(1, 10000));

        return p;
    }

    public static void main(String[] args) throws OverflowException, NotFoundException {
        IArray<Produto> produtos = new Array<>(1000000);

        for (int i = 0; i < 1000000; i++) {
            produtos.add(gerarProduto());
        }

        System.out.println("Ordenando...");
        produtos.sort(SortAlgorithm.SELECTIONSORT, Order.ASC, new ProdutoComparator(), 4);

        System.out.println("10 primeiros elementos. Os quatro mais baratos estão ordenados no início da lista:");
        for (int i = 0; i < 10; i++) {
            System.out.println(produtos.get(i).getNome() + "\t" + produtos.get(i).getPreco());
        }
    }
}
