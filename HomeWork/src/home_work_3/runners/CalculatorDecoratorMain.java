package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;


public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        System.out.println(calc.getAddition(4.1, calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2))));
        System.out.println(((CalculatorWithCounterAutoDecorator) calc).getCountOperation());
        //System.out.println(((CalculatorWithMemoryDecorator) calc).getResult());
    }
}

