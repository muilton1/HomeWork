package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        System.out.println(calc.getAddition(4.1, calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2))));
        System.out.println(calc.getCountOperation());
    }
}
