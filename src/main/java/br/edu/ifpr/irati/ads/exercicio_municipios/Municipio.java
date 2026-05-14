package br.edu.ifpr.irati.ads.exercicio_municipios;

public class Municipio {
    private int codIBGE;
    private String nome, estado;

    public Municipio() {
        this.codIBGE = 0;
        this.nome = "";
        this.estado = "";
    }

    public Municipio(int codIBGE, String nome, String estado) {
        this.codIBGE = codIBGE;
        this.nome = nome;
        this.estado = estado;
    }

    public int getCodIBGE() {
        return codIBGE;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setCodIBGE(int codIBGE) {
        this.codIBGE = codIBGE;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "codIBGE=" + codIBGE +
                ", nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                '}' + "\n";
    }
}
