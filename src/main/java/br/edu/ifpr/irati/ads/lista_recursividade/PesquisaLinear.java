package br.edu.ifpr.irati.ads.lista_recursividade;

// Exercício 5
public class PesquisaLinear {
    public static int pesqLin(int x, int[] vet, int i, int k) {
        if (i > k)
            return -i;
        else if (vet[i] == x)
            return i;
        else
            return pesqLin(x, vet, i + 1, k);
    }

    static void main(String[] args) {
        int[] vet = {4, 5, -1, -10, 7, 9, 2, 13, 18, -15, 11};

        System.out.println(pesqLin(9, vet, 1, 6));
    }
}
