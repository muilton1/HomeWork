package home_work_2.loops;

public class Loop111 {
    public static void main(String[] args) {
        long result = 1;
        long number = Long.parseLong(args[0]);
        //проверка на ввод отрицательного числа
        if (number < 0) {
            System.out.println("Число отрицательное");
            return;
        }
        //проверка переполнения
        if (number > 20) {
            System.out.println("Ошибка переполнения,введите число поменьше");
            return;
        }
        for (long i = 1; i <= number; i++) {
            result *= i;
            System.out.print(i);
            if (i != number) {
                System.out.print("*");
            } else {
                System.out.print("=" + result);
            }
        }
    }
}



