package lehugha;

import java.util.ArrayList;

/**
 * Created by GL552VW on 4/12/2017.
 */
public class HashMap <K, BikiniBottom>{
    ArrayList<HashNode<K, BikiniBottom>> bucket = new ArrayList<>();
    int numBuckets;
    int size;

    public HashMap (int lengthOfBuckets){
        this.numBuckets = lengthOfBuckets;
        for (int i = 0; i < lengthOfBuckets ; i++) {
            bucket.add(null);
        }
    }
    public void view (){
        for (int i = 0; i < numBuckets ; i++) {
            System.out.print("Bucket "+i+" : ");
            HashNode<K, BikiniBottom> head = bucket.get(i);
            while(head!=null){
                System.out.print(head.value +" ");
                head = head.next;
            }
            System.out.println();
        }
    }
    public void clear() {
        bucket.clear();
        for (int i = 0; i < numBuckets; i++) {
            bucket.add(null);
        }
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int getBucketIndex(K key){
        int hashCod = key.hashCode();
        return hashCod % numBuckets;
    }
    public BikiniBottom remove (K key){
        int index = getBucketIndex (key);
        HashNode<K, BikiniBottom> head = bucket.get(index);
        if (head == null){
            return null;
        }
        if (head.key.equals(key)){
            BikiniBottom val = head.value;
            head = head.next;
            bucket.set(index, head);
            size--;
            return val;
        } else {
            HashNode <K, BikiniBottom> prev = null;
            while (head != null){
                if (head.key.equals(key)){
                    prev.next = head.next;
                    size--;
                    return head.value;
                }
                prev = head;
                head = head.next;
            }
            size--;
            return null;
        }
    }
    public void add (K key, BikiniBottom value){
        int index = getBucketIndex(key);
        System.out.println("Data Masuk ke Bucket : "+index);
        HashNode<K, BikiniBottom> head = bucket.get(index);
        HashNode<K, BikiniBottom> toAdd = new HashNode<>();
        toAdd.key = key;
        toAdd.value = value;
        if (head == null){
            bucket.set(index,toAdd);
        } else {
            while (head != null){
                if(head.key.equals(key)){
                    head.value = value;
                    size++;
                }
                head = head.next;
            }
            if (head == null){
                head = bucket.get(index);
                toAdd.next = head;
                bucket.set(index, toAdd);
                size++;
            }
        }
    }
}
