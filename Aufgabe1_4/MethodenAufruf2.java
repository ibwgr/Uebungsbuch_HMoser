package Aufgabe1_4;

/**
 * Created by Moser Harry on 02.10.2016.
 */
public class MethodenAufruf2 {

    public void instMethode(){
        MethodenAufrufe1 instanz = new MethodenAufrufe1();
        instanz.instMethode1();
        MethodenAufrufe1.klsMethode2();
    }

    public static void klsMethode(){

        MethodenAufruf2.klsMethode();
        MethodenAufrufe1.klsMethode2();
    }
}

