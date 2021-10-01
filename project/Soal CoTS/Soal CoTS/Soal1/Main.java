package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList <Mahasiswa> dataNilai = new SinglyLinkedList<>();
       
        //to do
		/*Lengkapi member main*/

        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Program 1, Masukan Data Mahasiswa:");
            System.out.println("1. Input Data");
            System.out.println("2. Keluarkan nilai terendah mahasiswa");
            System.out.println("3. Lihat data mahasiswa");
            System.out.println("4. Keluar dari program");
            System.out.println("Pilihan:");
            pilih = in.nextInt();

            switch (pilih){
                case 1:
                    //to do
					/*selesaikan bagian ini*/
                case 2:
                    Mahasiswa nilaiTerendah = (Mahasiswa) dataNilai.removeFirst();
                    System.out.println("Mahasiswa dengan nilai terendah: " + nilaiTerendah);
                    break;
                case 3:
                    dataNilai.traverse();
                    break;
                case 4:
                    //to do
					/*selesaikan bagian ini*/
                default:
                    System.out.println("Pilihan tidak tepat, ulangi pilihan");
            }
        } while (//to do
				/*selesaikan bagian ini*/);




    }
}
