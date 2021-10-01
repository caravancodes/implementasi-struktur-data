package com.company;

import java.util.Scanner;

public class Main {
    public static class anggota implements Comparable {
        String Nama, noKontak;

        @Override
        public int compareTo(Object o) {
            return 0;
        }

        public anggota(String nama) {
            Nama = nama;
        }

        public anggota(String nama, String noKontak) {
            Nama = nama;
            this.noKontak = noKontak;
        }

        @Override
        public String toString() {
            return  "\tNama      = " + Nama + '\n' +
                    "\tNo Kontak = " + noKontak + '\n' +
                    "------------------------------\n";
        }
    }

    public static void main(String[] args) {
	BStree bst = new BStree();
        Scanner sc = new Scanner(System.in);
        boolean ulang = true;
        while (ulang==true){
            System.out.print("--------------------\n" +
                    "Jumlah Anggota : "+ bst.size() + "\n" +
                    "-----------------------------------\n" +
                    "\t1. Masukkan Anggota\n" +
                    "\t2. Hapus Anggota\n" +
                    "\t3. Lihat Absen Anggota (Inorder)\n" +
                    "\t4. Exit\n" +
                    "Pilih menu : ");
            int pilih = sc.nextInt();
            System.out.println("-----------------------------------");
            switch (pilih){
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan Data Form Anggota\n" +
                            "-----------------------------------\n" +
                                     "\tNama      : ");
                    String namaA=sc.nextLine();
                    System.out.print("\tNo Kontak :");
                    String no = sc.next();
                    anggota ang=new anggota(namaA,no);
                    bst.addNodeTree(ang);
                    System.out.println("-----------------------------------");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Siapa yang ingin di hapus (Namanya)? ");
                    String namaH=sc.nextLine();
                    anggota Hang=new anggota(namaH);
                    bst.remove(Hang);
                    break;
                case 3:
                    System.out.println("Daftar Anggota : \n" +
                            "-----------------------------------");
                    bst.printInorder();
                    break;
                case 4:
                    ulang = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia. Pilih lagi!");
                    break;

            }
        }
    }
}
