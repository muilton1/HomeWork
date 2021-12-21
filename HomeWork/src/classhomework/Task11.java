package classhomework;

import java.util.Arrays;
import java.util.Random;

//сжать массив удалив элементы, принадлежащие интервалу
public class Task11 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int min = 10;
        int max = 20;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(50);
            if (arr[i] > min && arr[i] < max) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

