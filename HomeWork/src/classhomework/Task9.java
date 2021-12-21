package classhomework;

import java.util.Arrays;
import java.util.Random;

//Элементы массива меньше среднеарифметического
public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        long sum = 0;
        long average = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(20);
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        average = sum / arr.length;
        for (int j : arr) {
            if (j < average) {
                System.out.println(j);
            }
        }
    }
}
