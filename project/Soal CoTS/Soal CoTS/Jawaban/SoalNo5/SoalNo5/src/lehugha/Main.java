package lehugha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int pilih;
        Scanner in = new Scanner(System.in);
        Map kontakTelepon = new Map();

        System.out.println("Program 5: Memasukkan data kontak telepon");
        do{
            System.out.println("Pilihan menu:");
            System.out.println("1.Memasukkan nomor telepon");
            System.out.println("2.Menghapus nomor telepon");
            System.out.println("3.Menampilkan nomor telepon");
            System.out.println("4.Keluar dari program");

            System.out.println("Masukkan pilihan");
            pilih = in.nextInt();

            switch (pilih){
                case 1:
                    System.out.println("Masukkan nomor telepon:");
                    String noTel = in.next();
                    System.out.println("Masukkan Alamat:");
                    String alamat = in.next();
                    Contact con = new Contact(noTel,alamat);
                    kontakTelepon.add(con);
                    break;
                case 2:
                    System.out.println("Masukkan nomor telepon yang akan dihapus");
                    String nomorTelepon = in.next();
                    kontakTelepon.removeData(nomorTelepon);
                    break;
                case 3:
                    kontakTelepon.tampil();
                case 4:
                    System.out.println("good bye");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia, silahkan pilih kembali");
            }

        }while (pilih!=4);

    }
}
