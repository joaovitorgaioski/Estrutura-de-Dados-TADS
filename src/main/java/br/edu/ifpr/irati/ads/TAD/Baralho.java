package br.edu.ifpr.irati.ads.TAD;

public class Baralho {

    private Carta[] cartas;
    private int maxEntries;
    private int numEntries;

    public Baralho() {
        this.maxEntries = 52;
        this.numEntries = 0;
        this.cartas = new Carta[this.maxEntries];
    }

    public Baralho(int maxEntries) {
        this.maxEntries = maxEntries;
        this.numEntries = 0;
        this.cartas = new Carta[this.maxEntries];
    }

    public void add(Carta carta) throws OverflowException {
        if (isFull()) throw new OverflowException("Array cheio");
        cartas[numEntries++] = carta;
    }

    public void remove(Carta carta) throws NotFoundException {
        int i = indexOf(carta);
        if (i == -1) {
            throw new NotFoundException("Carta não encontrada");
        }
        for (int j = i + 1; j < size(); j++){
            this.cartas[j-1] = this.cartas[j];
        }
        this.numEntries--;
    }

    public int indexOf(Carta carta){
        for (int i = 0; i < numEntries; i++){
            if (this.cartas[i].equals(carta)){
                return i;
            }
        }
        return -1;
    }

    public Carta get(int i) throws NotFoundException{
        if (i >= numEntries){
            throw new NotFoundException("Posição inválida");
        }
        return this.cartas[i];
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
            sb.append(this.cartas[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

}
