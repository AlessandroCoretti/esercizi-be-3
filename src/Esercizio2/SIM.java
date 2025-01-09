package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> listaChiamate;

    // costruttore
    public SIM(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.listaChiamate = new ArrayList<>();
    }

    // aggiungo una chiamata
    public  void aggiungiChiamata(int durata, String numeroChiamato){
        if (listaChiamate.size() == 5){
            listaChiamate.remove(0);
        }
        listaChiamate.add(new Chiamata(durata, numeroChiamato));
    }

    // ricarica credito
    public void ricaricaCredito(double importo){
        if (importo > 0) {
            credito += importo;
        }
    }

    //stampa dati sim
    public void stampaDatiSIM(){
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponobile: " + credito + "euro");
        System.out.println("Ultime 5 chiamate effettuate: ");
        for (Chiamata chiamata : listaChiamate){
            System.out.println(chiamata);
        }
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito(){
        return credito;
    }

    public List<Chiamata> getListaChiamate(){
        return listaChiamate;
    }




}
