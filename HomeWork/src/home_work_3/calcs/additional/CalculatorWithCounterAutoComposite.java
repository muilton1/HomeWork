package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private int count = 0;
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

    public double getDivision(double a, double b) {
        count++;
        return calculator.getDivision(a, b);
    }

    public double getMultiplication(double a, double b) {
        count++;
        return calculator.getMultiplication(a, b);
    }

    public double getSubstraction(double a, double b) {
        count++;
        return calculator.getSubtraction(a, b);
    }

    public double getAddition(double a, double b) {
        count++;
        return calculator.getAddition(a, b);
    }

    public double getAbsoluteValue(double a) {
        count++;
        return calculator.getAbsoluteValue(a);
    }

    public double getSqrt(double a) {
        count++;
        return calculator.getSqrt(a);
    }

    public double getPow(double a, int b) {
        count++;
        return calculator.getPow(a, b);
    }

    public long getCountOperation() {
        return count;
    }
}
