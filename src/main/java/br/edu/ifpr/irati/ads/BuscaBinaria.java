package br.edu.ifpr.irati.ads;

public class BuscaBinaria {

    public static int buscaBinaria(int[] v, int n) {
        int inicio = 0;
        int fim = v.length - 1;

        for (int i = 0; i <= fim; i++) {
            int meio = (fim + inicio) / 2;

            if (v[meio] == n) return meio;
            if (n < v[meio]) fim = meio - 1;
            else inicio = meio + 1;
        }

        return -1;
    }

    private static int buscaBinariaR(int[] v, int n, int inicio, int fim) {
        int meio = (fim + inicio) / 2;

        if (v[meio] == n) return meio;
        if (inicio > fim) return -1;
        if (n < v[meio]) return buscaBinariaR(v, n, inicio, meio - 1);
        if (n > v[meio]) return buscaBinariaR(v, n, meio + 1, fim);

        return -1;
    }

    public static int buscaBinariaRecursiva(int[] v, int n) {
        return buscaBinariaR(v, n, 0, v.length - 1);
    }

    static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 8;

        System.out.println("Busca com laço: " + buscaBinaria(v, n));
        System.out.println("Busca com recursividade: " + buscaBinariaRecursiva(v, n));
    }
}
