/**
 * Created by SITI on 3/11/2017.
 */
public interface TreeInterface {

    public void addNodeToTree(Comparable obj);
    public void find(Comparable obj);
    public void remove(Comparable obj);

    public void printPreOrder();
    public void printInOrder();
    public void printPostOrder();
}
