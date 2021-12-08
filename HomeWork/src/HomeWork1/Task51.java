package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        in.close();
        String a = "Вася";
        String b = "Анастасия";
        if (Objects.equals(a, name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(b, name)) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(a, name) && !Objects.equals(b, name)) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}