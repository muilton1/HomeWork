package classhomework;

import java.util.Random;

//Вероятность четных случайных чисел
public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i;
        float even = 0;
        for (i = 0; i < 10000; i++) {
            if (rnd.nextInt(50) % 2 == 0) {
                even += 1;
            }
        }
        System.out.println("Вероятность выпадения четных чисел равна " + even / 10000 * 100);
    }
}
