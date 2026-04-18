package br.edu.ifpr.irati.ads;

public class AppArray {

    public static void main(String[] args) throws OverflowException {

        IArray<Partida> array1 = new Array<>(20);
        array1.add(new Partida("Jogador 1", 100));
        array1.add(new Partida("Jogador 99", 56));
        System.out.println(array1);

        IArray<Carta> array2 = new Array<>(20);
        array2.add(new Carta('A',1,new Naipe("copas")));
        array2.add(new Carta('*',10,new Naipe("paus")));
        System.out.println(array2);

    }

}
