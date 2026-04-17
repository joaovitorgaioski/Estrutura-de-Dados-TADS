package br.edu.ifpr.irati.ads.prova1;

public class ExercicioProva {

    public static double[][] transpor(double[][] m) {
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

    public static void imprimirMatriz(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Reaproveitei o metodo transpor
    public static double[][] rotacionarMatriz(double[][] m) {
        double[][] mT = transpor(m);

        int l = mT.length;
        int c = mT[0].length;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c / 2; j++) {
                double temp = mT[i][j];
                mT[i][j] = mT[i][c - 1 - j];
                mT[i][c - 1 - j] = temp;
            }
        }
        return mT;
    }

    public static void main(String[] args) {
        double[][] m = {{9, 2}, {7, 8}, {4, 0}, {1, 2}};

        System.out.println("Matriz Original:");
        imprimirMatriz(m);

        double[][] mRotacionada = rotacionarMatriz(m);

        System.out.println("Matriz Rotacionada:");
        imprimirMatriz(mRotacionada);
    }
}
