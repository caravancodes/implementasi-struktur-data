package com.company;
public class Barang {
    private String KodeBarang, NamaBarang, StokBarang, HargaBarang, SatuanBarang;

    public Barang(String kodeBarang, String namaBarang, String stokBarang, String hargaBarang, String satuanBarang) {
        KodeBarang = kodeBarang;
        NamaBarang = namaBarang;
        StokBarang = stokBarang;
        HargaBarang = hargaBarang;
        SatuanBarang = satuanBarang;
    }

    public String getKodeBarang() {
        return KodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        KodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public String getStokBarang() {
        return StokBarang;
    }

    public void setStokBarang(String stokBarang) {
        StokBarang = stokBarang;
    }

    public String getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        HargaBarang = hargaBarang;
    }

    public String getSatuanBarang() {
        return SatuanBarang;
    }

    public void setSatuanBarang(String satuanBarang) {
        SatuanBarang = satuanBarang;
    }


    @Override
    public String toString() {
        return "Barang{" +
                "KodeBarang='" + KodeBarang + '\'' +
                ", NamaBarang='" + NamaBarang + '\'' +
                ", StokBarang='" + StokBarang + '\'' +
                ", HargaBarang='" + HargaBarang + '\'' +
                ", SatuanBarang='" + SatuanBarang + '\'' +
                '}';
    }
}
