package br.edu.ifpr.irati.ads.lista_ordenacao;

import br.edu.ifpr.irati.ads.*;

import java.util.Random;

public class Exercicio6 {
    public static Carro gerarCarro(Long seed) {
        Random random = new Random(seed);
        double preco = random.nextDouble() * random.nextInt(1000, 10000);

        return new Carro(preco);
    }

    static void main(String[] args) throws OverflowException, InterruptedException {
        IArray<Carro> carros = new Array<>(50);

        for (int i = 0; i < 50; i++) {
            Thread.sleep(5);
            carros.add(gerarCarro(System.currentTimeMillis()));
        }

        System.out.println("Carros:");
        System.out.println(carros);

        System.out.println("Carros ordenados por preço:");
        carros.sort(SortAlgorithm.BUBBLESORT, Order.ASC, new CarroComparator());
        System.out.println(carros);
    }
}
