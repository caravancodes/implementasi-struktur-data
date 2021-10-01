package lehugha;

/**
 * Created by GL552VW on 4/12/2017.
 */
public class BikiniBottom<M, N, O, P, Q> {
    M nama;
    N tanggal;
    O bulan;
    P tahun;
    Q alamat;

    public BikiniBottom(M nama, N tanggal, O bulan, P tahun, Q alamat) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.alamat = alamat;
    }

    public int hashCode() {
        final int HASH_MULTIPLIER = 37;
        int h1 = tanggal.hashCode();
        int h2 = bulan.hashCode();
        int h3 = tahun.hashCode();
        return HASH_MULTIPLIER * h1 + h2 + h3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BikiniBottom<?, ?, ?, ?, ?> that = (BikiniBottom<?, ?, ?, ?, ?>) o;

        if (!nama.equals(that.nama)) return false;
        if (!tanggal.equals(that.tanggal)) return false;
        if (!bulan.equals(that.bulan)) return false;
        if (!tahun.equals(that.tahun)) return false;
        return alamat.equals(that.alamat);

    }

    @Override
    public String toString() {
        return "BikiniBottom{" +
                "nama=" + nama +
                ", tanggal=" + tanggal +
                ", bulan=" + bulan +
                ", tahun=" + tahun +
                ", alamat=" + alamat +
                '}';
    }
}
