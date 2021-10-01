package com.company;

/**
 * Created by Jeffry Adityatama on 4/26/2017.
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
        return 0;
    }

    @Override
    public String toString() {
        return  inEnglish + "=" +
                inIndonesian + ", "
                ;
    }
}
