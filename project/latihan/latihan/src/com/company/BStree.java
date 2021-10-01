package com.company;

/**
 * Created by GL552VW on 3/16/2017.
 */
public class BStree {
    class Node{
        public Comparable data;
        public Node left;
        public Node right;

        public void addNewNode(Node newnode){
            int comp = newnode.data.compareTo(this.data);
            if(comp < 0) {
                if (left == null)
                    left = newnode;
                else
                    left.addNewNode(newnode);
            }
            if(comp >= 0){
                if(right == null)
                    right = newnode;
                else
                    right.addNewNode(newnode);
            }
        }
        public void inorder(){
            if(left != null)
                left.inorder();
            System.out.print( data + " ");
            if(right != null)
                right.inorder();
        }
    }

    public Node root;
    public int size;

    public BStree() {
        this.root = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public void addNodeTree(Comparable obj){
        Node newnode = new Node();
        newnode.data = obj;
        newnode.right = null;
        newnode.left = null;
        if(root == null)
            root = newnode;
        else
            root.addNewNode(newnode);
        size++;
        System.out.println("Data Masuk");
    }

    public void printInorder(){
        if (root != null)
            root.inorder();
    }

    public void remove(Comparable obj){
        Node toRemoved = root;
        Node parent = null;
        boolean found = false;
        while(!found && toRemoved !=null) {
            int d = toRemoved.data.compareTo(obj);
            if (d == 0)
                found = true;
            else {
                parent = toRemoved;
                if (d > 0)
                    toRemoved = toRemoved.left;
                else
                    toRemoved = toRemoved.right;
            }
            if (!found) return;
        }
        if (toRemoved.left==null && toRemoved.right==null){
            toRemoved.data = null;
            size--;
        } else if(toRemoved.left == null || toRemoved.right == null){
                Node newChild;
                if (toRemoved.left == null)
                    newChild = toRemoved.right;
                else
                    newChild = toRemoved.left;
                if (parent == null)
                    root = newChild;
                else if (parent.left == toRemoved)
                    parent.left = newChild;
                else if (parent.right == toRemoved)
                    parent.right = newChild;
                else
                    return;
            size--;
            } else if (toRemoved.left!=null && toRemoved.right!=null) {
                    Node temp = toRemoved;
                    Node temp2 = toRemoved.right;
                    while (temp2.left != null) {
                        temp = temp2;
                        temp2 = temp2.left;
                    }

                    toRemoved.data = temp2.data;
                    if (temp == toRemoved)
                        temp.right = temp2.right;
                    else
                        temp.left = temp2.right;

            size--;
                }
    }
}
