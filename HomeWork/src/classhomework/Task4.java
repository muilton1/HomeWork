package classhomework;

//Ряд Фибоначчи
public class Task4 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < 6; i++) {
            System.out.print((first + second) + " ");
            int a = first;
            first = second;
            second = a + first;
        }
    }
}
