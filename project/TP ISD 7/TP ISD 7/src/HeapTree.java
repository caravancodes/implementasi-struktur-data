import java.util.ArrayList;
import java.util.Objects;
/**
* Created by Acer E5 on 3/19/2017.
*/
public class HeapTree implements HTInterface {
    private ArrayList<Comparable> elements;

    public HeapTree() {
        this.elements = new ArrayList<Comparable>();
        elements.add(null);
    }

    @Override
    public void add(Comparable newElemen) {
        //membuat index baru, jangan di isi
        elements.add(null);

        //buat nyari index yang baru
        int index = elements.size() -1;

        //menurunkan orangtuanya yang lebih besar / kecil
        while (index > 1 && getParent(index).compareTo(newElemen)> 0) {
            //menurunkan orangtuanya
            elements.set(index,getParent(index));
            //buat memindahkan pointer
            index =getParentIndex(index);
        }
        //elementb baru
        elements.set(index,newElemen);
    }

    @Override
    public void print() {
        for(Comparable x: elements) {
            if(!(x ==null))
                System.out.println(x+",");
        }
        System.out.println();
    }

    @Override
    public Comparable peek() {
        return elements.get(1);
    }


    @Override
    public Comparable remove(Object o) {
        int deletingIndex = elements.indexOf(0);
        int lastIndex=elements.size() -1;
        Comparable last = elements.get(lastIndex);
        Comparable remove =elements.get(deletingIndex);
        elements.remove(lastIndex);

        if (deletingIndex>= 1 && deletingIndex < lastIndex){
            elements.set(deletingIndex,last);
            fixHeap(deletingIndex);
        }
        return remove;
    }
    public Comparable removeRoot() {
        int deletingIndex = 1;
        int lastIndex=elements.size() -1;
        Comparable last = elements.get(lastIndex);
        Comparable remove =elements.get(deletingIndex);
        elements.remove(lastIndex);

        if (deletingIndex>= 1 && deletingIndex < lastIndex){
            elements.set(deletingIndex,last);
            fixHeap(deletingIndex);
        }
        return remove;
    }
    private void fixHeap(int index) {
        Comparable root = elements.get(index);

        int lastIndex = elements.size()-1;
        if(getLeftChildIndex(index)> (lastIndex-1) && getLeftChildIndex(index)> (lastIndex-1)){
            return;
        }
        boolean more= true;
        while (more) {
            System.out.println("inner A heap :"+elements);
            int childIndex = getLeftChildIndex(index);
            int comp;
            Comparable temp;

            if (getParent(index)!=null){
                comp =getParent(index).compareTo(elements.get(index));
                if (comp > 0) {
                    temp = getParent(index);
                    elements.set(getParentIndex(index),elements.get(index));
                    elements.set(index, temp);
                }
            }
            if (childIndex <= lastIndex) {
                Comparable child = getLeft(index);
                if (getRightChildIndex(index) <= lastIndex &&
                        getRight(index).compareTo(child) < 0) {
                    childIndex = getRightChildIndex(index);
                    child =getRight(index);
                }
                if (child.compareTo(root)<0) {
                    elements.set(index,child);
                    index = childIndex;
                }else{
                    more = false;
                }
                elements.set(index,root);
            }else {
                more = false;
            }
        }
    }

    @Override
    public int size() {

        return 0;
    }

    private static int getLeftChildIndex (int index){
        return index*2;
    }

    private static int getRightChildIndex (int index){
        return index*2+1;
    }

    private static int getParentIndex (int index){
        return  index/2;
    }

    private Comparable getLeft (int index){
        return elements.get(getLeftChildIndex(index));
    }
    private Comparable getRight (int index){
        return elements.get(getRightChildIndex(index));
    }
    private Comparable getParent (int index){
        return elements.get(getParentIndex(index));
    }
}

