package br.edu.ifpr.irati.ads.sort;

import java.util.Date;
import java.util.Random;

public class Embaralhamento {

    /**
     * Algoritmo de Fisher e Yates para embaralhamento,
     * versão de Richard Durstenfeld, de 1964. Popularizada
     * por Donald E. Knuth no livro The Art of Computer Programing
     *
     * @param a
     */

    public static void shuffle(int[] a) {
        Random random = new Random(new Date().getTime());
        for (int i = a.length - 1; i >= 1; i--) {
            int j = random.nextInt(i);//entre 0 e o pivô sem incluir este último
            int aux = a[i];
            a[i] = a[j];
            a[j] = aux;
        }
    }
}

