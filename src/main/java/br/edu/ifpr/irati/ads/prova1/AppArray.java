package br.edu.ifpr.irati.ads.prova1;

public class AppArray {
    public static void main(String[] args) throws OverflowException, NotFoundException {
        Partida p1 = new Partida("Jogador A", 80);
        Partida p2 = new Partida("Jogador B", 25);
        Partida p3 = new Partida("Jogador C", 68);
        iArray<Partida> array3 = new MyNewArray<>();

        System.out.println(array3);

        array3.add(p1);
        array3.add(p2);
        array3.add(p3);

        System.out.println(array3);

        array3.remove(p2);

        System.out.println(array3);

        Partida p4 = new Partida("Jogador D", 15);
        array3.add(p4);

        System.out.println(array3);

    }
}
