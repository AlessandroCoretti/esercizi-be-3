package Esercizio2;

import java.util.List;

public class Chiamata {

        private int durata;
        private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato){
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public String toString() {
        return "Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti";
    }
}



