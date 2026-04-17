package br.edu.ifpr.irati.ads.TAD.exercicios;

import br.edu.ifpr.irati.ads.TAD.*;

import java.util.Random;

// Exercício 1
public class AppScores {
    public static void main(String[] args) throws OverflowException, NotFoundException {
        iArray<Partida> scores = new Scores(100);
        Random random = new Random();

        // Salvar 100 partidas
        for (int i = 0; i < 100; i++) {
            Partida p = new Partida("Partida " + i, random.nextInt(100, 1001));

            scores.add(p);
        }

        Partida pMaiorScore = scores.get(0);
        double pontuacaoMedia = 0;

        // Encontrar a maior pontuação e calcular média de pontuações
        for (int i = 1; i < 100; i++) {
            if (scores.get(i).getScore() > pMaiorScore.getScore())
                pMaiorScore = scores.get(i);

            pontuacaoMedia += scores.get(i).getScore();
        }

        System.out.println("Maior score: " + pMaiorScore);
        System.out.println("Pontuação média: " + (pontuacaoMedia / 100));
    }
}
