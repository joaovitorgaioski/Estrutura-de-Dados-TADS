package br.edu.ifpr.irati.ads.prova1;

import java.util.Objects;

public class Partida {

    private String nome;
    private double score;

    public Partida() {
        this.nome = "";
        this.score = 0;
    }

    public Partida(String nome, double score) {
        this.nome = nome;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return nome + ", " + score;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Partida partida)) return false;
        return Double.compare(score, partida.score) == 0 && Objects.equals(nome, partida.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, score);
    }
}
