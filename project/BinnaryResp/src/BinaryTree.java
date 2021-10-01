/**
 * Created by SITI on 3/11/2017.
 */
public class BinaryTree implements TreeInterface {
    Node root;


    public BinaryTree(){
        this(null);
    }

    public BinaryTree(Node root){
        this.root = root;
    }

    @Override
    public void addNodeToTree(Comparable obj) {
        Node newNode = new Node(obj);
        if (root ==null)
            root=newNode;
        else
            root.addNewNode(newNode);
    }
    @Override
    public void find(Comparable obj) {

    }

    @Override
    public void remove(Comparable obj) {

    }

    @Override
    public void printPreOrder() {
        if (root !=null){
            root.preOrder();

            System.out.println();
        }
    }

    @Override
    public void printInOrder() {
        if (root !=null){
            root.InOrder();

            System.out.println();
        }
    }

    @Override
    public void printPostOrder() {
        if (root !=null){
            root.PostOrder();

            System.out.println();
        }
    }
}