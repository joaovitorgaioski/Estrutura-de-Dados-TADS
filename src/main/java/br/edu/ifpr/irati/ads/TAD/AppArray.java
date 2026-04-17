package br.edu.ifpr.irati.ads.TAD;

public class AppArray {
    public static void main(String[] args) throws OverflowException {
        // Array é possível pois criamos a interface iArray
        iArray<Partida> array1 = new Array(20);

        array1.add(new Partida("Jogador 1", 100));
        array1.add(new Partida("Jogador 99", 56));
        System.out.println(array1);

        iArray<Carta> array2 = new Array(20);

        array2.add(new Carta('A', 1, new Naipe("Copas")));
        array2.add(new Carta('2', 2, new Naipe("Espadas")));
        System.out.println(array2);
    }
}
