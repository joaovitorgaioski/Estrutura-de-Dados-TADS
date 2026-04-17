package br.edu.ifpr.irati.ads.lista_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] v = new float[10];
        float menor, maior;

        // ler os valores
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            v[i] = scan.nextFloat();
        }

        // achar o maior e menor
        menor = v[0];
        maior = v[0];

        for (int i = 1; i < 10; i++) {
            if (v[i] < menor)
                menor = v[i];
            if (v[i] > maior)
                maior = v[i];
        }

        System.out.println(Arrays.toString(v));
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
