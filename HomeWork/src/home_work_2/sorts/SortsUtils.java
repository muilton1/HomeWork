package home_work_2.sorts;

import java.util.Arrays;

public class SortsUtils {
    public static void main(String[] args) {
        shakerSort();
    }

    public static void bubbleSort() {
        int[] array = {1, 2, 3, 6, 5, 6,};
        System.out.print(Arrays.toString(array) + "-->");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }

    public static void shakerSort() {
        int[] array = {1, 221, 3, 6564, 5, 6,};
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            --right;
        }
        System.out.println(Arrays.toString(array));
    }
}



