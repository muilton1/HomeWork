package home_work_2.sorts;

public class Array1 {
    private int[] array1 = {1, 2, 111, 4, 5, 6};

    public static int[] toString(int[] array1) {
        return array1;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    @Override
    public String toString() {
        return "массив{" +
                "array1=" + java.util.Arrays.toString(array1) +
                '}';
    }
}
