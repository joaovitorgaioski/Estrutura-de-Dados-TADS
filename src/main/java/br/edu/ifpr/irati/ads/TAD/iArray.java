package br.edu.ifpr.irati.ads.TAD;

// Interface irá implementar os métodos mínimos
public interface iArray<T> {

    // Isso obriga que o metodo add tenha esse throws
    public void add(T entity) throws OverflowException;

    public void remove(T entity) throws NotFoundException;

    public int indexOf(T entity);

    public T get(int i) throws NotFoundException;

    public boolean isEmpty();

    public boolean isFull();

    public int size();
}
