package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        calc.getDivision(28, 5);
        calc.incrementOperation();
        calc.getPow(calc.getDivision(28, 5), 2);
        calc.incrementOperation();
        calc.getMultiplication(15, 7);
        calc.incrementOperation();
        calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2));
        calc.incrementOperation();
        System.out.println(calc.getAddition(4.1, calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2))));
        calc.incrementOperation();
        System.out.println("Количество операций: " + calc.getCountOperation());
    }
}
