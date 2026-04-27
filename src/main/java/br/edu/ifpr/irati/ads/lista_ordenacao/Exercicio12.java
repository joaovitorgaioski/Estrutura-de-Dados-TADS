package br.edu.ifpr.irati.ads.lista_ordenacao;

import br.edu.ifpr.irati.ads.Order;

import java.util.Arrays;
import java.util.Random;

public class Exercicio12 {

    static void main(String[] args) throws InterruptedException {
        Transacao[] transacoes = new Transacao[1000];

        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1);
            transacoes[i] = gerarTransacao();
        }

        selectionSort(transacoes, new TransacaoComparator(), Order.DESC, 3);
        System.out.println(Arrays.toString(transacoes));
    }

    public static Transacao gerarTransacao() {
        Random random = new Random();
        int ag = random.nextInt(1, 10);
        int cc = random.nextInt(100, 999);
        double valor = 1000 * random.nextDouble();

        return new Transacao("AgOrigem"+ag, "CcOrigem"+cc, "AgDestino"+ag,"CcDestino"+cc, valor);
    }

    private static void selectionSort(Transacao[] entities, TransacaoComparator comparator, Order order, int topK) {
        for (int i = 0; i < topK; i++) {
            int menor = i; //índice do menor
            for (int j = i; j < entities.length; j++) {
                int comp = comparator.compare(entities[j], entities[menor]);

                if (order.equals(Order.DESC))
                    comp = -comp;

                if (comp < 0) {
                    menor = j;
                }
            }
            swap(entities, i, menor);
        }
    }

    private static void swap(Transacao[] entities, int i, int j){
        Transacao aux = entities[i];
        entities[i] = entities[j];
        entities[j] = aux;
    }
}
