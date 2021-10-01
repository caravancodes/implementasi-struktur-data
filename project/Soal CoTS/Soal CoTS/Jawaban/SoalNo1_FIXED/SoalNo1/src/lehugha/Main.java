package lehugha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        SinglyLinkedList <Mahasiswa> dataNilai = new SinglyLinkedList<>();
        int pilih;
        boolean ulang = true;

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
                    System.out.println("Masukkan data nilai mahasiswa");
                    System.out.println("Masukkan NIM:");
                    String nim = in.next();
                    System.out.println("Masukkan Nama:");
                    String nama= in.next();
                    System.out.println("Masukkan Nilai:");
                    int nl = in.nextInt();
                    Mahasiswa mhs = new Mahasiswa(nim,nama,nl);
                    dataNilai.add(mhs,nl);
                    break;
                case 2:
                    Mahasiswa nilaiTerendah = (Mahasiswa) dataNilai.removeFirst();
                    System.out.println("Mahasiswa dengan nilai terendah: " + nilaiTerendah);
                    break;
                case 3:
                    dataNilai.traverse();
                    break;
                case 4:
                    ulang = false;
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Pilihan tidak tepat, ulangi pilihan");
                    break;
            }
        } while (ulang == true);
    }
}
