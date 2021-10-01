package com.company;

/**
 * Created by Praktikan on 02/02/2017.
 */
public class DataBarang {
    private int id;
    private int harga;
    private String barang;

    public DataBarang(int id, int harga, String barang) {
        this.id = id;
        this.harga = harga;
        this.barang = barang;
    }

    @Override
    public String toString() {
        return "Data Baramg : " + id + " " + barang+ " " + harga;
    }

}
