package home_work_2.sorts;


public class SortsUtils {
    public static void main(String[] args) {
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] shakerSort(int[] array) {
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
        return array;
    }
}



