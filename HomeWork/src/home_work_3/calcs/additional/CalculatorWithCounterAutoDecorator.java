package home_work_3.calcs.additional;


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private int count = 0;
    private ICalculator calculator;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return this.calculator;
    }

    public double getDivision(double a, double b) {
        count++;
        return this.calculator.getDivision(a, b);
    }

    public double getMultiplication(double a, double b) {
        count++;
        return this.calculator.getMultiplication(a, b);
    }

    public double getSubtraction(double a, double b) {
        count++;
        return this.calculator.getSubtraction(a, b);
    }

    public double getAddition(double a, double b) {
        count++;
        return this.calculator.getAddition(a, b);
    }

    public double getAbsoluteValue(double a) {
        count++;
        return this.calculator.getAbsoluteValue(a);
    }

    public double getSqrt(double a) {
        count++;
        return this.calculator.getSqrt(a);
    }

    public double getPow(double a, int b) {
        count++;
        return this.calculator.getPow(a, b);
    }

    public long getCountOperation() {
        return count;
    }
}
