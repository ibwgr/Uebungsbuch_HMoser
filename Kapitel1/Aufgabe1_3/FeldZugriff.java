package Kapitel1.Aufgabe1_3;
//Test
/**
 * Created by Moser Harry on 02.10.2016.
 */
public class FeldZugriff {
    int zaehlerAlsInstanzFeld = 0;
    static int zaelerAlsKlassenFeld = 0;

    /**Parameterloser Konstruktor*/
    public FeldZugriff() {
        zaelerAlsKlassenFeld++;
        zaehlerAlsInstanzFeld++;
    }
    /**Methoden um Instanz Felder anzuzeigen*/
    public void anzeigeInstMeth(){
        System.out.println("Zaehler als Instands Feld: " + zaehlerAlsInstanzFeld);
    }


    /**Methoden um Klassen Felder anzuzeigen*/
    public static void anzeigeKlsMeth(){
        System.out.println("Zaehler als Klassen Feld: " + zaelerAlsKlassenFeld);

    }

}
