package home_work_1;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {8, 8, 0, 0, 5, 5, 5, 3, 5, 3};//задаем массив из 10 цифр
        System.out.println(createPhoneNumber(array));//обращаемся к методу createPhoneNumber и выводим заданный массив array
    }

    public static String createPhoneNumber(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        //вводим макет нужной формы (...) ...-.... и далее заполняем его 10 цифрами
    }
}