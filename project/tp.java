import java.util.*;
public class tp {

public static void main (String[]args) {
Scanner in = new Scanner (System.in);
int insert, jmlData=0, tukar, angkabaru, hapus;
int array[] = new int[10];
int menu = 0;

do {
System.out.print("Panjang Array : 10, ");
System.out.println("Jumlah Data : " + jmlData);
System.out.println("Pilihan :");
System.out.println("1. Input Data");
System.out.println("2. Delete Data");
System.out.println("3. Tukar Data");
System.out.println("4. View Data");
System.out.println("5. Exit");
System.out.print("Input : ");
insert = in.nextInt();
switch (insert) {
case 1:
System.out.print("Masukkan Angka : ");
array[jmlData] = in.nextInt();
jmlData++;
System.out.println("----------------------------------------");
continue;

case 2:
System.out.print("Masukkan angka yang dihapus : ");
hapus = in.nextInt();
for (jmlData = 0 ; jmlData < array.length ; jmlData++) {
if (array[jmlData] == hapus) {
array[jmlData] = 0;
} else {
System.out.println("Angka tidak ditemukan");
}
}
System.out.println("----------------------------------------");
continue;

case 3:
System.out.print("Masukkan Angka : ");
tukar = in.nextInt();
System.out.print("Ditukar Dengan : ");
angkabaru = in.nextInt();
System.out.println("NILAI DITUKAR !!");
for (jmlData = 0 ; jmlData < array.length ; jmlData++) {
if (array[jmlData] == tukar) {
array[jmlData] = angkabaru;
}
}

System.out.println("----------------------------------------");
continue;

case 4:
for (jmlData = 0 ; jmlData < array.length ; jmlData++) {
System.out.print(array[jmlData] + ", ");
}
System.out.println();
System.out.println("----------------------------------------");
continue;

case 5:
System.out.println("Terima Kasih");
menu = 1;
break;
default:
System.out.println("Perintah Anda Salah");
}
} while (menu == 0);




}
}