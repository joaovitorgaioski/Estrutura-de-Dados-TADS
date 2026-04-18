package br.edu.ifpr.irati.ads;

public class AppArrayObject {

    public static void main(String[] args) throws OverflowException, NotFoundException {

        ArrayObject array1 = new ArrayObject(10);
        array1.add(new Partida("Jogador 1", 100));
        array1.add(new Partida("Jogador 99", 56));

        System.out.println(array1);

        ArrayObject array2 = new ArrayObject(15);
        array2.add(new Carta('A',1,new Naipe("copas")));
        array2.add(new Carta('*',10,new Naipe("paus")));
        System.out.println(array2);

        ArrayObject array3 = new ArrayObject(20);
        array3.add(new Partida("Jogador 1", 100));
        array3.add(new Partida("Jogador 99", 56));
        array3.add(new Carta('A',1,new Naipe("copas")));
        array3.add(new Carta('*',10,new Naipe("paus")));
        System.out.println(array3);

        //presumindo que o array3 contém partidas
        for (int i = 0; i < array3.size(); i++){

            if (array3.get(i) instanceof Partida){
                System.out.println( ((Partida) array3.get(i)).getScore() );
            }

        }


    }

}
