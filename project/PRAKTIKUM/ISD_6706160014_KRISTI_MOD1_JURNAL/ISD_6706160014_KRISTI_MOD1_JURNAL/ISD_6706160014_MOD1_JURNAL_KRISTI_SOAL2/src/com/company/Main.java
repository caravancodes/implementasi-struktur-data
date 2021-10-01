package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pilih;
        String menu = " ";
        int insertId, insertHarga;
        String insertNama, insertAlamat, insertBarang;

        ArrayList<DataBarang> db = new ArrayList<>();
        ArrayList<DataPemasok> dp = new ArrayList<>();

        System.out.println("Pilihan Masukan : ");
        System.out.println("1. Data Barang");
        System.out.println("2. Data Pemasok");
        do {
            System.out.print("Masukkan pilihan(1/2) : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan id dan nama barang :");
                    insertId = in.nextInt();
                    insertBarang = in.next();
                    System.out.println("Masukkan Harga barang :");
                    insertHarga = in.nextInt();
                    DataBarang sc1 = new DataBarang(insertId, insertHarga, insertBarang);
                    db.add(sc1);
                    System.out.println("Teruskan input (Y/T)? ");
                    menu = in.next();

                    break;
                case 2:
                    System.out.println("Masukkan id pemasok, nama pemasok dan alamat :");
                    insertId = in.nextInt();
                    insertNama = in.next();
                    insertAlamat = in.next();

                    DataPemasok sc2 = new DataPemasok(insertId, insertNama, insertAlamat);
                    dp.add(sc2);
                    System.out.println("Teruskan input (Y/T)? ");
                    menu = in.next();

                    break;
                default:
                    System.out.println("SALAH");
                    break;
            }
        } while (!(menu.equalsIgnoreCase("T")));

        for (int i = 0; i < db.size(); i++) {
            System.out.println(db.get(i).toString());
        }

            for (int i = 0; i < dp.size(); i++) {
                System.out.println(dp.get(i).toString());
            }

        }
    }

