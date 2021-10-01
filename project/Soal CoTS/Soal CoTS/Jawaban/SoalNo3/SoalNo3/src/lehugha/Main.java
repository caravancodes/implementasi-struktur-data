package lehugha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BSearchTree bst = new BSearchTree();

        Kosakata k1 = new Kosakata("001", "Milk", "Susu");
        Kosakata k2 = new Kosakata("002", "Fruit", "Buah");
        Kosakata k3 = new Kosakata("003", "Flame", "Api");
        Kosakata k4 = new Kosakata("004", "Guava", "Jambu Batu");
        Kosakata k5 = new Kosakata("005", "Sun", "Matahari");
        Kosakata k6 = new Kosakata("006", "Banana", "Pisang");
        Kosakata k7 = new Kosakata("007", "Tofu", "Tahu");
        Kosakata k8 = new Kosakata("008", "Watermelon", "Semangka");
        Kosakata k9 = new Kosakata("009", "Peach", "Persik");
        Kosakata k10 = new Kosakata("010", "Pomegranade", "Delima");

        bst.addNodeTree(k1);
        bst.addNodeTree(k2);
        bst.addNodeTree(k3);
        bst.addNodeTree(k4);
        bst.addNodeTree(k5);
        bst.addNodeTree(k6);
        bst.addNodeTree(k7);
        bst.addNodeTree(k8);
        bst.addNodeTree(k9);
        bst.addNodeTree(k10);

        bst.printInorder();
        System.out.println();

        bst.remove(k3);
        bst.remove(k5);

        bst.printInorder();
    }
}
