package br.edu.ifpr.irati.ads;

public class AppOrdenacao {

    public static void main(String[] args) throws OverflowException {

        Partida p1 = new Partida("jogador 1",100);
        Partida p2 = new Partida("jogador 2",70);
        Partida p3 = new Partida("jogador 3",110);
        Partida p4 = new Partida("jogador 4",50);
        Partida p5 = new Partida("jogador 5",91);

        IArray<Partida> array = new Array<>(5);
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
        array.add(p5);
        System.out.println(array);
        PartidaComparator pComparator = new PartidaComparator();
        //array.sort(pComparator);
        array.sort(SortAlgorithm.INSERTIONSORT, Order.ASC, pComparator);
        System.out.println(array);
    }

}
