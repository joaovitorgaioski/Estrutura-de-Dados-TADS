package br.edu.ifpr.irati.ads.TAD;

import java.util.Objects;

public class Carta {

    private char simbolo;
    private int valor;
    private Naipe naipe;

    public Carta() {
        this.simbolo = 'A';
        this.valor = 1;
        this.naipe = new Naipe("Espadas");
    }

    public Carta(char simbolo, int valor, Naipe naipe) {
        this.simbolo = simbolo;
        this.valor = valor;
        this.naipe = naipe;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Carta carta)) return false;
        return simbolo == carta.simbolo && valor == carta.valor && Objects.equals(naipe, carta.naipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simbolo, valor, naipe);
    }

    public String toString() {
        return String.valueOf(this.simbolo) + " " + this.naipe;
    }

}
