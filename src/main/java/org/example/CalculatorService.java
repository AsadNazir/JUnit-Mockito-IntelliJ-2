package org.example;

public class CalculatorService {
    private Main calculator;

    public CalculatorService(Main calculator) {
        this.calculator = calculator;
    }

    public double performAddition(int a, int b) {
        return calculator.add(a, b);
    }

    public double performSubtraction(int a, int b) {
        return calculator.multiply(a, b);
    }
}
