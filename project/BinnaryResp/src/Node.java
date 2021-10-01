public class Node {
    Comparable data;
    Node left;
    Node right;

    public Node(Comparable data){
        this(data,null,null);
    }

    public Node(Comparable data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void addNewNode (Node newNode) {
        int selisih = newNode.data.compareTo(data);
        if (selisih < 0) {
            if (left == null) {
                left = newNode;
            } else {
                left.addNewNode(newNode);
            }
        }else{
                if (right == null) {
                    right = newNode;
                } else {
                    right.addNewNode(newNode);
                }
        }
    }

    public void preOrder(){
        System.out.print(data +", ");
        if(left!=null){
            left.preOrder();
        }
        if(right!=null){
            right.preOrder();
        }
    }

    public void InOrder(){
        if(left!=null)
            left.InOrder();
        System.out.print(data +", ");
        if(right!=null)
            right.InOrder();
    }
    public void PostOrder(){

        if(left!=null)
            left.PostOrder();
        if(right!=null)
            right.PostOrder();
        System.out.print(data +", ");

    }

}
