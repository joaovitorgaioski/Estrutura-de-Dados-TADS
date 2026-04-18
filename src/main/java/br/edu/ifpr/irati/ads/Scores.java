package br.edu.ifpr.irati.ads;

public class Scores {

    private Partida[] partidas;
    private int maxEntries;
    private int numEntries;

    public Scores() {
        this.maxEntries = 50;
        this.numEntries = 0;
        this.partidas = new Partida[this.maxEntries];
    }

    public Scores(int maxEntries) {
        this.maxEntries = maxEntries;
        this.numEntries = 0;
        this.partidas = new Partida[this.maxEntries];
    }

    public void add(Partida partida) throws OverflowException {
        if (isFull()) throw new OverflowException("Array cheio");
        partidas[numEntries++] = partida;
    }

    public void remove(Partida partida) throws NotFoundException {
        int i = indexOf(partida);
        if (i == -1) {
            throw new NotFoundException("Partida não encontrada");
        }
        for (int j = i + 1; j < size(); j++){
            this.partidas[j-1] = this.partidas[j];
        }
        this.numEntries--;
    }

    public int indexOf(Partida partida){
        for (int i = 0; i < numEntries; i++){
            if (this.partidas[i].equals(partida)){
                return i;
            }
        }
        return -1;
    }

    public Partida get(int i) throws NotFoundException{
        if (i >= numEntries){
            throw new NotFoundException("Posição inválida");
        }
        return this.partidas[i];
    }

    public boolean isEmpty(){
        return numEntries == 0;
    }

    public boolean isFull(){
        return numEntries == maxEntries;
    }

    public int size(){
        return numEntries;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++){
            sb.append(this.partidas[i]);
        }
        return sb.toString();
    }

}
