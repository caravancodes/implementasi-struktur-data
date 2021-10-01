package com.company;
import java.util.*;
public class ListBarang<T> implements Interface<T> {
    private class Node{
        T data;
        Node Next;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return Next;
        }

        public void setNext(Node next) {
            Next = next;
        }
    }

    private Node firstNode;
    private Node lastNode;
    private int isi;

    public ListBarang() {
        this.firstNode = null;
        this.lastNode = null;
        this.isi = 0;
    }

    public boolean isEmpty(){
        if (firstNode == null && lastNode == null) {
            return true;
        } else {
            return false;
        }

    }
    public boolean addFirst(T newEntry){
        Node Baru = new Node();
        Baru.setNext(firstNode);
        if (isEmpty()) {
            firstNode = Baru;
            lastNode = Baru;
        } else {
            Baru.setNext(firstNode);
            firstNode = Baru;
        }
        isi++;
        return true;
    }

    public T findData(String item){
        boolean ketemu = false;
        Node Temp = firstNode;
        while (!ketemu && (Temp != null)){
            Barang barang = (Barang)Temp.data;
            if(item.equals(barang.getKodeBarang())){
                ketemu = true;
                return Temp.data;
            } else {
                Temp = Temp.getNext();
            }
        }
        return null;
    }
    public int getPositionOf(String item){
        if(firstNode != null);
        Node current = firstNode;

        for (int i = 1 ; i < isi; i++) {
            Barang barang = (Barang) current.data;
            if (item.equals(barang.getKodeBarang())){
                return i;
            } else {
                current = current.Next;
            }
        }
        return -1;
    }
    public T remove(int idBarang) {
        if (idBarang > 1 && idBarang <= isi) {
            if (idBarang == 1) {
                T tmp = firstNode.getData();
                firstNode = firstNode.getNext();
                isi--;
                return tmp;
            } else if (idBarang == (isi - 1)) {
                T tmp = firstNode.getData();
                firstNode = firstNode.getNext();
                isi--;
                return tmp;
            }
        }
        return null;
    }
    public void clear(){

    }
    public boolean contains(T anEntry){
        return true;
    }
    public void traverseList(){
        if (firstNode == null) {
            return;
        }

        Node node = firstNode;
        while (node != null) {
            System.out.println(node + " ");
            node = node.getNext();
        }
    }


}
