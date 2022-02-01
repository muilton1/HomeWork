package home_work_4;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {
    /**
     * Поле для хранения передаваемых объектов
     */
    private T[] data;

    /**
     * Конструктор
     *
     * @param data
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавления данных в data
     *
     * @param item данные, которые хотим добавить
     * @return индекс, добавленных данных
     */
    public int add(T item) {
        int i;
        for (i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
            if (item == null) {
                return -1;
            }
        }
        //если data переполнено, расширяем пространство, для добавления данных
        for (int j = 0; j < data.length; j++) {
            if (data[data.length - 1] != null) {
                data = Arrays.copyOf(data, data.length + 1);
                int k = data.length - 1;
                if (data[k] == null) {
                    data[k] = item;
                    i = k;
                    return i;
                }
            }
        }
        //если data пустое, расширяем пространство, для добавления данных
        if (data.length == 0) {
            data = Arrays.copyOf(data, data.length + 1);
            int n = data.length - 1;
            if (data[n] == null) {
                data[n] = item;
                return i;
            }
        }
        return i;
    }

    /**
     * Метод получает значение из поля data, по индексу
     *
     * @param index индекс
     * @return значени по индексу
     */
    public T get(int index) {
        if (index >= data.length || index < 0) {
            return null;
        }
        return data[index];
    }

    /**
     * Метод возвращает поле data
     *
     * @return поле data
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод удаляет элемент по индексу
     *
     * @param index индекс элемента
     * @return true, если получилось удалить/false-если нет
     */
    public boolean delete(int index) {
        //если индекс не существует,возвращаем false
        if (index >= data.length || index < 0) {
            return false;
        }
        //присваиваем элементу по заданному индексу null и сдвигаем его в конец массива
        data[index] = null;
        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
            data[i] = null;
        }
        //уменьшаем массив на 1 ячейку
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    /**
     * Метод удаляет элемент по значению
     *
     * @param item значение
     * @return true, если есть такой элемент и его полуилось удалить/false-если нет такого элемента
     */
    public boolean delete1(T item) {
        //находим эквивалентный элемент и обращаемся к предыдущему методу для его удаления
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Метод сортировки данных
     *
     * @param comparator реализация сравнения(пузырьковая сортировка)
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    T temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    /**
     * Дженерик метод сортировки
     *
     * @param container передаем объект
     * @param <T>
     */
    public static <T extends Comparable<T>> void sort1(DataContainer<T> container) {
        container.sort(Comparator.naturalOrder());
    }

    /**
     * Метод сортировки
     *
     * @param container  передаем объект
     * @param comparator передаем как сравнивать
     * @param <T>
     */
    public static <T> void sort2(DataContainer<T> container, Comparator<T> comparator) {
        container.sort(comparator);
    }

    /**
     * Переопределение метода toString
     *
     * @return data без null ячеек
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T s : data) {
            if (s != null) {
                sb.append(s).append(',');
            }
        }
        String array = sb.toString();
        return "[" + array + "]";
    }

    /**
     * Переопределение метода интерфейса Iterable
     *
     * @return массив data
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length && data[index] != null;
            }

            @Override
            public T next() {
                return data[index++];
            }
        };
    }
}

