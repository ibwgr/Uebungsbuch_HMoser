package Aufgabe1_4;

/**
 * Created by Moser Harry on 02.10.2016.
 */
public class MethodenAufrufe1 {


    public void instMethode1(){
        System.out.println("1. Instanzmethode der Klasse MethodenAufrufer");

        MethodenAufrufe1.klsMethode1();
    }
    public void instMethode2(){
        System.out.println("2. Instanzmethode der Klasse MethodenAufrufer");

    }
    public static void klsMethode1(){
        System.out.println("1. Klassenmethode der Klasse MethodenAufrufer");

    }

    public static void klsMethode2(){
        System.out.println("2. Klassenmethode der Klasse MethodenAufrufer");
        MethodenAufrufe1 instanz = new MethodenAufrufe1();
        instanz.instMethode2();
        MethodenAufrufe1.klsMethode1();

    }
}