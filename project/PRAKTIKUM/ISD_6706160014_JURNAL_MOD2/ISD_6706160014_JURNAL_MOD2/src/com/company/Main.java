package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
        int pilih, i , menu = 0;
        ListBarang<Barang> isian = new ListBarang<>();

        String kode , nama, stok, harga, satuan;
        do {
            System.out.println("=========================" +
                    "\nGudang Mukidi" +
                    "\n1. Tambah Data" +
                    "\n2. Hapus Data" +
                    "\n3. Lihat Data" +
                    "\n4. Transaksi Penjualan" +
                    "\n5. Sort Data Barang" +
                    "\n6. Exit" +
                    "\n=========================");
            System.out.print("Masukkan Pilihan : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1 :
                    in.nextLine();
                    System.out.print("Kode Barang\t\t : ");
                    kode = in.nextLine();
                    System.out.print("Nama Barang\t\t : ");
                    nama = in.nextLine();
                    System.out.print("Stok Barang\t\t : ");
                    stok = in.nextLine();
                    System.out.print("Harga Barang\t : ");
                    harga = in.nextLine();
                    System.out.print("Satuan Barang\t : ");
                    satuan = in.nextLine();
                    System.out.println("Data Terinsert\n\n");
                    Barang xc = new Barang(kode, nama, stok, harga, satuan);
                    isian.addFirst(xc);
                    break;
                case 2 :
                    System.out.println("Masukkan Kode Barang : ");
                    int Hapus = in.nextInt();
                    isian.remove(Hapus);
                    break;
                case 3 :
                    isian.traverseList();
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    menu = 1;
                    System.out.println("Terima Kasih");
                    break;
                default :
                    menu = 1;
                    System.out.println("SALAH");
                    break;
            }
        } while (menu == 0);
    }
}
