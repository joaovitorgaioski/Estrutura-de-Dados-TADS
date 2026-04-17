package br.edu.ifpr.irati.ads.TAD;

public class AppArrayObject {

    // Perceba que podemos instanciar tanto Partida quanto Carta usando o ArrayObject
    public static void main(String[] args) throws OverflowException {

        ArrayObject array1 = new ArrayObject(10);
        array1.add(new Partida("Jogador 1", 100));
        array1.add(new Partida("Jogador 99", 56));

        System.out.println(array1);

        ArrayObject array2 = new ArrayObject(15);
        array2.add(new Carta('A', 1, new Naipe("copas")));
        array2.add(new Carta('*', 10, new Naipe("paus")));
        System.out.println(array2);

        ArrayObject array3 = new ArrayObject(20);
        array3.add(new Partida("Jogador 1", 100));
        array3.add(new Partida("Jogador 99", 56));
        array3.add(new Carta('A', 1, new Naipe("copas")));
        array3.add(new Carta('*', 10, new Naipe("paus")));
        System.out.println(array3);

    }

}
