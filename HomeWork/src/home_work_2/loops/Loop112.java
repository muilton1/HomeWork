package home_work_2.loops;

public class Loop112 {
    public static void main(String[] args) {
        long number = Long.parseLong(args[0]);
        System.out.println(recursion(number));
    }

    public static long recursion(long n) {
        long result = 1;
        //проверка на ввод отрицательного числа
        if (n < 0) {
            System.out.print("Введено отрицательное число 0_");
            return 0;
        }
        //проверка на переполнение
        if (n > 20) {
            System.out.print("Переполнение данных,введите число поменьше 0_");
            return 0;
        }

        if (n == 0) {
            System.out.print("=");
            return result;
        }

        if (n == 1) {
            System.out.print("*1=");
            return result;
        }
        System.out.print(n);

        if (n != 2) {
            System.out.print("*");
        }

        result = n * recursion(n - 1);
        return result;
    }
}




