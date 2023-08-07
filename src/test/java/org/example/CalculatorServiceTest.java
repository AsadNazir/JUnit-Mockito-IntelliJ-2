package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorServiceTest {

    @Test
    public void testAddition() {
        Main calculatorMock = mock(Main.class);
        when(calculatorMock.add(3, 5)).thenReturn(8.0);

        CalculatorService calculatorService = new CalculatorService(calculatorMock);
        double result = calculatorService.performAddition(3, 5);

        assertEquals(8, result);
        verify(calculatorMock, times(1)).add(3, 5);
    }

    @Test
    public void testSubtraction() {
        Main calculatorMock = mock(Main.class);
        when(calculatorMock.multiply(10, 4)).thenReturn(6.0);

        CalculatorService calculatorService = new CalculatorService(calculatorMock);
        double result = calculatorService.performSubtraction(10, 4);

        assertEquals(6, result);
        verify(calculatorMock, times(1)).multiply(10, 4);
    }
}
