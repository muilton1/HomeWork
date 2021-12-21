package home_work_2.sorts;

import home_work_2.arrays.ArraysUtils;

import java.util.Arrays;

public class BubbleSorts {
    public static void main(String[] args) {
        bubbleSort1();
        bubbleSort2();
        bubbleSort3();
        bubbleSort4();
        bubbleSort5();
        bubbleSort7();
        bubbleSort6();
    }

    public static void bubbleSort1() {
        Array1 arrays1 = new Array1();
        arrays1.getArray1();
        System.out.print(arrays1 + "-------до сортировки------>");

        for (int i = 0; i < arrays1.getArray1().length - 1; i++) {
            for (int j = arrays1.getArray1().length - 1; j > i; j--) {
                if (arrays1.getArray1()[j - 1] > arrays1.getArray1()[j]) {
                    int temp = arrays1.getArray1()[j - 1];
                    arrays1.getArray1()[j - 1] = arrays1.getArray1()[j];
                    arrays1.getArray1()[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + arrays1);
        System.out.println("\n_______________________________________");
    }

    public static void bubbleSort2() {
        Array2 arrays2 = new Array2();
        arrays2.getArray2();
        System.out.print(arrays2 + "-------до сортировки------>");

        for (int i = 0; i < arrays2.getArray2().length - 1; i++) {
            for (int j = arrays2.getArray2().length - 1; j > i; j--) {
                if (arrays2.getArray2()[j - 1] > arrays2.getArray2()[j]) {
                    int temp = arrays2.getArray2()[j - 1];
                    arrays2.getArray2()[j - 1] = arrays2.getArray2()[j];
                    arrays2.getArray2()[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + arrays2);
        System.out.println("\n_______________________________________");
    }

    public static void bubbleSort3() {
        Array3 arrays3 = new Array3();
        arrays3.getArray3();
        System.out.print(arrays3 + "-------до сортировки------>");

        for (int i = 0; i < arrays3.getArray3().length - 1; i++) {
            for (int j = arrays3.getArray3().length - 1; j > i; j--) {
                if (arrays3.getArray3()[j - 1] > arrays3.getArray3()[j]) {
                    int temp = arrays3.getArray3()[j - 1];
                    arrays3.getArray3()[j - 1] = arrays3.getArray3()[j];
                    arrays3.getArray3()[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + arrays3);
        System.out.println("\n_______________________________________");
    }

    public static void bubbleSort4() {
        Array4 arrays4 = new Array4();
        arrays4.getArray4();
        System.out.print(arrays4 + "-------до сортировки------>");

        for (int i = 0; i < arrays4.getArray4().length - 1; i++) {
            for (int j = arrays4.getArray4().length - 1; j > i; j--) {
                if (arrays4.getArray4()[j - 1] > arrays4.getArray4()[j]) {
                    int temp = arrays4.getArray4()[j - 1];
                    arrays4.getArray4()[j - 1] = arrays4.getArray4()[j];
                    arrays4.getArray4()[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + arrays4);
        System.out.println("\n_______________________________________");
    }

    public static void bubbleSort5() {
        Array5 arrays5 = new Array5();
        arrays5.getArray5();
        System.out.print(arrays5 + "-------до сортировки------>");

        for (int i = 0; i < arrays5.getArray5().length - 1; i++) {
            for (int j = arrays5.getArray5().length - 1; j > i; j--) {
                if (arrays5.getArray5()[j - 1] > arrays5.getArray5()[j]) {
                    int temp = arrays5.getArray5()[j - 1];
                    arrays5.getArray5()[j - 1] = arrays5.getArray5()[j];
                    arrays5.getArray5()[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + arrays5);
        System.out.println("\n_______________________________________");
    }

    public static void bubbleSort7() {
        int[] array7 = ArraysUtils.arrayRandom(5, 100);
        System.out.print(Arrays.toString(array7));
        for (int i = 0; i < array7.length - 1; i++) {
            for (int j = array7.length - 1; j > i; j--) {
                if (array7[j - 1] > array7[j]) {
                    int temp = array7[j - 1];
                    array7[j - 1] = array7[j];
                    array7[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + Arrays.toString(array7));
        System.out.println("\n_______________________________________");
    }

    public static void bubbleSort6() {
        int[] array6 = ArraysUtils.arrayFromConsole();
        System.out.print(Arrays.toString(array6));
        for (int i = 0; i < array6.length - 1; i++) {
            for (int j = array6.length - 1; j > i; j--) {
                if (array6[j - 1] > array6[j]) {
                    int temp = array6[j - 1];
                    array6[j - 1] = array6[j];
                    array6[j] = temp;
                }
            }
        }
        System.out.print("после сортировки------> " + Arrays.toString(array6));
        System.out.println("\n_______________________________________");

    }
}
