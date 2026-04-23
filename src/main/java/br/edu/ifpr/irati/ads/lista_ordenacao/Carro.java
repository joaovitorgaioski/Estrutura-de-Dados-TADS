package br.edu.ifpr.irati.ads.lista_ordenacao;

public class Carro {
    private String nome, marca;
    private double preco;

    public Carro() {
        this.nome = "";
        this.marca = "";
        this.preco = 0;
    }

    public Carro(double preco) {
        this.nome = "Uno Mille";
        this.marca = "FIAT";
        this.preco = preco;
    }

    public Carro(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
