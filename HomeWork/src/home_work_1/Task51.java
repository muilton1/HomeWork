package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");//запрос имени пользователя через консоль
        String name = in.nextLine();//считывает всю введенную строку
        in.close();//завершаем ввод с консоли
        String a = "Вася";
        String b = "Анастасия";
        if (Objects.equals(a, name)) {//если введенная строка, равна строке а "Вася", то выводим следующее
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(b, name)) {//если введенная строка, равна строке b "Анастасия", то выводим следующее
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(a, name) && !Objects.equals(b, name)) {//если введенная строка не равна строке а И не равна строке b, то выводим следующее
            System.out.println("Добрый день, а вы кто?");
        }
    }
}