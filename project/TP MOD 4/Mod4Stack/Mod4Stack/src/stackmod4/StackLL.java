package stackmod4;

/**
 * Created by dzaky on 2/21/2017.
 */
public class StackLL<T> {
    private Node top;
    private int size;
    public int max;

    public StackLL(int max) {
        this.top = null;
        this.size = 0;
        this.max = max;
    }
//Bikin Node
    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
        public T getData() {
            return data;
        }
    }
    //Akhir node

    //cek size
    public int size() {
        return size;
    }

    //cek kosong
    public boolean isEmpty() {
        return (top == null);
    }

    //push
    public boolean push(T data) {
        Node newNode=new Node(data);
        if (size>=max){
            newNode.next=null;
            return false;
        }
        if (isEmpty()){
            top=newNode;
            size++;
            return true;
        } else {
            newNode.next = top;
            top = newNode;
            size++;
            return true;
        }
    }

    //clear all
    public void clearAll() {
        while (!isEmpty()){
            Node temp=top;
            top=top.next;
            temp.next=null;
            size--;
            if (top==null){
                break;
            }
        }
    }

    //pop
    public T pop() {
        Node temp=null;
        if (!isEmpty()){
            temp=top;
            top=top.next;
            temp.next=null;
            size--;
        }
        return (T) temp.getData();
    }

    //lihat data
    public void view() {
        Node temp=top;
        Main.data dt=(Main.data) temp.data;
        System.out.println("DATA ");
        for (int i=0; i<size; i++){
            System.out.println("=============================\n"+"Data ke-"+(i+1));
            System.out.println(temp.data);
                temp=temp.next;
        }
    }

    //cek full
    public boolean full(){
        if (size==max){
            return true;
        } else {
            return false;
        }
    }

}
