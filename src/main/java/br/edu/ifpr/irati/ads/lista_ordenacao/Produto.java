package br.edu.ifpr.irati.ads.lista_ordenacao;

public class Produto {
    private String nome;
    private double preco;
    private float avaliacao;

    public Produto() {
        this.nome = "";
        this.preco = 0.0;
        this.avaliacao = 0;
    }

    public Produto(String nome, double preco, float avaliacao) {
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
