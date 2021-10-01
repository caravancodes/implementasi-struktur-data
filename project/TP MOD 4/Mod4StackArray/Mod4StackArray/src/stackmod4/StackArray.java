package stackmod4;

/**
 * Created by dzaky on 2/22/2017.
 */
public class StackArray<T> {
    private T[] data;
    private int size;
    public int maxsize;
    private int top=-1;

    public StackArray(int max) {
        data = (T[]) new Object[max];
        maxsize = max;
    }

    //cek size
    public int size() {
        return size;
    }

    //cek kosong
    public boolean isEmpty() {
        return (top == -1);
    }

    //push
    public void push(T data){
        if (size()==maxsize){
            System.out.println("Stack Overflow, Data Penuh!!!");
        } else {
            top = top+1;
            this.data[top]=data;
            size++;
        }
    }

    //pop
    public T pop(){
        T temp=null;
        if (!isEmpty()){
            temp = data[top];
            data[top]=null;
            top--;
            size--;
        }
        return (T) temp;
    }

    //clear all
    public void clearAll() {
        while (!isEmpty()){
            T temp = data[top];
            data[top]=null;
            top--;
            size--;
            if (top == -1){
                break;
            }
        }
    }

    //cek full
    public boolean full(){
        if (size==maxsize){
            return true;
        } else {
            return false;
        }
    }

    //lihat data
    public void view() {
        System.out.println("DATA ");
        int a=1;
        for (int i=(size-1); i>-1; i--){
            System.out.println("=============================\n"+"Data ke-"+(a));
            System.out.println(this.data[i]);
            a++;
        }
    }
}
