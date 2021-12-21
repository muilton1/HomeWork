package home_work_2.sorts;

import java.util.Arrays;

public class Array5 {
    private int[] array5 = {6, 5, 4, 3, 2, 1};

    public int[] getArray5() {
        return array5;
    }

    public void setArray5(int[] array5) {
        this.array5 = array5;
    }

    @Override
    public String toString() {
        return "массив{" +
                "array5=" + Arrays.toString(array5) +
                '}';
    }
}
