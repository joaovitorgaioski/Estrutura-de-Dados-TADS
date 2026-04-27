package br.edu.ifpr.irati.ads.lista_ordenacao;

import java.util.Comparator;

public class TransacaoComparator implements Comparator<Transacao> {
    @Override
    public int compare(Transacao t1, Transacao t2) {
        return (int) (100 * (t1.getValor() - t2.getValor()));
    }
}
