package Esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;

    public Carrello(Cliente cliente){
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo){
        articoli.add(articolo);
    }

    public double calcolaTotale(){

    double totale = 0;
    for (Articolo articolo : articoli) {
        totale += articolo.getPrezzo();
    }
    return totale;
    }

    public void stampaDettagliCarrello(){
        System.out.println("Dettagli carrello per: " + cliente);
        for (Articolo articolo : articoli){
            System.out.println(articolo);
        }
        System.out.println("Totale costo articoli: " + calcolaTotale() + "EUR");
    }

}
