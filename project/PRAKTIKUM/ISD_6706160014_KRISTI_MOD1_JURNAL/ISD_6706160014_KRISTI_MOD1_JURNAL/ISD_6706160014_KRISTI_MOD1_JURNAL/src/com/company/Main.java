package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [] angka = new int[10];
        int i,n;
        angka[0]= 2 ;
        angka[1]= 6 ;
        angka[2]= 7 ;
        angka[3]= 9 ;
        angka[4]= 1 ;
        System.out.println("Sebelum Input");
        for (i = 0; i < angka.length ; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
        System.out.print("Setelah Input : ");
        n = 3;

        for (i = 8; i >= 2 ; i--) {
            angka[(i+1)] = angka[i];
            //System.out.print(angka[i] + " ");
        }
        System.out.println();

        angka[3] = n;
        for (i = 0 ; i < angka.length ; i++) {
            System.out.print(angka[i] + " ");
        }





    }
}
