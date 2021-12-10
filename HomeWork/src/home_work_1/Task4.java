package home_work_1;

public class Task4 {
    public static void main(String[] args) {
        if (sleepIn(true, false)) {//задаем значения отпуска и рабочего дня, получаем ответ от метода sleepIn, на основании данного ответа,выполняется метод main
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {//метод отвечает на вопрос, спать ли нам дальше
        if (!weekday || vacation) {//если рабочий день = false или отпуск = true, возвращаем значение true
            return true;
        }
        return false;//в остальных случаях,возвращаем false
    }
}
