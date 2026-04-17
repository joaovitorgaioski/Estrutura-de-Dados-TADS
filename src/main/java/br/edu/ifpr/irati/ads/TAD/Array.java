package br.edu.ifpr.irati.ads.TAD;

// Controlamos como o Array vai aparecer usando o <>
public class Array<T> implements iArray<T> {

    private Object[] entities;
    private int maxEntries;
    private int numEntries;

    public Array() {
        this.maxEntries = 50;
        this.numEntries = 0;
        this.entities = new Object[this.maxEntries];
    }

    public Array(int maxEntries) {
        this.maxEntries = maxEntries;
        this.numEntries = 0;
        this.entities = new Object[this.maxEntries];
    }

    @Override
    public void add(T entity) throws OverflowException {
        if (isFull()) throw new OverflowException("Array cheio");
        entities[numEntries++] = entity;
    }

    @Override
    public void remove(T entity) throws NotFoundException {
        int i = indexOf(entity);
        if (i == -1) {
            throw new NotFoundException("Objeto não encontrado.");
        }
        for (int j = i + 1; j < size(); j++) {
            this.entities[j - 1] = this.entities[j];
        }
        this.numEntries--;
    }

    @Override
    public int indexOf(T entity) {
        for (int i = 0; i < numEntries; i++) {
            if (this.entities[i].equals(entity)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int i) throws NotFoundException {
        if (i >= numEntries) {
            throw new NotFoundException("Posição inválida");
        }
        return (T) this.entities[i];
    }

    @Override
    public boolean isEmpty() {
        return numEntries == 0;
    }

    @Override
    public boolean isFull() {
        return numEntries == maxEntries;
    }

    @Override
    public int size() {
        return numEntries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(this.entities[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

}
