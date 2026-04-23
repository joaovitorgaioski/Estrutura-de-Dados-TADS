package br.edu.ifpr.irati.ads.lista_ordenacao;

import java.util.Comparator;

/*
* Toda classe que implementa uma comparação deve ter uma classe específica para isso
*/
public class PessoaComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // p1 > p2 - retorna positivo
        // p1 < p2 - retorna negativo
        // p1 == p2 - retorna 0

        return p1.getDataNascimento().compareTo(p2.getDataNascimento());
    }
}
