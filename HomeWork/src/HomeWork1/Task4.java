package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        if (task4.sleepIn(false, false)) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }
}