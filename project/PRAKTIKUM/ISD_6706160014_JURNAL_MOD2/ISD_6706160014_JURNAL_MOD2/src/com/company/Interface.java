package com.company;

/**
 * Created by Praktikan on 09/02/2017.
 */
public interface Interface<T> {
    public boolean isEmpty();
    public boolean addFirst(T newEntry);
    public T findData(String item);
    public int getPositionOf(String item);
    public T remove(int idBarang);
    public void clear();
    public boolean contains(T anEntry);
    public void traverseList();
}
