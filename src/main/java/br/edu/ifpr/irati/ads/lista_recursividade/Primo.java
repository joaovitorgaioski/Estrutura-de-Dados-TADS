package br.edu.ifpr.irati.ads.lista_recursividade;

// Exercício 1
public class Primo {

    public static int div(int m, int n) {
        // System.out.println("Rodada atual: " + m + " % " + n + " = " + m % n);

        if (m == 1) return 0;
        if (m % n == 0 && n != 1) {
            if (m == n) return 1;
            return 0;
        }

        return div(m, n + 1);
    }

    public static boolean primo(int m) {
        return div(m, 1) == 1;
    }

    static void main(String[] args) {
        System.out.println(primo(11));
    }
}
