package home_work_2.sorts;

import java.util.Arrays;

public class Array2 {
    private int[] array2 = {1, 1, 1, 1};

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    @Override
    public String toString() {
        return "массив{" +
                "array2=" + Arrays.toString(array2) +
                '}';
    }
}
