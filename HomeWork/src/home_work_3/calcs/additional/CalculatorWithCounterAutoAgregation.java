package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private int count = 0;
    private CalculatorWithOperator calculator;
    private CalculatorWithMathCopy calculator1;
    private CalculatorWithMathExtends calculator2;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculator) {
        this.calculator2 = calculator;
    }

    public double getDivision(double a, double b) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getDivision(a, b));
        result = result + ((calculator1 == null) ? 0 : calculator1.getDivision(a, b));
        result = result + ((calculator2 == null) ? 0 : calculator2.getDivision(a, b));
        return result;
    }

    public double getPow(double a, double b) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getPow(a, (int) b));
        result = result + ((calculator1 == null) ? 0 : calculator1.getPow(a, (int) b));
        result = result + ((calculator2 == null) ? 0 : calculator2.getPow(a, (int) b));
        return result;
    }

    public double getMultiplication(double a, double b) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getMultiplication(a, b));
        result = result + ((calculator1 == null) ? 0 : calculator1.getMultiplication(a, b));
        result = result + ((calculator2 == null) ? 0 : calculator2.getMultiplication(a, b));
        return result;
    }

    public double getAddition(double a, double b) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getAddition(a, b));
        result = result + ((calculator1 == null) ? 0 : calculator1.getAddition(a, b));
        result = result + ((calculator2 == null) ? 0 : calculator2.getAddition(a, b));
        return result;
    }

    public double getSqrt(double a) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getSqrt(a));
        result = result + ((calculator1 == null) ? 0 : calculator1.getSqrt(a));
        result = result + ((calculator2 == null) ? 0 : calculator2.getSqrt(a));
        return result;
    }

    public double getAbsoluteValue(double a) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getAbsoluteValue(a));
        result = result + ((calculator1 == null) ? 0 : calculator1.getAbsoluteValue(a));
        result = result + ((calculator2 == null) ? 0 : calculator2.getAbsoluteValue(a));
        return result;
    }

    public double getSubtraction(double a, double b) {
        count++;
        double result = 0;
        result = result + ((calculator == null) ? 0 : calculator.getSubtraction(a, b));
        result = result + ((calculator1 == null) ? 0 : calculator1.getSubtraction(a, b));
        result = result + ((calculator2 == null) ? 0 : calculator2.getSubtraction(a, b));
        return result;
    }

    public long getCountOperation() {
        return count;
    }
}


