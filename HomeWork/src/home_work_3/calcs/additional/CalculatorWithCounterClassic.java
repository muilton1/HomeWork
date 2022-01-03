package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long operation;

    public void incrementOperation() {
        operation++;
    }

    public long getCountOperation() {
        return operation;
    }
}



