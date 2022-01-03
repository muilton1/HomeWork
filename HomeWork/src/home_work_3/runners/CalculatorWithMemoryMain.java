package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        System.out.println(calc.getAddition(4.1, calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2))));
        System.out.println(calc.getResult());
    }
}
