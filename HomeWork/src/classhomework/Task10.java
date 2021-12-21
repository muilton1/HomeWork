package classhomework;

import java.util.Arrays;
import java.util.Random;

//Найти два наименьших элемента массива
public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int min = 2_147_483_647;
        int min2 = 2_147_483_646;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        for (int j : arr) {
            if (j < min2 && j != min) {
                min2 = j;
            }
        }
        System.out.println(min2);
    }
}

