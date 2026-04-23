package br.edu.ifpr.irati.ads;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Array<T> implements IArray<T>{

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
        for (int j = i + 1; j < size(); j++){
            this.entities[j-1] = this.entities[j];
        }
        this.numEntries--;
    }

    @Override
    public int indexOf(T entity){
        for (int i = 0; i < numEntries; i++){
            if (this.entities[i].equals(entity)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int i) throws NotFoundException{
        if (i >= numEntries){
            throw new NotFoundException("Posição inválida");
        }
        return (T) this.entities[i];
    }

    @Override
    public boolean isEmpty(){
        return numEntries == 0;
    }

    @Override
    public boolean isFull(){
        return numEntries == maxEntries;
    }

    @Override
    public int size(){
        return numEntries;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        bubbleSort(comparator, Order.ASC);
    }

    @Override
    public void sort(SortAlgorithm algorithm, Order order, Comparator<T> comparator) {
        switch (algorithm) {
            case BUBBLESORT -> bubbleSort(comparator, order);
            case SELECTIONSORT -> selectionSort(comparator, order);
            case INSERTIONSORT -> insertionSort(comparator, order);
        }
    }

    @Override
    public void shuffle() {
        Random random = new Random(new Date().getTime());
        for (int i = this.size() - 1; i >= 1; i--) {
            int j = random.nextInt(i);//entre 0 e o pivô sem incluir este último
            Object aux = entities[i];
            entities[i] = entities[j];
            entities[j] = aux;
        }
    }

    private void swap(int i, int j){
        Object aux = entities[i];
        entities[i] = entities[j];
        entities[j] = aux;
    }

    private void bubbleSort(Comparator<T> comparator, Order order) {
        for (int i = this.size() - 1; i >= 1; i--) {
            boolean hasSwap = false;

            for (int j = 0; j < i; j++) {
                int comp = comparator.compare( (T) entities[j], (T) entities[j + 1]);

                if (order.equals(Order.DESC))
                    comp = -comp;

                if (comp > 0) {
                    swap(j, j + 1);
                    hasSwap = true;
                }
            }

            if (!hasSwap) return;
        }
    }

    private void selectionSort(Comparator<T> comparator, Order order) {
        for (int i = 0; i < this.size() - 1; i++) {
            int menor = i; //índice do menor
            for (int j = i; j < this.size(); j++) {
                int comp = comparator.compare((T) entities[j], (T) entities[menor]);

                if (order.equals(Order.DESC))
                    comp = -comp;

                if (comp < 0) {
                    menor = j;
                }
            }
            swap(i, menor);
        }
    }

    private void insertionSort(Comparator<T> comparator, Order order) {
        for (int i = 1; i < this.size(); i++) {//gera o percorrimento dos pivôs
            for (int j = i - 1; j >= 0; j--) {//percorre entre o elemento anterior do pivô e a posição 0
                int comp = comparator.compare( (T) entities[j + 1], (T) entities[j]);

                if (order.equals(Order.DESC))
                    comp = -comp;

                if (comp < 0) {// testa se o elemento da posição j+1 (no início corresponde ao pivo) é maior que o elemento anterior
                    swap(j, j+1);
                }
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++){
            sb.append(this.entities[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    public IArray<T> concatenate(IArray<T> array) throws NotFoundException,
            OverflowException {
        IArray<T> novo = new Array<>(this.size() + array.size());
        for (int i = 0; i < this.size(); i++) {
            novo.add(this.get(i));
        }
        for (int i = 0; i < array.size(); i++) {
            novo.add(array.get(i));
        }
        return novo;
    }


}
