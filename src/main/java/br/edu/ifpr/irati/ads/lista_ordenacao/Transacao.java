package br.edu.ifpr.irati.ads.lista_ordenacao;

public class Transacao {
    private String agenciaOrigem, contaOrigem, agenciaDestino, contaDestino;
    private double valor;

    public Transacao() {
        this.agenciaOrigem = "";
        this.contaOrigem = "";
        this.agenciaDestino = "";
        this.contaDestino = "";
        this.valor = 0;
    }

    public Transacao(String agenciaOrigem, String contaOrigem, String agenciaDestino, String contaDestino, double valor) {
        this.agenciaOrigem = agenciaOrigem;
        this.contaOrigem = contaOrigem;
        this.agenciaDestino = agenciaDestino;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    public String getAgenciaOrigem() {
        return agenciaOrigem;
    }

    public void setAgenciaOrigem(String agenciaOrigem) {
        this.agenciaOrigem = agenciaOrigem;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getAgenciaDestino() {
        return agenciaDestino;
    }

    public void setAgenciaDestino(String agenciaDestino) {
        this.agenciaDestino = agenciaDestino;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nTransacao{" +
                "agenciaOrigem='" + agenciaOrigem + '\'' +
                ", contaOrigem='" + contaOrigem + '\'' +
                ", agenciaDestino='" + agenciaDestino + '\'' +
                ", contaDestino='" + contaDestino + '\'' +
                ", valor=" + valor +
                '}';
    }
}
