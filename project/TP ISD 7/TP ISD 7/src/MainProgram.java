import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Acer E5 on 3/19/2017.
 */
public class MainProgram {
    static class New implements Comparable<New> {
        int Prioritas;
        String nama;


        @Override
        public int compareTo(New o) {
            return Integer.compare(Prioritas, o.Prioritas);
        }

        @Override
        public String toString() {
            return "Nama :" + nama +  "\n" +"Prioritas :" + Prioritas ;
        }
    }
    public static void main(String[] args) {
        Scanner lisa = new Scanner(System.in);
        HeapTree tree = new HeapTree();
        ArrayList<Integer> prioritas = new ArrayList<>();
        int pilih;
        do{
            System.out.println("Menu");
            System.out.println("1. Tambah HeapTree");
            System.out.println("2. view ");
            System.out.println("3. Remove HeapTree");
            System.out.println("4. Keluar");
            System.out.println("Pilih :");
            pilih = lisa.nextInt();
            switch (pilih){
                case 1 : {
                    New Baru = new New();
                    System.out.print("Masukkan nama :");
                    Baru.nama = lisa.next();
                    System.out.print("Masukkan Prioritas :");
                    Baru.Prioritas = lisa.nextInt();
                    tree.add(Baru);
                    break;
                }
                case 2 : {
                    // System.out.println(heap.remove(heap.peek()));
                    tree.print();
                    break;
                }
                case 3 : {
                    //System.out.println("Hapus data yang ingin di hapus :");
                    //int hapus = lisa.nextInt();
                    System.out.println(tree.removeRoot());
                    break;
                }
                default: {
                    System.out.println("");
                }
            }
        }while(pilih !=4);
    }
}
