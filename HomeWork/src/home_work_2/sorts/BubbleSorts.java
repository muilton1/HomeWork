package home_work_2.sorts;

import home_work_2.arrays.ArraysUtils;

import java.util.Arrays;

public class BubbleSorts {
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.getArray1();
        System.out.print(Arrays.toString(array1.getArray1()));
        SortsUtils.bubbleSort(array1.getArray1());
        System.out.println("после---->>>" + Arrays.toString(array1.getArray1()));
        System.out.println("_______________");

        Array2 array2 = new Array2();
        array2.getArray2();
        System.out.print(Arrays.toString(array2.getArray2()));
        SortsUtils.bubbleSort(array2.getArray2());
        System.out.println("после---->>>" + Arrays.toString(array2.getArray2()));

        Array3 array3 = new Array3();
        array3.getArray3();
        System.out.print(Arrays.toString(array3.getArray3()));
        SortsUtils.bubbleSort(array3.getArray3());
        System.out.println("после---->>>" + Arrays.toString(array3.getArray3()));
        System.out.println("_______________");

        Array4 array4 = new Array4();
        array4.getArray4();
        System.out.print(Arrays.toString(array4.getArray4()));
        SortsUtils.bubbleSort(array4.getArray4());
        System.out.println("после---->>>" + Arrays.toString(array4.getArray4()));
        System.out.println("_______________");

        Array5 array5 = new Array5();
        array5.getArray5();
        System.out.print(Arrays.toString(array5.getArray5()));
        SortsUtils.bubbleSort(array5.getArray5());
        System.out.println("после---->>>" + Arrays.toString(array5.getArray5()));
        System.out.println("_______________");

        int[] array6 = ArraysUtils.arrayRandom(5, 100);
        System.out.print(Arrays.toString(array6));
        SortsUtils.bubbleSort(array6);
        System.out.println("после---->>>" + Arrays.toString(array6));
        System.out.println("_______________");

        int[] array7 = ArraysUtils.arrayFromConsole();
        System.out.print(Arrays.toString(array7));
        SortsUtils.bubbleSort(array7);
        System.out.println("после---->>>" + Arrays.toString(array7));
        System.out.println("_______________");
    }
}
