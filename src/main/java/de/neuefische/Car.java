package de.neuefische;

public class Car { // DEFINITION eines neuen Typen
    String brand;
    int year;
    String type;
    String color;
    String model;

    String describeMe() {
        return color + " " + brand + " " + model;
    }
}
