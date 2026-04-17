package br.edu.ifpr.irati.ads.TAD;

// Já que temos Baralho e Scores que são basicamente a mesma coisa, vamos criar ArrayObject para diminuir a redundância
public class ArrayObject {

    private Object[] entities;
    private int maxEntries;
    private int numEntries;

    public ArrayObject() {
        this.maxEntries = 50;
        this.numEntries = 0;
        this.entities = new Object[this.maxEntries];
    }

    public ArrayObject(int maxEntries) {
        this.maxEntries = maxEntries;
        this.numEntries = 0;
        this.entities = new Object[this.maxEntries];
    }

    public void add(Object entity) throws OverflowException {
        if (isFull()) throw new OverflowException("Array cheio");
        entities[numEntries++] = entity;
    }

    public void remove(Object entity) throws NotFoundException {
        int i = indexOf(entity);
        if (i == -1) {
            throw new NotFoundException("Objeto não encontrado.");
        }
        for (int j = i + 1; j < size(); j++) {
            this.entities[j - 1] = this.entities[j];
        }
        this.numEntries--;
    }

    public int indexOf(Object entity) {
        for (int i = 0; i < numEntries; i++) {
            if (this.entities[i].equals(entity)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int i) throws NotFoundException {
        if (i >= numEntries) {
            throw new NotFoundException("Posição inválida");
        }
        return this.entities[i];
    }

    public boolean isEmpty() {
        return numEntries == 0;
    }

    public boolean isFull() {
        return numEntries == maxEntries;
    }

    public int size() {
        return numEntries;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(this.entities[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

}
