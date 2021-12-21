package classhomework;

import java.util.Scanner;

//Вывести ряд чисел в диапазоне с шагом
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int min = in.nextInt();
        System.out.println("Введите максимальное число");
        int max = in.nextInt();
        System.out.println("Введите шаг");
        int shag = in.nextInt();


        while (min + shag <= max) {
            if (min <= max) {
                System.out.println(min);
            }
            min += shag;
        }
    }
}
