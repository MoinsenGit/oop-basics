package de.neuefische.model;


public class Student {
    private String name;
    private double note;
    private int matrikelnummer;

    public Student(String name, double note, int matrikelnummer) {
        this.name = name;
        this.note = note;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString() {
        return "Student: " + "name = '" + name + '\'' + ", note = " + note + ", matrikelnummer = " + matrikelnummer;
    }

    public String getInformation() {
        return "Name: " + this.name + "\n" + "Note: " + this.note + "\n" + "Matrikelnummer: " + this.matrikelnummer;
    }
}
