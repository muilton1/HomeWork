package classhomework;

import java.util.Arrays;
import java.util.Random;

//Максимальный элемент массива с четным индексом
public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = -2_147_483_648;

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = new Random().nextInt();
            if ((arr)[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
}
