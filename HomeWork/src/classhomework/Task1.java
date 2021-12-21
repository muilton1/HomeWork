package classhomework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = in.nextInt();

        int maxPartNumber = 0;
        while (number > 0) {
            int partNumber = number % 10;

            if (partNumber > maxPartNumber) {
                maxPartNumber = partNumber;
            }
            number /= 10;
        }
        System.out.println("Максимальная цифра " + maxPartNumber);
    }
}
