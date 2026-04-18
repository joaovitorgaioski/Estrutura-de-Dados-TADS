package br.edu.ifpr.irati.ads.sort;

import java.util.Arrays;
import java.util.Random;

public class AvaliacaoPerformance {

    public static void imprimirTempo(long i, long f) {
        System.out.println("Tempo total: " + (f - i)/1000000.0 + " milisegundos");
    }

    public static void imprimirTempo(double t) {
        System.out.println("Tempo total: " + t/1000000.0 + " milisegundos");
    }

    public static double calcularMedia(long[] t, int warmup) {
        long soma = 0;
        for (int i = warmup; i < t.length; i++){
            soma += t[i];
        }
        return 1.0*soma / (t.length-warmup);
    }

    public static void main(String[] args) throws OverflowException {

        int N = 500;
        int trials = 10;
        int warmup = 5;
        int inf = -2*N;
        int sup = 2*N;
        long[] tB, tS, tI;
        tB = new long[trials];
        tS = new long[trials];
        tI = new long[trials];

        for (int t = 0; t < trials; t++){
            System.out.println("Trial #"+(t+1));

            iArray<Integer> arrayB = new Array<>(N);
            iArray<Integer> arrayS = new Array<>(N);
            iArray<Integer> arrayI = new Array<>(N);

            System.out.println("Gerando os arrays...");
            Random random = new Random(0);
            for (int i = 0; i < N; i++) {
                int x = random.nextInt(inf,sup);
                arrayB.add(x);
                arrayS.add(x);
                arrayI.add(x);
            }

            IntegerComparator comparator = new IntegerComparator();
            long tempoInicio = 0;
            long tempoFinal = 0;

            System.out.println("Ordenando com o BubbleSort...");
            tempoInicio = System.nanoTime();
            arrayB.sort(SortAlgorithm.BUBBLESORT, comparator);
            tempoFinal = System.nanoTime();
            tB[t] = tempoFinal - tempoInicio;

            System.out.println("Ordenando com o SelectionSort...");
            tempoInicio = System.nanoTime();
            arrayS.sort(SortAlgorithm.SELECTIONSORT, comparator);
            tempoFinal = System.nanoTime();
            tS[t] = tempoFinal - tempoInicio;

            System.out.println("Ordenando com o InsertionSort...");
            tempoInicio = System.nanoTime();
            arrayI.sort(SortAlgorithm.INSERTIONSORT, comparator);
            tempoFinal = System.nanoTime();
            tI[t] = tempoFinal - tempoInicio;
        }

        System.out.println("---==== Resumo ====---");
        System.out.println("BubbleSort");
        System.out.println(Arrays.toString(tB));
        imprimirTempo(calcularMedia(tB, warmup));
        System.out.println("SelectionSort");
        System.out.println(Arrays.toString(tS));
        imprimirTempo(calcularMedia(tS, warmup));
        System.out.println("InsertionSort");
        System.out.println(Arrays.toString(tI));
        imprimirTempo(calcularMedia(tI, warmup));


    }

}