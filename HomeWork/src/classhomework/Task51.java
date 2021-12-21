package classhomework;

import java.util.Scanner;

////Вывести ряд чисел в диапазоне с шагом
public class Task51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int min = in.nextInt();
        System.out.println("Введите максимальное число");
        int max = in.nextInt();
        System.out.println("Введите шаг");
        int shag = in.nextInt();

        for (int i = min; i <= max; i += shag) {
            System.out.println(i);
        }
    }
}
