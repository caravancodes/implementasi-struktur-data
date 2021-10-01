package lehugha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("---Hash Table---\n" +
                "Masukkan Size : ");
        int size = sc.nextInt();
        Map hash = new Map(size);
        boolean ulang = true;
        while (ulang){
            System.out.print("Hash Table Operations\n" +
                    "===========================\n" +
                    "1. Insert\n" +
                    "2. Remove\n" +
                    "3. Clear\n" +
                    "4. Size\n" +
                    "5. Check Empty\n" +
                    "Pilihan : ");
            int pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan Elemen (Integer) : ");
                    int elemen = sc.nextInt();
                    hash.add(elemen,elemen);

                    break;
                case 2:
                    System.out.print("Masukkan Elemen yang ingin di hapus : ");
                    int Hel = sc.nextInt();
                    hash.remove(Hel);
                    break;
                case 3:
                    hash.clear();
                    break;
                case 4:
                    System.out.println("Size = "+hash.getSize());
                    break;
                case 5:
                    System.out.println("Status Kosong : "+hash.isEmpty());
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.println();
            hash.view();
            System.out.print("Apakah ingin melanjutkan (y/n)? ");
            String jawab = sc.next();
            if (jawab.equalsIgnoreCase("y")){
                ulang = true;
            } else {
                ulang = false;
            }
            System.out.println();
        }
    }
}
