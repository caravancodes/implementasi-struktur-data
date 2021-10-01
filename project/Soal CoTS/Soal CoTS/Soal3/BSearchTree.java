package com.company;

/**
 * Created by Jeffry Adityatama on 4/26/2017.
 */
public class BSearchTree implements TreeInterface {
    public Node root;

    public BSearchTree() {
        root = null;
    }

    @Override
    public void printInorder(){
        if (root != null)
            root.inorder();
        System.out.print("");
    }

    @Override
    public void printPreorder(){
        if (root != null)
            root.preorder();
        System.out.print("");
    }

    @Override
    public void printPostorder(){
        if (root != null)
            root.postorder();
        System.out.print("");
    }

    @Override
    public void addNodeTree(Comparable obj) {
        Node newnode = new Node();
        newnode.data = obj;
        newnode.right = null;
        newnode.left = null;

        if (root == null)
            //// TODO: Lengkapi Code
        else
            //// TODO: Lengkapi Code
    }

    @Override
    public boolean find(Comparable obj) {
        Node current = root;

        while (current != null) {
            int d = current.data.compareTo(obj);
            if (d == 0)
                return true;
            else if (d > 0)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    @Override
    public void remove(Comparable obj) {
        Node toBeRemoved = root;
        Node parent = null;
        boolean found = false;
        while (!found && toBeRemoved != null) {
            int d = toBeRemoved.data.compareTo(obj);
            if (d == 0)
                found = true;
            else {
                parent = toBeRemoved;
                if (d > 0)
                    //// TODO: Lengkapi Code
                else
                    //// TODO: Lengkapi Code
            }
        }

        // toBeRemoved contains obj
        // If one of the children is empty, use the other
if (toBeRemoved.left==null && toBeRemoved.right==null) {
if (parent==null) {
root ==null;
} else {
if (parent.right==toBeRemoved){
toBeRemoved.data=null;
parent.right=null;
}else if (parent.left == toBeRemoved) {
toBeRemoved.data.

        if (toBeRemoved.left == null || toBeRemoved.right == null) {
            Node newChild;
            if (toBeRemoved.left == null)
                newChild = toBeRemoved.right;
            else
                newChild = toBeRemoved.left;

            if (parent == null) // Found in root
                root = newChild;
            else if (parent.left == toBeRemoved)
                parent.left = newChild;
            else
                parent.right = newChild;
            return;
        }
    }

    class Node {
        public Comparable data;
        public Node left;
        public Node right;

        public void addNewNode(Node newnode) {
            //// TODO: Bandingkan nodebaru dengan data yang sudah ada
            if (comp < 0) {
                if (left == null)
                    //// TODO: Lengkapi code
                else
                    //// TODO: Lengkapi code
            }
            if (comp > 0) {
                if (right == null)
                    right = newnode;
                else
                    right.addNewNode(newnode);
            }
        }

        public void inorder() {
            //// TODO: Lengkapi code
        }

        public void preorder() {
            //// TODO: Lengkapi code
        }

        public void postorder() {
            //// TODO: Lengkapi code
        }
    }
}
