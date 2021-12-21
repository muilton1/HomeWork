package classhomework;

import java.util.Arrays;
import java.util.Random;

//Сумма четных положительных элементов массива
public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        long even = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
            if (arr[i] % 2 == 0 && arr[i] >= 0) {
                even += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(even);
    }
}