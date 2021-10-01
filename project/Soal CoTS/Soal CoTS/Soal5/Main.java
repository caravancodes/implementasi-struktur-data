package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //to do
	    /*Buatlah member dari kelas ini*/

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
                    //to do
				    /*Lengkapi bagian ini*/
                    break;
                case 2:
                    System.out.println("Masukkan nomor telepon yang akan dihapus");
                    nomorTelepon = in.next();
                    kontakTelepon.removeData(nomorTelepon);
                    break;
                case 3:
                    //to do
				    /*Lengkapi bagian ini*/
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia, silahkan pilih kembali");
            }

        }while (//to do
				/*Lengkapi bagian ini*/);

    }
}
