package br.edu.ifpr.irati.ads.TAD;

import java.util.Objects;

public class Naipe {

    private String nome;

    public Naipe() {
        this.nome = "";
    }

    public Naipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Naipe naipe)) return false;
        return Objects.equals(nome, naipe.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String toString() {
        return nome;
    }

}
