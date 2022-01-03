package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public double getSqrt(double a) {
        double number;
        double half = a / 2;
        do {
            number = half;
            half = (number + (a / number)) / 2;
        }
        while ((number - half) != 0);
        return half;
    }

    public double getPow(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
}
