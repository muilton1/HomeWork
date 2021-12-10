package home_work_1;

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");//запрос имени пользователя через консоль
        String name = in.nextLine();//считывает всю введенную строку
        in.close();//завершаем ввод с консоли

        switch (name) {
            case "Вася": //если введенная строка совпала с "Вася", выводим 2 следующие строки, до break,если нет идем дальше
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия"://если введенная строка совпала с "Анастасия", выводим 2 следующие строки, до break,если нет идем дальше
                System.out.println("Я тебя так долго ждал");
                break;
            default://если ниодно из значений не совпало, выполняется следующее
                System.out.println("Добрый день, а вы кто?");
        }
    }
}