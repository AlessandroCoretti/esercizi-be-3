package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    // inizializzazione altzza e larghezza
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza(){
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    // calcolo area
    public double calcolaArea(){
        return altezza * larghezza;
    }

    // calcolo perimetro
    public double calcolaPerimetro(){
        return 2 * (altezza + larghezza);
    }

    public void stampaRettagngolo(){
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    // stampo area e perimetro due rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1: ");
        r1.stampaRettagngolo();
        System.out.println("Rettangolo 2: ");
        r2.stampaRettagngolo();

        double sommaArea = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetro = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle Aree: " + sommaArea);
        System.out.println("Somma dei Perimetri: " + sommaPerimetro);
    }
}
