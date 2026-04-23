package br.edu.ifpr.irati.ads.lista_ordenacao;

import br.edu.ifpr.irati.ads.*;
import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Exercicio5 {

    public static Pessoa gerarPessoa(Long seed) {
        Random random = new Random(seed);

        String nome = "Ze" + random.nextInt(1, 10000);
        String cpf = "123456789";
        String data = random.nextInt(10, 28) + "/" + random.nextInt(10, 13) + "/" + random.nextInt(1920, 2026);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(data, formatter);

        Pessoa p = new Pessoa(nome, cpf, dataNascimento);
        return p;
    }

    static void main(String[] args) throws OverflowException, InterruptedException {

        IArray<Pessoa> array = new Array<>(20);

        for (int i = 0; i < 20; i++) {
            Thread.sleep(5);
            array.add(gerarPessoa(System.currentTimeMillis()));
        }

        System.out.println("Pessoas não ordenadas");
        System.out.println(array);

        array.sort(SortAlgorithm.BUBBLESORT, Order.ASC, new PessoaComparator());
        System.out.println("Pessoas ordenadas");
        System.out.println(array);

        array.shuffle();
        System.out.println("Pessoas após o embaralhamento");
        System.out.println(array);
    }
}
