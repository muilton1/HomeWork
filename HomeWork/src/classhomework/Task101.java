package classhomework;

import java.util.Arrays;
import java.util.Random;

//Найти два наименьших элемента массива
public class Task101 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

