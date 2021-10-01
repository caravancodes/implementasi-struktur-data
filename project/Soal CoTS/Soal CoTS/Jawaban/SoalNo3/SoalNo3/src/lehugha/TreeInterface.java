package lehugha;

/**
 * Created by GL552VW on 4/27/2017.
 */
public interface TreeInterface {
    void addNodeTree(Comparable obj);

    boolean find(Comparable obj);

    void remove(Comparable obj);

    void printInorder();

    void printPreorder();

    void printPostorder();
}
