package home_work_2.sorts;

import java.util.Arrays;

public class Array3 {
    private int[] array3 = {9, 1, 5, 99, 9, 9};

    public int[] getArray3() {
        return array3;
    }

    public void setArray3(int[] array3) {
        this.array3 = array3;
    }

    @Override
    public String toString() {
        return "массив{" +
                "array3=" + Arrays.toString(array3) +
                '}';
    }
}
