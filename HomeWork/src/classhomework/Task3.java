package classhomework;

import java.util.Scanner;

//Посчитать четные и нечетные цифры числа
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();

        int even = 0;
        int odd = 0;
        while (number > 0) {
            int partNumber = number % 10;
            if (partNumber % 2 == 0) {
                System.out.println(partNumber + "-чётное");
                even += 1;
            } else {
                System.out.println(partNumber + "-нечётное");
                odd += 1;
            }
            number /= 10;
        }
        System.out.println("Четных цифр " + even);
        System.out.println("Нечетных цифр " + odd);
    }
}
