package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentData {
    private String name;
    private String id;

    @Override
    public String toString() {
        return "Name: " + name + ", " +
                "Student-ID: " + " " + id + "\n";
    }
}
