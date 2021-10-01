package com.company;

/**
 * Created by Praktikan on 02/02/2017.
 */
public class DataPemasok {
    private int id;
    private String nama;
    private String alamat;

    public DataPemasok(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }



    @Override
    public String toString() {
        return "Data Baramg : " + id + " " + nama+ " " + alamat;
    }


}
