package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main calc = new Main();
    @Test
    @DisplayName("Add Test")
    void add() {
        assertEquals(5,calc.add(2,3));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(4, calc.multiply(2, 2)),
                () -> assertEquals(-4, calc.multiply(2, -2)),
                () -> assertEquals(4, calc.multiply(-2, -2)),
                () -> assertEquals(0, calc.multiply(1, 0)));
    }
}