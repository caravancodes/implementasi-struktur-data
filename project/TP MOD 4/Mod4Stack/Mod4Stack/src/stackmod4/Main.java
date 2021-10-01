package stackmod4;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static int jmlhdata;
    public static class data {
        String judul,tgl_terbit,nama_pengarang,jenis_artikel;

        public data(String judul, String tgl_terbit, String nama_pengarang, String jenis_artikel) {
            this.judul = judul;
            this.tgl_terbit = tgl_terbit;
            this.nama_pengarang = nama_pengarang;
            this.jenis_artikel = jenis_artikel;
        }

        @Override
        public String toString() {
            return "------------------------\n" +
                    "Judul Artikel   = " + judul + '\n' +
                    "Tanggal Terbit  = " + tgl_terbit + '\n' +
                    "Nama Pengarang  = " + nama_pengarang + '\n' +
                    "Jenis Artikel   = " + jenis_artikel;
        }

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(">>>>Copyright By Ahmad Dzaky Abrori<<<<");
        System.out.print("Masukkan jumlah data : ");
        jmlhdata=sc.nextInt();
        StackLL<data> st=new StackLL<>(jmlhdata);
        int help=0;
        while (help>=0){
            System.out.println(">>>>Copyright By Ahmad Dzaky Abrori<<<<");
            System.out.println("Menu [Data Maksimal : "+st.max+"] [Isi Data : "+st.size()+"] :\n" +
                    "1. Cek Data (Kosong atau tidak)\n" +
                    "2. Cek Data (Full atau tidak)\n" +
                    "3. Push (input data)\n" +
                    "4. Pop dan view data pop (delete)\n" +
                    "5. View data\n" +
                    "6. Clear all data\n" +
                    "7. Exit");
            System.out.print("Pilih menu\t: ");
            int pilih=sc.nextInt();
            System.out.println("=============================");
            if (pilih==7){
                break;
            }
            switch (pilih){
                case 1:
                    if(st.isEmpty()==true){
                        System.out.println("Data kosong");
                    } else {
                        System.out.println("Terdapat " + st.size() + " data");
                    }
                    break;
                case 2:
                    if (st.full()==true){
                        System.out.println("Data Full");
                        System.out.println("=============================");
                    } else {
                        System.out.println("Data Baru Terisi Sebanyak "+st.size()+" Data");
                        System.out.println("================================================");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Judul Artikel\t: ");
                    String judul=sc.next();
                    System.out.print("Masukkan Tanggal Terbit\t: ");
                    String tgl_terbit=sc.next();
                    System.out.print("Masukkan Nama Pengarang\t: ");
                    String nama_pengarang=sc.next();
                    System.out.print("Masukkan Jenis Artikel\t: ");
                    String jenis=sc.next();
                    data dt=new data(judul,tgl_terbit,nama_pengarang,jenis);
                    if (st.push(dt)==true){
                        System.out.println("Data Berhasil Di input");
                        System.out.println("=============================");
                    } else {
                        System.out.println("Stack Overflow, Data Penuh!!!");
                        System.out.println("=============================");
                    }
                    break;
                case 4:
                    data tampilpop = st.pop();
                    System.out.println("Data Yang di hapus\n" +
                            "----------------------------");
                    System.out.println("Judul Artikel   = "+tampilpop.judul);
                    System.out.println("Tanggal Terbit  = "+tampilpop.tgl_terbit);
                    System.out.println("Nama Pengarang  = "+tampilpop.nama_pengarang);
                    System.out.println("Jenis Artikel   = "+tampilpop.jenis_artikel);
                    System.out.println("=============================");
                    break;
                case 5:
                    st.view();
                    System.out.println("=============================");
                    break;
                case 6:
                    st.clearAll();
                    System.out.println("Data Dibersihkan");
                    System.out.println("=============================");
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia Coba Lagi....");
                    System.out.println("====================================");
                    break;
            }
        }
    }
}
