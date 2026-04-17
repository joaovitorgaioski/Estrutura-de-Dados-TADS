package br.edu.ifpr.irati.ads.lista_arrays;

public class Exercicio7 {
    public static double[][] transpor (double[][] m){
        int l = m.length;
        int c = m[0].length;

        double[][] t = new double[c][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = m[i][j];
            }
        }

        return t;
    }

    public static void imprimirMatriz (double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] m = {{7,8}, {4,0}, {1,2}};

        imprimirMatriz(m);

        double[][] mt = transpor(m);
        System.out.println();

        imprimirMatriz(mt);
    }
}
