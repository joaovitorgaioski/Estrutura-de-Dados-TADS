package br.edu.ifpr.irati.ads;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenacaoPartidas {

    public static void swap(Partida[] v, int i, int j){
        Partida aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void bubbleSort(Partida[] v, Comparator<Partida> comparator) {

        for (int i = v.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(v[j], v[j + 1])  > 0) {
                    swap(v, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {

        Partida p1 = new Partida("jogador 1",100);
        Partida p2 = new Partida("jogador 2",70);
        Partida p3 = new Partida("jogador 3",110);
        Partida p4 = new Partida("jogador 4",50);
        Partida p5 = new Partida("jogador 5",91);
        Partida[] partidas = {p1, p2, p3, p4, p5};
        for (Partida p: partidas){
            System.out.println(p);
        }
        PartidaComparator pComparator = new PartidaComparator();
        bubbleSort(partidas, pComparator);
        System.out.println("\n\nOrdenado\n");
        for (Partida p: partidas){
            System.out.println(p);
        }


    }


}
