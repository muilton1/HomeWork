package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private int count;

    @Override
    public double getDivision(double a, double b) {
        this.count++;
        return super.getDivision(a, b);
    }

    @Override
    public double getMultiplication(double a, double b) {
        this.count++;
        return super.getMultiplication(a, b);
    }

    @Override
    public double getSubtraction(double a, double b) {
        this.count++;
        return super.getSubtraction(a, b);
    }

    @Override
    public double getAddition(double a, double b) {
        this.count++;
        return super.getAddition(a, b);
    }

    @Override
    public double getAbsoluteValue(double a) {
        this.count++;
        return super.getAbsoluteValue(a);
    }

    @Override
    public double getSqrt(double a) {
        this.count++;
        return super.getSqrt(a);
    }

    @Override
    public double getPow(double a, int b) {
        this.count++;
        return super.getPow(a, b);
    }

    public long getCountOperation() {
        return count;
    }
}
