package home_work_2.sorts;

import home_work_2.arrays.ArraysUtils;

import java.util.Arrays;

public class ShakerSorts {
    public static void main(String[] args) {
        shakerSort1();
        shakerSort2();
        shakerSort3();
        shakerSort4();
        shakerSort5();
        shakerSort6();
        shakerSort7();
    }

    public static void shakerSort1() {
        Array1 arrays1 = new Array1();
        arrays1.getArray1();
        System.out.print(arrays1 + "до--->");
        int left = 0;
        int right = arrays1.getArray1().length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arrays1.getArray1()[i - 1] > arrays1.getArray1()[i]) {
                    int temp = arrays1.getArray1()[i - 1];
                    arrays1.getArray1()[i - 1] = arrays1.getArray1()[i];
                    arrays1.getArray1()[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (arrays1.getArray1()[i] > arrays1.getArray1()[i + 1]) {
                    int temp = arrays1.getArray1()[i + 1];
                    arrays1.getArray1()[i + 1] = arrays1.getArray1()[i];
                    arrays1.getArray1()[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + arrays1);
        System.out.println("______________________");
    }

    public static void shakerSort2() {
        Array2 arrays2 = new Array2();
        arrays2.getArray2();
        System.out.print(arrays2 + "до--->");
        int left = 0;
        int right = arrays2.getArray2().length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arrays2.getArray2()[i - 1] > arrays2.getArray2()[i]) {
                    int temp = arrays2.getArray2()[i - 1];
                    arrays2.getArray2()[i - 1] = arrays2.getArray2()[i];
                    arrays2.getArray2()[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (arrays2.getArray2()[i] > arrays2.getArray2()[i + 1]) {
                    int temp = arrays2.getArray2()[i + 1];
                    arrays2.getArray2()[i + 1] = arrays2.getArray2()[i];
                    arrays2.getArray2()[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + arrays2);
        System.out.println("______________________");
    }

    public static void shakerSort3() {
        Array3 arrays3 = new Array3();
        arrays3.getArray3();
        System.out.print(arrays3 + "до--->");
        int left = 0;
        int right = arrays3.getArray3().length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arrays3.getArray3()[i - 1] > arrays3.getArray3()[i]) {
                    int temp = arrays3.getArray3()[i - 1];
                    arrays3.getArray3()[i - 1] = arrays3.getArray3()[i];
                    arrays3.getArray3()[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (arrays3.getArray3()[i] > arrays3.getArray3()[i + 1]) {
                    int temp = arrays3.getArray3()[i + 1];
                    arrays3.getArray3()[i + 1] = arrays3.getArray3()[i];
                    arrays3.getArray3()[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + arrays3);
        System.out.println("______________________");
    }

    public static void shakerSort4() {
        Array4 arrays4 = new Array4();
        arrays4.getArray4();
        System.out.print(arrays4 + "до--->");
        int left = 0;
        int right = arrays4.getArray4().length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arrays4.getArray4()[i - 1] > arrays4.getArray4()[i]) {
                    int temp = arrays4.getArray4()[i - 1];
                    arrays4.getArray4()[i - 1] = arrays4.getArray4()[i];
                    arrays4.getArray4()[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (arrays4.getArray4()[i] > arrays4.getArray4()[i + 1]) {
                    int temp = arrays4.getArray4()[i + 1];
                    arrays4.getArray4()[i + 1] = arrays4.getArray4()[i];
                    arrays4.getArray4()[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + arrays4);
        System.out.println("______________________");
    }

    public static void shakerSort5() {
        Array5 arrays5 = new Array5();
        arrays5.getArray5();
        System.out.print(arrays5 + "до--->");
        int left = 0;
        int right = arrays5.getArray5().length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arrays5.getArray5()[i - 1] > arrays5.getArray5()[i]) {
                    int temp = arrays5.getArray5()[i - 1];
                    arrays5.getArray5()[i - 1] = arrays5.getArray5()[i];
                    arrays5.getArray5()[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (arrays5.getArray5()[i] > arrays5.getArray5()[i + 1]) {
                    int temp = arrays5.getArray5()[i + 1];
                    arrays5.getArray5()[i + 1] = arrays5.getArray5()[i];
                    arrays5.getArray5()[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + arrays5);
        System.out.println("______________________");
    }

    public static void shakerSort6() {
        int[] array6 = ArraysUtils.arrayRandom(5, 100);
        System.out.print(Arrays.toString(array6));
        int left = 0;
        int right = array6.length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array6[i - 1] > array6[i]) {
                    int temp = array6[i - 1];
                    array6[i - 1] = array6[i];
                    array6[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (array6[i] > array6[i + 1]) {
                    int temp = array6[i + 1];
                    array6[i + 1] = array6[i];
                    array6[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + Arrays.toString(array6));
        System.out.println("______________________");
    }

    public static void shakerSort7() {
        int[] array7 = ArraysUtils.arrayFromConsole();
        System.out.print(Arrays.toString(array7));

        int left = 0;
        int right = array7.length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array7[i - 1] > array7[i]) {
                    int temp = array7[i - 1];
                    array7[i - 1] = array7[i];
                    array7[i] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (array7[i] > array7[i + 1]) {
                    int temp = array7[i + 1];
                    array7[i + 1] = array7[i];
                    array7[i] = temp;
                }
            }
            --right;
        }
        System.out.println("после--->" + Arrays.toString(array7));
        System.out.println("______________________");
    }
}
