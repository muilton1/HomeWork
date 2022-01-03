package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        System.out.println(calc.getAddition(4.1, calc.getAddition(calc.getMultiplication(15, 7), calc.getPow(calc.getDivision(28, 5), 2))));
        System.out.println(calc.getCountOperation());

        CalculatorWithCounterAutoAgregation calc1 = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        System.out.println(calc1.getAddition(4.1, calc1.getAddition(calc1.getMultiplication(15, 7), calc1.getPow(calc1.getDivision(28, 5), 2))));
        System.out.println(calc1.getCountOperation());

        CalculatorWithCounterAutoAgregation calc2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        System.out.println(calc2.getAddition(4.1, calc2.getAddition(calc2.getMultiplication(15, 7), calc2.getPow(calc2.getDivision(28, 5), 2))));
        System.out.println(calc2.getCountOperation());

        CalculatorWithCounterAutoAgregation calc3 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        System.out.println(calc3.getAddition(4.1, calc3.getAddition(calc3.getMultiplication(15, 7), calc3.getPow(calc3.getDivision(28, 5), 2))));
        System.out.println(calc3.getCountOperation());
    }
}
