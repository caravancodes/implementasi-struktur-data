package lehugha;

/**
 * Created by GL552VW on 4/27/2017.
 */
public class Kosakata implements Comparable {
    public String IDKosakata;
    public String inEnglish;
    public String inIndonesian;

    public Kosakata(String IDKosakata, String inEnglish, String inIndonesian) {
        this.IDKosakata = IDKosakata;
        this.inEnglish = inEnglish;
        this.inIndonesian = inIndonesian;
    }

    @Override
    public int compareTo(Object o) {
        //to do
        /*
        Lengkapi method compareTo dengan catatan kosakata terurut berdasarkan kosakata Bahasa Inggrisya
         */
        String inEng = ((Kosakata)o).inEnglish;
        return inEnglish.compareTo(inEng);
    }

    @Override
    public String toString() {
        return  inEnglish + "=" +
                inIndonesian + ", "
                ;
    }
}
