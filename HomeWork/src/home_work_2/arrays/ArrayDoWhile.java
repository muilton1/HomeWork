package home_work_2.arrays;

import java.util.Arrays;

public class ArrayDoWhile {
    public static void main(String[] args) {
        printAllElements();
        printReverseElements();
        printEvenElements();
    }

    public static void printAllElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 1;
        do {
            i++;
        }
        while (i <= array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void printReverseElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        int j = array.length - 1;
        do {//меняем местами элементы
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;//сдвигаемся к центру массива
            j--;
        }
        while (i < j);//пока первый элемент меньше последнего
        System.out.println(Arrays.toString(array));
    }

    public static void printEvenElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 2;
        //выводим каждый второй элемент
        do {
            System.out.print(i + " ");
            i = i + 2;
        } while (i <= array.length);
    }
}
