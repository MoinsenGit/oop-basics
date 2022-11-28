package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

//@Data
//@AllArgsConstructor

public class StudentDB {
  private StudentData[] allStudents;

  public StudentDB(StudentData[] allStudents) {
    this.allStudents = allStudents;
  }

  public StudentData randomStudent() {

    int upperBound = allStudents.length -1;
    int lowerBound = 0;
    int range = (upperBound - lowerBound) + 1;
    int random = (int)(Math.random() * range) + lowerBound;

    return allStudents[random];

    }

  public void setAllStudents(StudentData[] allStudents) {
    this.allStudents = allStudents;
  }

  // @Override
  public String toString() {
    return "List of Students: " + Arrays.toString(allStudents);
  }


}


