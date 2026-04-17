package br.edu.ifpr.irati.ads.sort;

import java.util.Arrays;

public class Ordenacao {

    /**
     * Troca de posição dois elementos de um array
     *
     * @param v array
     * @param i elemento à esquerda
     * @param j elemento à direita
     */
    public static void swap(int v[], int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    /**
     * Bubble Sort:
     * Joga os maiores à direita
     *
     * @param v array
     */
    public static void bubbleSort(int v[]) {
        for (int i = v.length - 1; i >= 1; i--) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    swap(v, j, j + 1);
                }
            }
        }
    }

    /**
     * Selection Sort:
     * Percorre e busca o menor, coloca o menor na próxima posição
     * do menor para o maior. Segue essa lógica por todo o array
     *
     * @param v array
     */
    public static void selectionSort(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (int j = i; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            swap(v, i, menor);
        }
    }

    /**
     * Insertion Sort:
     * Os da esquerda estão ordenados, segue à frente.
     * Compara o próximo com todos da esquerda, assim por diante.
     *
     * @param v array
     */
    public static void insertionSort(int v[]) {
        for (int i = 1; i < v.length; i++) {
            for (int j = i; j > 0; j--) {
                if (v[j] < v[j - 1]) {
                    swap(v, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] v = {7, 2, 11, 1, 9, 12, 10, 5, 3, 14, 8, 4, 6, 15, 13};

        System.out.println("Array desordenado: ");
        System.out.println(Arrays.toString(v));

        Embaralhamento.shuffle(v);
        System.out.println("Bubble Sort");
        bubbleSort(v);
        System.out.println(Arrays.toString(v));

        Embaralhamento.shuffle(v);
        System.out.println("Selection Sort");
        selectionSort(v);
        System.out.println(Arrays.toString(v));

        Embaralhamento.shuffle(v);
        System.out.println("Insertion Sort");
        insertionSort(v);
        System.out.println(Arrays.toString(v));
    }
}
