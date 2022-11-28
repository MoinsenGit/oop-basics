package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(); // INSTANZIERUNG: von der Klasse Car wird ein neuer Typ erstellt
        bmw.brand = "BMW";
        bmw.year = 2015;
        bmw.type = "Sedan";
        bmw.color = "black";
        bmw.model = "3er";
        String bmwDescription = bmw.describeMe();

        Car audi = new Car();
        audi.brand = "AUDI";
        audi.year = 2018;
        audi.type = "Coupe";
        audi.color = "red";
        audi.model = "5er";
        String audiDescription = audi.describeMe();


        System.out.println(bmwDescription);
        System.out.println("Baujahr: " + bmw.year + "\n");

        System.out.println(audiDescription);
        System.out.println("Baujahr: " + audi.year + "\n");
    }
}