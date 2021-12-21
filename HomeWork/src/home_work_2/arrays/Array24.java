package home_work_2.arrays;

import java.util.Arrays;

public class Array24 {
    public static void main(String[] args) {
        sumEvenPositive();
        maxEvenIndexElement();
        elementsLessAverage();
        twoMinElements();
        deleteElements();
        sumArrayNumbers();
    }

    //сумма четных положительных элементов массива
    public static void sumEvenPositive() {
        int[] array = ArraysUtils.arrayRandom(5, 100);
        long even = 0;
        for (int i = 0; i < array.length; i++) {
            //проверка на положительность и четность
            if (array[i] % 2 == 0 && array[i] >= 0) {
                even += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Cумма четных положительных элементов: " + even);
        System.out.println("__________________");
    }

    //максимальный элемент массива с четным индексом
    public static void maxEvenIndexElement() {
        int[] array = ArraysUtils.arrayRandom(5, 100);
        int max = Integer.MIN_VALUE;
        //i=1,начинаем со второго элемента и через один
        for (int i = 1; i < array.length; i += 2) {
            //проверка на самое большое число с четным индексом
            if ((array)[i] > max) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Наибольшее число с четным индексом:" + max);
        System.out.println("__________________");
    }

    //элементы меньше среднеарифметического массива
    public static void elementsLessAverage() {
        int[] array = ArraysUtils.arrayRandom(5, 100);
        long sum = 0;
        long average = 0;
        //складываем элементы массива
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        //вычисляем среднее арифметическое
        average = sum / array.length;
        System.out.println("Среднее арифметическое массива:" + average);
        //ищем элементы меньше среднеарифметического
        for (int j : array) {
            if (j < average) {
                System.out.println(j + " ");
            }
        }
        System.out.println("_________________");
    }

    //найти два минимальных элемента массива
    public static void twoMinElements() {
        int[] array = ArraysUtils.arrayRandom(5, 100);
        System.out.println(Arrays.toString(array));
        //сортируем массив пузырьковым методом
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        //выводим 2 первых элемента массива
        System.out.println(Arrays.toString(array));
        System.out.println("Два минимальных элемента " + array[0] + "," + array[1]);
        System.out.println("_________________");
    }

    //сжать массив, удалив элементы
    public static void deleteElements() {
        int[] array = ArraysUtils.arrayRandom(5, 100);
        System.out.println(Arrays.toString(array));
        int min = 10;
        int max = 90;
        int elementsToBeDeleted = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                elementsToBeDeleted++;
                //элементы ,не попавшие в отрезок,сдвигаем влево
            } else {
                array[i - elementsToBeDeleted] = array[i];
            }
        }
        //начинаем с первого отсеянного элемента, заменяя их нулями
        for (int i = array.length - elementsToBeDeleted; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("_____________");
    }

    //сумма цифр массива
    public static void sumArrayNumbers() {
        int[] array = ArraysUtils.arrayRandom(5, 60);
        int sum = 0;
        //узнаем цифры массива, путем деления с остатком элементов на 10, затем складываем их
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array));
            while (array[i] > 0) {
                sum += array[i] % 10;
                array[i] /= 10;
            }
            System.out.println("=" + sum);
        }
    }
}
