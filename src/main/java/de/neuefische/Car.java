package de.neuefische;

public class Car { // DEFINITION eines neuen Typen
    static Double engine = 3.4; // static: existiert nur einmal in Klasse,
    // alle Objekte greifen darauf zu, ist für alle Objekte gleich
    // normalerweise NICHT verwendet
    // darauf kann man auch ohne Objekt zugreifen
    String brand;
    int year;
    String type;
    String color;
    String model;

    String describeMe() {
        return color + " " + brand + " " + model;
    }
}
