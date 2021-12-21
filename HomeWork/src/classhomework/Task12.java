package classhomework;

import java.util.Arrays;
import java.util.Random;

//Сумма цифр массива
public class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
            System.out.println(Arrays.toString(arr));
            while (arr[i] > 0) {
                sum += arr[i] % 10;
                arr[i] /= 10;
            }
            System.out.println(sum);
        }
    }
}
