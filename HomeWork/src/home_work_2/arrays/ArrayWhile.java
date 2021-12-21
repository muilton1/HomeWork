package home_work_2.arrays;

import java.util.Arrays;

public class ArrayWhile {
    public static void main(String[] args) {
        printAllElements();
        printReverseElements();
        printEvenElements();
    }

    public static void printAllElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        while (i < array.length) {
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printReverseElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        int j = array.length - 1;
        //аналогично do while
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printEvenElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 2;
        //аналогично do while
        while (i <= array.length) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
