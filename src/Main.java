import Esercizio1.Rettangolo;
import Esercizio2.SIM;
import Esercizio3.Articolo;
import Esercizio3.Carrello;
import Esercizio3.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nEsercizio1");

        Rettangolo rettangolo1 = new Rettangolo(12.3, 5.6);
        Rettangolo rettangolo2 = new Rettangolo(2.9, 9.0);

        System.out.println("Primo rettangolo: ");
        rettangolo1.stampaRettagngolo();
        System.out.println("\nSecondo rettangolo: ");
        rettangolo2.stampaRettagngolo();
        System.out.println("\nEntrambi: ");
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);


        System.out.println("\nesercizio2");

        // Creazione SIM
        SIM miaSIM = new SIM("123-456-7890");

        // Ricarica del credito
        miaSIM.ricaricaCredito(20.0);

        // chiamate
        miaSIM.aggiungiChiamata(10, "321-654-0987");
        miaSIM.aggiungiChiamata(5, "456-789-0123");
        miaSIM.aggiungiChiamata(7, "789-012-3456");
        miaSIM.aggiungiChiamata(3, "987-654-3210");
        miaSIM.aggiungiChiamata(15, "654-321-0987");
        miaSIM.aggiungiChiamata(8, "321-098-7654"); // Questa sostituisce la prima

        // Stampa dati della SIM
        miaSIM.stampaDatiSIM();


        System.out.println("\nesercizio3");

        // cliente
        Cliente cliente = new Cliente("0001", "Alessandro", "Coretti","Coretti,alessandro.coretti@gmail.com", "abc");

        // articoli
        Articolo articolo1 = new Articolo("A0001", "PC", 999.99, 10);
        Articolo articolo2 = new Articolo("A0002", "TV", 1499.99, 5);
        Articolo articolo3 = new Articolo("A0003", "Smartphone", 549.99, 20);

        // carrello
        Carrello carrello = new Carrello(cliente);

        // aggiungo articoli carrello
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);
        carrello.aggiungiArticolo(articolo3);

        carrello.stampaDettagliCarrello();



    }
}