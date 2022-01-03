package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double getDivision(double a, double b) {
        return super.getDivision(a, b);
    }

    @Override
    public double getMultiplication(double a, double b) {
        return super.getMultiplication(a, b);
    }

    @Override
    public double getSubtraction(double a, double b) {
        return super.getSubtraction(a, b);
    }

    @Override
    public double getAddition(double a, double b) {
        return super.getAddition(a, b);
    }

    @Override
    public double getAbsoluteValue(double a) {
        return Math.abs(a);
    }

    @Override
    public double getSqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double getPow(double a, int b) {
        return Math.pow(a, b);
    }
}
