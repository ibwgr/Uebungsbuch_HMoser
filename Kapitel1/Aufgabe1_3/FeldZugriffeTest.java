package Kapitel1.Aufgabe1_3;

/**
 * Created by Moser Harry on 02.10.2016.
 */
public class FeldZugriffeTest {
   public static void main(String[] args) {

    FeldZugriff zugriff = new FeldZugriff();

    //Zugriff erfolgt über Klassen Name
    FeldZugriff.anzeigeKlsMeth();

    //Zugriff erfolgt über Objekt Name
    zugriff.anzeigeInstMeth();
}
}
