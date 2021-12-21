package home_work_2.loops;

public class Loop15 {
    public static void main(String[] args) {
        System.out.print("*колокольчики*          ТАБЛИЦА" + "\n                       УМНОЖЕНИЯ" + "\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t | ");
            }
            System.out.println();
        }
        System.out.println("______________________________________________________________");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t | ");
            }
            System.out.println();
        }
        System.out.println(" ЭТО                         *цветочек* *динозаврик*" + "\n НУЖНО" + "\n ЗНАТЬ!");
    }
}
