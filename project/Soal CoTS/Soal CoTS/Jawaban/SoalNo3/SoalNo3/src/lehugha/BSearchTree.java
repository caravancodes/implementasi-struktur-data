package lehugha;
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
            root=newnode;
        else
            //// TODO: Lengkapi Code
            root.addNewNode(newnode);
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
                    toBeRemoved = toBeRemoved.left;
                else
                    //// TODO: Lengkapi Code
                    toBeRemoved = toBeRemoved.right;
            }
        }

        // toBeRemoved contains obj
        // If one of the children is empty, use the other
        if (toBeRemoved.left==null && toBeRemoved.right==null){
            if (parent==null){
                root=null;
            } else {
                if (parent.right==toBeRemoved){
                    toBeRemoved.data=null;
                    parent.right=null;
                }else if (parent.left==toBeRemoved){
                    toBeRemoved.data=null;
                    parent.left=null;
                }
            }
        } else
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
            //// TODO: Lengkapi Code
            int comp = newnode.data.compareTo(data);
            if (comp < 0) {
                if (left == null)
                    //// TODO: Lengkapi Code
                    left = newnode;
                else
                    //// TODO: Lengkapi Code
                    left.addNewNode(newnode);
            }
            if (comp >= 0) {
                if (right == null)
                    right = newnode;
                else
                    right.addNewNode(newnode);
            }
        }

        public void inorder() {
            //// TODO: Lengkapi Code
            if(left != null)
                left.inorder();
            System.out.println("=> "+data );
            if(right != null)
                right.inorder();
        }

        public void preorder() {
            //// TODO: Lengkapi Code
            System.out.println("=> "+data );
            if(left != null)
                left.preorder();
            if(right != null)
                right.preorder();
        }

        public void postorder() {
            //// TODO: Lengkapi Code
            if(left != null)
                left.postorder();
            if(right != null)
                right.postorder();
            System.out.println("=> "+data );
        }
    }
}
