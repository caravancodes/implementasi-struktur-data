package lehugha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        HashMap hash = new HashMap(in.nextInt());
        HashNode hashn = new HashNode();
        do {
            System.out.println();
            System.out.println("HASH TABLE OPERATION");
            System.out.println("1. Masukkan Data Pelanggan");
            System.out.println("2. View Pelanggan");
            System.out.println("3. Kirim Merchandise");
            System.out.println("4. Exit");
            System.out.print("Pilih : ");
            pilih = in.nextInt();
            switch(pilih){
                case 1 :
                    System.out.println("Nama          : ");
                    String nama = in.next();
                    System.out.println("Alamat        : ");
                    String alamat = in.next();
                    System.out.println("Tanggal Lahir : ");
                    int tanggal = in.nextInt();
                    System.out.println("Bulan Lahir   : ");
                    int bulan = in.nextInt();
                    System.out.println("Tahun Lahir   : ");
                    int tahun = in.nextInt();
                    BikiniBottom bbt = new BikiniBottom(nama, tanggal, bulan, tahun, alamat);
                    hash.add(bbt,bbt);
                    hash.view();
                    break;
                case 2 :
                    hash.view();
                    break;
                case 3 :
                    System.out.print("Nama       : ");
                    String deletenama = in.next();
                    System.out.print("Alamat     : ");
                    String deleteadd = in.next();
                    System.out.println("Tanggal Lahir : ");
                    int deltanggal = in.nextInt();
                    System.out.println("Bulan Lahir   : ");
                    int delbulan = in.nextInt();
                    System.out.println("Tahun Lahir   : ");
                    int deltahun = in.nextInt();
                    BikiniBottom del = new BikiniBottom(deletenama, deltanggal, delbulan, deltahun, deleteadd);
                    hash.remove(del);
                    hash.view();
                    break;
                default :
                    System.out.println("Merchandise Sudah Selesai");

            }
        } while(pilih != 4);
    }
}
