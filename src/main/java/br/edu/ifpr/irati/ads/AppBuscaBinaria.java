package br.edu.ifpr.irati.ads;

public class AppBuscaBinaria {
    static void main(String[] args) throws OverflowException, NotFoundException {
        IArray<Partida> array = new Array<>(10);

        Partida p = new Partida("Partida Legal", 30);

        array.add(new Partida("Partida não tão legal", 80));
        array.add(new Partida("Partido ao meio", 10));
        array.add(p);
        array.add(new Partida("Particionamento", 50));
        array.add(new Partida("Partido Político", 20));

        System.out.println("Busca binária: " + array.binarySearch(p, new PartidaComparator()));
        System.out.println(array);
    }
}
