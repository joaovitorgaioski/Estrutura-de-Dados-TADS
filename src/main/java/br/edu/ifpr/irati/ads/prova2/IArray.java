package br.edu.ifpr.irati.ads.prova2;

import java.util.Comparator;

public interface IArray<T> {

    public void add(T entity) throws OverflowException;

    public void remove(T entity) throws NotFoundException;

    public int indexOf(T entity);

    public T get(int i) throws NotFoundException;

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    //default: bubblesort, asc
    public void sort(Comparator<T> comparator);

    public void sort(SortAlgorithm algorithm, Order order, Comparator<T> comparator);

    public void sort(SortAlgorithm algorithm, Order order, Comparator<T> comparator, int amount);

    public void shuffle();

}
