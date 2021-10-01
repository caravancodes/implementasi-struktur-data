package lehugha;
public class StackArray<T> {
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
	public void push(T element){
	    if (size() == data.length){
            System.out.println("Stack Overflow");
        } else {
            t = t+1;
            data[t]=element;
        }
    }

    public T pop(){
        if (isEmpty()){
            return null;
        } else {
            T temp = data[t];
            data[t] = null;
            t--;
            return temp;
        }
    }

    public boolean isEmpty() {
        if ((t == -1)) return true;
        else return false;
    }

    public int size() {
        return t+1;
    }
}
