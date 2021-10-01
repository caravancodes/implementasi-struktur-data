package lehugha;

public class Mahasiswa implements Comparable {
    String NIM, nama;
    Integer nilai;

    public Mahasiswa(String NIM, String nama, int nilai) {
        this.NIM = NIM;
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public int compareTo(Object o) {
        Integer nil = ((Mahasiswa)o).nilai;
        return nilai.compareTo(nil);
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

    @Override
    public String toString() {
        return ' ' + NIM + ' ' + nama + ' ' + nilai;
    }
}
