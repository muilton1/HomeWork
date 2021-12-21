package home_work_2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] array = arrayRandom(5,100);
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int[] array;
        array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(maxValueExclusion);
        }
        return array;
    }
}
