package de.neuefische;

import java.util.Objects;

public class Car { // DEFINITION eines neuen Typen
    static Double engine = 3.4; // static: existiert nur einmal in Klasse,
    // alle Objekte greifen darauf zu, ist für alle Objekte gleich
    // normalerweise NICHT verwendet
    // darauf kann man auch ohne Objekt zugreifen
    private String brand;
    private int year;
    private String type;
    private String color;
    private String model;

    //Konstruktor
    public Car(String brand, int year, String type, String color, String model) {
        this.brand = brand;
        this.year = year;
        this.type = type;
        this.color = color;
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    String describeMe() {
        return color + " " + brand + " " + model;
    }

   // @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(type, car.type) && Objects.equals(color, car.color) && Objects.equals(model, car.model);
    }

  //  @Override
    public int hashCode() {
        return Objects.hash(brand, year, type, color, model);
    }

   // @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
