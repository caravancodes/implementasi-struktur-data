package lehugha;
import java.util.ArrayList;
public class Map<T> {
    ArrayList<HashNode<T>> bucket = new ArrayList<>();
    int numBuckets = 5;
    int size;

    public Map() {
        for (int i = 0; i < numBuckets; i++) {
            bucket.add(null);
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private int getBucketIndex(T objek) {
        //to do
		/*Lengkapi bagian ini.Hati-hatilah dengan
		**hasil negatif (akan membuat error pada
		**penambahan data)*/
        int hashCod = objek.hashCode();
        int hasil = hashCod % numBuckets;
        if (hasil<0)
            hasil=hasil*-1;
        return hasil;
    }

    public T get(T key) {
        int index = getBucketIndex(key);
        HashNode<T> head = bucket.get(index);
        while (head != null) {
            if (head.data.equals(key)){
                return head.data;
            }
            head = head.next;
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
        HashNode<T> toAdd = new HashNode<>(data);

        if (head == null) {
            bucket.set(index, toAdd);
            size++;

        } else {
            while (head != null) {
                if (head.data.equals(data)) {
                    head.data = data;
                    size++;
                    break;
                }
                head = head.next;
            }
            if (head == null) {
                head = bucket.get(index);
                toAdd.next = head;
                bucket.set(index, toAdd);
                size++;
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
        for (int i = 0; i<numBuckets; i++){
            HashNode<T> head = bucket.get(i);
            System.out.print(i + ": ");
            while (head!=null){
                System.out.print(" "+head.data);
                head=head.next;
            }
            System.out.println();
        }
    }
}
