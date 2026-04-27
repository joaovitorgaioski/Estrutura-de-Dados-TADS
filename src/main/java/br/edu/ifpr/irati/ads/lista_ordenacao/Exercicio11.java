package br.edu.ifpr.irati.ads.lista_ordenacao;

import java.util.Arrays;

public class Exercicio11 {
    static void main(String[] args) {
        int[] v = {100, 95, 80, 70, 65, 50, 40, 30, 20, 10};

        System.out.println(Arrays.toString(v));
        insertionSort(v, 85);
        insertionSort(v, 55);
        System.out.println(Arrays.toString(v));
    }

    public static void insertionSort(int v[], int x) {

        if (v[v.length - 1] > x) return;
        v[v.length - 1] = x;
        int i = v.length - 1;

        for (int j = i; j > 0; j--) {
            if (v[j] > v[j - 1]) {
                swap(v, j - 1, j);
            }
        }
    }

    public static void swap(int v[], int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
