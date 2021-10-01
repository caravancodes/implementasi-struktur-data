package com.company;

/**
 * Created by venom on 26/04/2017.
 */
public class Mahasiswa {
      String NIM;
      String nama;
      int nilai;



    public Mahasiswa(String NIM, String nama, int nilai) {
        this.NIM = NIM;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    //to do
	/*Buatlah method toString bagi kelas ini*/

    @Override
    public String toString() {
        return
                "NIM:" + NIM + '\n' +
                "NAMA:" + nama + '\n' +
                "NILAI" + nilai;
    }
}
