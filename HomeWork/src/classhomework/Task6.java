package classhomework;

import java.util.Scanner;

//Переворот числа
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();

        while (number > 0) {
            int partNumber = number % 10;
            System.out.print(partNumber);
            number /= 10;
        }
    }
}
