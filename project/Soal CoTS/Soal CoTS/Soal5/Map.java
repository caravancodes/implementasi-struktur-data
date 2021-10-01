package com.company;

import java.util.ArrayList;

/**
 * Created by ACERR on 24/04/2017.
 */
public class Map<T> {
    //to do
	/*Tambahkan member ArrayList bucket*/
	int numBuckets = 5;
    int size;

    public Map() {
        for (int i = 0; i < numBuckets; i++) {
            bucket.add(null);
        }
    }

    //to do
	/*Buatlah method getSize*/

    public boolean isEmpty() {
        return size == 0;
    }

    private int getBucketIndex(T objek) {
        //to do
		/*Lengkapi bagian ini.Hati-hatilah dengan
		**hasil negatif (akan membuat error pada
		**penambahan data)*/
    }

    public T get(T key) {
        int index = getBucketIndex(key);
        HashNode<T> head = bucket.get(index);
        while (head != null) {
            //to do
			/*Lengkapi bagian ini*/
        }
        return null;
    }

    public T removeData(T key) {
        int index = getBucketIndex(key);
        HashNode<T> head = bucket.get(index);
        if (head == null) {
            return null;
        }
        if (head.data.equals(key)) {
            T val = head.data;
            head = head.next;
            bucket.set(index, head);
            size--;
            return val;
        } else {
            HashNode<T> prev = null;
            while (head != null) {

                if (head.data.equals(key)) {
                    prev.next = head.next;
                    size--;
                    return head.data;
                }
                prev = head;
                head = head.next;
            }
            size--;
            return null;
        }
    }

    public void add(T data) {

        int index = getBucketIndex(data);
        
        HashNode<T> head = bucket.get(index);
        //to do
		/*Tambahkan variabel toAdd*/

        if (head == null) {
            bucket.set(index, toAdd);
            size++;

        } else {
            while (head != null) {
                if (head.data.equals(data)) {
                    //to do
					/*Lengkapi bagian ini*/
                    break;
                }
                head = head.next;
            }
            if (head == null) {
                //to do
				/*Lengkapi bagian ini*/
            }
        }
        if ((1.0 * size) / numBuckets > 0.7) {
            //do something
            ArrayList<HashNode<T>> tmp = bucket;
            bucket = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            for (int i = 0; i < numBuckets; i++) {
                bucket.add(null);
            }
            for (HashNode<T> headNode : tmp) {
                while (headNode != null) {
                    add(headNode.data);
                    headNode = headNode.next;
                }
            }
        }
    }

    public void tampil(){
        //to do
		/*Lengkapi bagian ini*/
    }
}
