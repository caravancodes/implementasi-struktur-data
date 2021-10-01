package lehugha;

import java.util.ArrayList;

/**
 * Created by GL552VW on 4/12/2017.
 */
public class Map<K,V> {
    ArrayList<HashNode<K,V>> bucket = new ArrayList<>();
    int numBucket;
    int size;

    public Map(int lengthOfBuckets) {
        this.numBucket = lengthOfBuckets;
        for (int i = 0; i<lengthOfBuckets; i++){
            bucket.add(null);
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    private int getBucketIndex(K key){
        int hashCod = key.hashCode();
        return hashCod%numBucket;
    }
    public V get (K key){
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);
        while (head != null){
            if (head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key){
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);
        if (head==null){
            return null;
        }
        if (head.key.equals(key)){
            V val = head.value;
            head = head.next;
            bucket.set(index, head);
            size--;
            return val;
        } else {
            HashNode<K,V> prev = null;
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

    public void clear() {
        bucket.clear();
        for (int i = 0; i < numBucket; i++) {
            bucket.add(null);
        }
        size = 0;
        System.out.println("Hash Table Has Been Cleared");
    }

    public void add(K key, V value){
        int index = getBucketIndex(key);
       // System.out.println(index);
        HashNode<K,V> head = bucket.get(index);
        HashNode<K,V> toAdd = new HashNode<>();
        toAdd.key = key;
        toAdd.value = value;
        if (head == null){
            bucket.set(index,toAdd);
            size++;
        } else {
            while (head != null){
                if (head.key.equals(key)){
                    head.value = value;
                    size++;
                    break;
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
        if ((1.0* size) / numBucket > 0.7){
            ArrayList<HashNode<K,V>> tmp = bucket;
            bucket = new ArrayList<>();
            numBucket = 2 * numBucket;
            for (int i = 0; i<numBucket; i++){
                bucket.add(null);
            }
            for (HashNode<K,V> headNode : tmp){
                while (headNode != null){
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public void view (){
        for (int i = 0; i < numBucket ; i++) {
            System.out.print("Bucket "+i+" : ");
            HashNode<K,V> head = bucket.get(i);
            while(head!=null){
                System.out.print(head.value +" ");
                head = head.next;
            }
            System.out.println();
        }
    }
}
