package br.edu.ifpr.irati.ads.lista_recursividade;

// Exercício 2
public class Potencia {

    public static int potencia(int x, int y) {
        // return y == 1 ? x : x * potencia(x, y - 1);
        if (y == 1) return x;
        return x * potencia(x, y - 1);
    }

    static void main(String[] args) {
        System.out.println("Potência: " + potencia(2, 5));
    }
}
