package br.edu.ifpr.irati.ads.lista_ordenacao;

import java.time.LocalTime;

public class Evento {
    private LocalTime horario;
    private String mensagem;

    public Evento() {
        this.horario = LocalTime.now();
        this.mensagem = "";
    }

    public Evento(LocalTime horario, String mensagem) {
        this.horario = horario;
        this.mensagem = mensagem;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
