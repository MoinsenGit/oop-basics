package de.neuefische;

import de.neuefische.model.Student;

public class Main {
    public static void main(String[] args) {
       /*Car bmw = new Car(); // INSTANZIERUNG: von der Klasse Car wird ein neuer
        // Typ = Objekt mit konkreten Daten erstellt

        bmw.setBrand("BMW");
        bmw.setYear(2015);
        bmw.setType("Sedan");
        bmw.setColor("black");
        bmw.setModel("3er");
        String bmwDescription = bmw.describeMe();
*/
        Car audi = new Car("Audi", 2018, "Coupe", "red", "5er");
        Car audi2 = new Car("Audi", 2018, "Coupe", "red", "5er");
        /*
        audi.brand = "AUDI";
        audi.year = 2018;
        audi.type = "Coupe";
        audi.color = "red";
        audi.model = "5er";
        String audiDescription = audi.describeMe();
        */

        // System.out.println(bmwDescription);
        // System.out.println("Baujahr: " + bmw.year + "\n");

       // System.out.println(audiDescription);
        // System.out.println("Baujahr: " + audi.year + "Maschine: " + Car.engine + "\n");

        Student student1 = new Student("Max", 4.4, 5368345);
      /*  student1.setName("Max");
        student1.setNote(4.4);
        student1.setMatrikelnummer(5368345);
    */
        System.out.println(student1.getInformation());
        System.out.println(student1.toString());

        String a = "abc";
        String b = "abc";

        System.out.println(a.equals(b));
        System.out.println(audi.equals(audi2));



        StudentData anotherNewStudent1 = new StudentData("Marta","Id2345");
        StudentData anotherNewStudent2 = new StudentData("Otto","Id5645");
        StudentData anotherNewStudent3 = new StudentData("Chris","Id3498");

        StudentData[] allStudents = new StudentData[] {anotherNewStudent1, anotherNewStudent2, anotherNewStudent3};
        StudentDB newStudent = new StudentDB(allStudents);

        System.out.println(newStudent); //toString Methode

        System.out.println(newStudent.randomStudent());

    }
}