package home_work_2.arrays;

import java.util.Arrays;

public class ArrayFor {
    public static void main(String[] args) {
        printAllElements();
        printReverseElements();
        printEvenElements();
    }

    public static void printAllElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printReverseElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        //делим массив пополам,затем зеркально меняем его элементы
        for (int i = 0; i < array.length / 2; i++) {//делим массив пополам,затем зеркально меняем его элементы
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printEvenElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        //выводим каждый второй элемент
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
    }
}
