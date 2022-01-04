package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double result = 0;
    private ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return this.calculator;
    }

    public double getDivision(double a, double b) {
        result = this.calculator.getDivision(a, b);
        return result;
    }


    public double getMultiplication(double a, double b) {
        result = this.calculator.getMultiplication(a, b);
        return result;
    }


    public double getSubtraction(double a, double b) {
        result = this.calculator.getSubtraction(a, b);
        return result;
    }


    public double getAddition(double a, double b) {
        result = this.calculator.getAddition(a, b);
        return result;
    }


    public double getAbsoluteValue(double a) {
        result = this.calculator.getAbsoluteValue(a);
        return result;
    }


    public double getSqrt(double a) {
        result = this.calculator.getSqrt(a);
        return result;
    }


    public double getPow(double a, int b) {
        result = this.calculator.getPow(a, b);
        return result;
    }

    public double getResult() {
        return result;
    }
}

