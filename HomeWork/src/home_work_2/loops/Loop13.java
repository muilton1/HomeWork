package home_work_2.loops;

public class Loop13 {
    public static void main(String[] args) {
        //ловим ошибку на ввод дробной степени
        try {
            Long.parseLong(args[1]);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Степень только целая");
            return;
        }

        double result = 1;
        double number = Double.parseDouble(args[0]);
        long number2 = Long.parseLong(args[1]);
        //проверка на отрицательность степени
        if (number2 < 0) {
            System.out.println("Степень только положительная");
            return;
        }

        for (long i = 0; i < number2; i++) {
            result *= number;
        }
        System.out.print(number + " ^ " + number2 + " = " + result);
    }
}



