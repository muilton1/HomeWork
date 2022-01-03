package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double getDivision(double a, double b) {
        return a / b;
    }

    public double getMultiplication(double a, double b) {
        return a * b;
    }

    public double getSubtraction(double a, double b) {
        return a - b;
    }

    public double getAddition(double a, double b) {
        return a + b;
    }

    public double getAbsoluteValue(double a) {
        return Math.abs(a);
    }

    public double getSqrt(double a) {
        return Math.sqrt(a);
    }

    public double getPow(double a, int b) {
        return Math.pow(a, b);
    }
}
