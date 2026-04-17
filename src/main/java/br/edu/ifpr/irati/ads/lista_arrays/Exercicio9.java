package br.edu.ifpr.irati.ads.lista_arrays;

import java.util.Date;
import java.util.Random;

public class Exercicio9 {
    public static int[][][] gerarArray3d(int i, int j, int k, int inf, int sup) {
        Random random = new Random(new Date().getTime());
        int[][][] a = new int[i][j][k];

        for (int ii = 0; ii < i; ii++) {
            for (int jj = 0; jj < j; jj++) {
                for (int kk = 0; kk < k; kk++){
                    a[ii][jj][kk] = random.nextInt(inf, sup);
                }
            }
        }

        return a;
    }

    public static void imprimirArray3d(int[][][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Solução gambiarra só pra testar
    public static void imprimirArrayFloat3d(float[][][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static float calcularMediaArray3d(int[][][] array) {
        int d1 = array.length;
        int d2 = array[0].length;
        int d3 = array[0][0].length;
        int tamanho = d1 * d2 * d3;
        int soma = 0;

        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                for (int k = 0; k < d3; k++) {
                    soma += array[i][j][k];
                }
            }
        }

        // Casting
        return (float) soma / tamanho;
    }

    public static float[][][] dividirArray3dporConstante(int[][][] array, float c) {
        int d1 = array.length;
        int d2 = array[0].length;
        int d3 = array[0][0].length;

        float[][][] arrayR = new float[d1][d2][d3];

        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                for (int k = 0; k < d3; k++) {
                    arrayR[i][j][k] = array[i][j][k] / c;
                }
            }
        }

        return arrayR;
    }

    public static void main(String[] args) {
        int[][][] m = gerarArray3d(3, 28, 28, 0, 255);

        System.out.println("Array gerado: \n");
        imprimirArray3d(m);

        System.out.println("\n\nMédia: " + calcularMediaArray3d(m));

        System.out.println("\n\nArray dividido por constante: \n");
        imprimirArrayFloat3d(dividirArray3dporConstante(m, 255));
    }
}
