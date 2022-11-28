package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void CarPropertiesAreEqual() {
        // GIVEN

        // WHEN
        Car actual = new Car("Audi", 2018, "Coupe", "red", "5er");
        // THEN
        assertEquals(new Car("Audi", 2018, "Coupe", "red", "5er"), actual);
    }

}