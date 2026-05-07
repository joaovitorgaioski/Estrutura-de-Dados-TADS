package br.edu.ifpr.irati.ads.lista_recursividade;

public class Fibonacci {
    // Exercício 3
    public static int fib(int n) {
        return n == 1 || n == 2 ? 1 : fib(n - 1) + fib(n - 2);
    }

    // Exercício 4
    public static int somafib(int n) {
        if (n == 1)
            return 1;
        else
            return fib(n) + somafib(n - 1);

        // return n == 1 ? 1 : fib(n) + somafib(n - 1);
    }

    static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 24 ...

        int n = 8;
        System.out.println("Fibonnaci até a posição " + n + ": " + fib(n));
        System.out.println("Soma até o elemento "+ n + ": " + somafib(n));
    }
}