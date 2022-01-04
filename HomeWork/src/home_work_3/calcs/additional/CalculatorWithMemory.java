package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;


public class CalculatorWithMemory implements ICalculator {
    private double result = 0;
    private ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double getDivision(double a, double b) {
        result = calculator.getDivision(a, b);
        return result;
    }


    public double getMultiplication(double a, double b) {
        result = calculator.getMultiplication(a, b);
        return result;
    }


    public double getSubtraction(double a, double b) {
        result = calculator.getSubtraction(a, b);
        return result;
    }


    public double getAddition(double a, double b) {
        result = calculator.getAddition(a, b);
        return result;
    }


    public double getAbsoluteValue(double a) {
        result = calculator.getAbsoluteValue(a);
        return result;
    }


    public double getSqrt(double a) {
        return calculator.getSqrt(a);
    }


    public double getPow(double a, int b) {
        result = calculator.getPow(a, b);
        return result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
