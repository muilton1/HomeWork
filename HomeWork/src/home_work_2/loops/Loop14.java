package home_work_2.loops;

public class Loop14 {
    public static void main(String[] args) {
        //работает только с положительными числами
        long a = 1;
        long number = 188;
        for (; ; ) {
            a *= number;
            if (a < 0) {
                System.out.println("Значение после переполнения = " + a);
                return;
            } else if (a > Long.MAX_VALUE / number) {
                System.out.println("Значение до переполнения = " + a);
            }
        }
    }
}
