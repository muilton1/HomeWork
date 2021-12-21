package home_work_2.loops;

public class Loop12 {
    public static void main(String[] args) {
        //ловим ошибку на ввод текста
        try {
            Long.parseLong(args[0]);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Введен текст!");
            return;
        }
        //проверка на дробность числа
        if (Long.parseLong(args[0]) % 2 != 0) {
            System.out.println("Введено не целое число!");
            return;
        }

        long number = Long.parseLong(reverseString(args[0]));
        long result = 1;

        //пишем цикл для перевернутого числа, узнавая его цифры с конца,путем высчитывания остатка от деления на 10,затем перемножаем
        while (number > 0) {
            long partNumber = number % 10;
            System.out.print(partNumber);
            result *= partNumber;
            number /= 10;
            if (partNumber > 0) {
                System.out.print("*");
            }
        }
        System.out.print("=" + result);
    }

    //переворачиваем введенную строку
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

