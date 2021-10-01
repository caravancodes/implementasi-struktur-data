package com.company;

/**
 * Created by ACERR on 21/04/2017.
 */
public class SinglyLinkedList<T> implements ListInterface {

    private Node head;
    private Node tail;
    int numberOfEntries;

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    //to do
	/*Tambahkan method addFirst*/

    @Override
    public void addLast(Object newEntry) {
        Node newNode = new Node((T) newEntry);
        if (isEmpty()){
            head = tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        numberOfEntries++;
    }

    @Override
    public void add(Object newEntry, int position) {
        Node newNode = new Node((T) newEntry);
        if (isEmpty()){
            //to do
			/*selesaikan bagian ini*/
        }
        else{
            if(position == 1)
                //to do
			   /*selesaikan bagian ini*/
            else if(position >= numberOfEntries)
                addLast(newEntry);
            else {
                //to do
			   /*selesaikan bagian ini*/
                }
            }
        }


    @Override
    public Object removeFirst() {
        T result = null;
        if(isEmpty())
            return null;
        else{
            //to do
			/*selesaikan bagian ini*/
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
    @Override
    public int getPositionOf(int nilaiMasukan) {
        assert (head !=null);

        Node iterator = head;
        Mahasiswa mahasiswa = (Mahasiswa) iterator.data;

        for (int i = 1; i <= numberOfEntries; i++) {
            //to do
			/*selesaikan bagian ini*/
        }
        return numberOfEntries;
    }

    public int getSize(){
        return numberOfEntries;
    }

    private class Node{
        //to do
		/*Lengkapi member kelas ini*/

        private Node(T dataPortion) {
            this(dataPortion, null );
        }

        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        } 

        public T getData() {
            return data;
        }

        //to do
		/*Buat getter dan setter bagi member next*/

        @Override
        public String toString() {
            return this.data.toString();
        }
    }
}
