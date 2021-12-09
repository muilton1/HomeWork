package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");//запрос имени пользователя через консоль
        String name = in.nextLine();//считывает всю введенную строку
        in.close();//завершаем ввод с консоли
        String a = "Вася";
        String b = "Анастасия";
        if (Objects.equals(a, name)) {//если введенная строка равна строке а, то выводим следующие
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(b, name)) {//иначе,если введенная строка равна строке b, то выводим следующее
            System.out.println("Я тебя так долго ждал");
        } else if (!Objects.equals(a, name) && !Objects.equals(b, name)) {//иначе, если введенная строка не равна строке а и b, то выводим следующее
            System.out.println("Добрый день, а вы кто?");
        }
    }
}