package br.edu.ifpr.irati.ads.lista_arrays;

public class Exercicio8 {
    public static boolean verificarSimetrica(double[][] a) {
        // Verifica se é quadrada
        if(a.length != a[0].length) {
            return false;
        }

        // Obtemos o metodo transpor do Exercicio7
        double[][] t = Exercicio7.transpor(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                // Retorna falso se qualquer elemento da diagonal principal for diferente entre 'a' e 't'
                if(a[i][j] != t[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        double[][] m = {
                {1,  3,  5},
                {3, -1, -3},
                {5, -3,  2}
        };

        System.out.println(verificarSimetrica(m));
    }
}
