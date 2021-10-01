package com.company;

/**
 * Created by ACERR on 24/04/2017.
 */
public class StackArray<T> implements StackInterface<T> {
    public static final int CAPACITY = 25; 
    private T[] data; 
    private int t = -1; 

    public StackArray(){
        this(CAPACITY);
    }

    public StackArray (int capacity){
        data = (T[])new Object[capacity];
    }

    //to do
	/*Buatlah method push dan pop
	bagi stack*/

    @Override
    public boolean isEmpty() {
            if ((t == -1)) return true;
            else return false;
    }

    @Override
    public int size() {
        return t+1;
    }
}
