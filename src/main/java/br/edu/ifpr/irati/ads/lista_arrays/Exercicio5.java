package br.edu.ifpr.irati.ads.lista_arrays;

public class Exercicio5 {
    // metodo static é um metodo executado na existência da classe, não precisa de instância
    private static double[][] somarMatrizes (double[][] a, double[][] b){
        // a.length retorna qtd de linhas
        // a[0].length retorna o tamanho do vetor da posição 0, que no caso irá nos dar a qtd de colunas
        if ((a.length != b.length) || (a[0].length != b[0].length)) {
            System.exit(-1);
        }

        double[][] s = new double[a.length][a[0].length];

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }
        }

        return s;
    }

    public static void main(String[] args) {
        double[][] a = {{1,2}, {4,6}};
        double[][] b = {{0,1}, {1,2}};

        double[][] s = somarMatrizes(a, b);

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
