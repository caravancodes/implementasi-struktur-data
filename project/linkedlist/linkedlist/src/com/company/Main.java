package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList <Mahasiswa> dataNilai = new SinglyLinkedList<>();
        int pilih=4;

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

                    System.out.print("MASUKAN NIM MAHASISWA");
                    String nim=in.next();
                    System.out.print("MASUKAN NAMA MAHASISWA");
                    String nama=in.next();
                    System.out.print("MASUKAN NILAI MAHASISWA");
                    int nilai=in.nextInt();
                    Mahasiswa input = new Mahasiswa(nim,nama,nilai);
                    System.out.println(dataNilai.getPositionOf(nilai));
                    dataNilai.add(input,dataNilai.getPositionOf(nilai));
                    break;
                case 2:
                    Mahasiswa nilaiTerendah = (Mahasiswa) dataNilai.removeFirst();
                    System.out.println("Mahasiswa dengan nilai terendah: ");
                    System.out.println(nilaiTerendah);
                    break;
                case 3:
               dataNilai.viewall();
                    break;


                default:
                    System.out.println("Pilihan tidak tepat, ulangi pilihan");
                    break;
            }
        } while (pilih!=4);




    }
}
