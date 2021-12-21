package home_work_2.arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        printAllElements();
        printReverseElements();
    }

    public static void printAllElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printReverseElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        String result = "";
        //записываем элементы массива в строку
        for (int i : array) {
            result = i + " " + result;
        }
        System.out.print(result);
    }

    /*For-each не отслеживает индекс,используя его мы не cможем вывести каждый второй элемент
    public static void printEvenElements() {
        int[] array = ArraysUtils.arrayFromConsole();
            }
     */
}

