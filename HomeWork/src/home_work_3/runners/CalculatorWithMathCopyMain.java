package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        System.out.println(calc.getAddition(4.1, calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2))));
    }
}
