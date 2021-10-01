package com.company;

import org.omg.CORBA.NO_IMPLEMENT;

/**
 * Created by venom on 26/04/2017.
 */
public class SinglyLinkedList<T>  {

    private Node head;
    private Node tail;
    int numberOfEntries;

    public SinglyLinkedList() {
        this.head = head;
        this.tail = tail;
        this.numberOfEntries = 0;
    }

    public boolean isEmpty() {
        if  (head == null) {
            return true;
        }
        return false;
    }

    //to do
	/*Tambahkan method addFirst*/
    public void addFirst(Object newEntry) {
        Node newNode = new Node((T) newEntry);
            newNode.next=head;
            head=newNode;
        numberOfEntries++;
    }


    public void addLast(Object newEntry) {
        Node newNode = new Node((T) newEntry);
            tail.next=newNode;
            tail = newNode;
        numberOfEntries++;
    }


    public void add(Object newEntry, int position) {
        Node newNode = new Node((T) newEntry);
        if (isEmpty()){

			head =newNode;
			tail =newNode;
			numberOfEntries++;
        }
        else{

            if(position==1 ) {
                addFirst(newEntry);
               return;
            }
            else if(position<=numberOfEntries ){
                addLast(newEntry);

            }
            else {
                //to do
			   /*selesaikan bagian ini*/

                Node curent= getnode(position);


                System.out.println(curent.getData().toString());



            }

        }

    }



    public Object removeFirst() {
        T result = null;
        if(isEmpty())
            return null;
        else{
            //to do
			/*selesaikan bagian ini*/
			result=head.getData();
			Node tmp=head.next;
			head.next=null;
			head=tmp;

        }
        numberOfEntries--;
        return result;
    }

    //to do
	/*Buatlah method traverse untuk menelusuri
	linked list*/

    /*Method getPositionOf akan mengembalikan
    **posisi dari node yang akan dimasukkan
    **berdasarkan nilai. Nilai yang akan ditambahkan
    **dibandingkan dengan nilai mahasiswa lain
    yang sudah ada*/

    public int getPositionOf(int nilaiMasukan) {
        if (head != null) {

            Node iterator = head;
            Mahasiswa mahasiswa = (Mahasiswa) iterator.data;

            for (int i = 1; i <=numberOfEntries; i++) {
                //to do
			/*selesaikan bagian ini*/

                if (mahasiswa.getNilai() > nilaiMasukan) {
                    return i;
                }
               iterator= iterator.next;
                mahasiswa = (Mahasiswa) iterator.data;
            }
            return numberOfEntries;
        }
        return -1;
    }




    public Node getnode(int nilaiMasukan) {
Node awal = head;

        for (int i = 1; i <=nilaiMasukan; i++) {
            //to do
			/*selesaikan bagian ini*/
			awal=awal.next;

        }
        return  awal;
    }

    public void viewall(){
        Node awal = head;
        while (awal !=null){
            System.out.println(awal.getData());

            System.out.println();
            awal=awal.next;
        }
    }


    public int getSize(){
        return numberOfEntries;
    }

    private class Node{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        //to do
		/*Buat getter dan setter bagi member next*/

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }
}
