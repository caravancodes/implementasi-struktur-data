import java.util.ArrayList;

/**
 * Created by SITI on 3/11/2017.
 */
public class Main {
    public static void main (String args[]){
        BinaryTree bry = new BinaryTree();
        //ArrayList<Integer>
        System.out.println("1). Insert \n 2). Delete\n3). View\n4). View PreOrder\n5). View InOrder\n6). View PostOrder\n7). ");
        bry.addNodeToTree(5);
        bry.addNodeToTree(8);
        bry.addNodeToTree(10);
        bry.addNodeToTree(6);
        bry.addNodeToTree(2);
        bry.addNodeToTree(4);
        bry.addNodeToTree(3);
        bry.addNodeToTree(7);
        bry.addNodeToTree(1);
        bry.addNodeToTree(9);
        System.out.println("IN");
        bry.printInOrder();

        System.out.println("Pre");
        bry.printPreOrder();

        System.out.println("POST");
        bry.printPostOrder();
    }
}
