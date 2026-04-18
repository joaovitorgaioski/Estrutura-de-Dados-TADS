
/*
    Exemplo de uso do TAD Score

    1. Criar 5 objetos Partida;
    2. Criar um Array (Scores) para 5 posições;
    3. Adicionar 3 objetos e imprimir o Array
    4. Adicionar mais 2 objetos;
    5. Testar se está cheio;
    6. Pedir pelo tamanho ocupado.
    7. Remover 3 itens, imprimir o array e imprimir o tamanho ocupado.
*/

package br.edu.ifpr.irati.ads;

public class AppScores {

    public static void main(String[] args)
            throws OverflowException, NotFoundException {

        Partida p1 = new Partida("jogador 1", 100);
        Partida p2 = new Partida("jogador 2", 70);
        Partida p3 = new Partida("jogador 3", 110);
        Partida p4 = new Partida("jogador 4", 50);
        Partida p5 = new Partida("jogador 5", 91);

        Scores scores = new Scores(5);

        scores.add(p1);
        scores.add(p2);
        scores.add(p3);

        System.out.println(scores); //scores.toString()

        scores.add(p4);
        scores.add(p5);

        System.out.println(scores.isFull());

        System.out.println(scores.size());

        //e se adicionar mais um?
        //scores.add(new Partida("p6",35));

        scores.remove(p1);
        scores.remove(p3);
        scores.remove(p5);

        System.out.println(scores);
        System.out.println(scores.size());


    }

}
