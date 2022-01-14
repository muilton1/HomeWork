package home_work_4;


import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        System.out.println("Номер данной позиции: " + container.add(777));
        System.out.println("Значение на данной позиции:" + container.get(1));
        System.out.println("Номер данной позиции: " + container.add(222));
        System.out.println("Значение на данной позиции:" + container.get(3));
        System.out.println("Номер данной позиции: " + container.add(111));
        System.out.println("Значение на данной позиции:" + container.get(4));
        System.out.println("Номер дайнной позиции: " + container.add(444));
        System.out.println("Значение на данной позиции:" + container.get(5));
        System.out.println("Номер дайнной позиции: " + container.add(1));
        System.out.println("Значение на данной позиции:" + container.get(6));
        System.out.println("Номер дайнной позиции: " + container.add(555));
        System.out.println("Значение на данной позиции:" + container.get(7));
        System.out.println("Текущий массив:" + container);
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println("Удалился элемент на данной позиции?:" + container.delete(7));
        System.out.println("Текущий массив:" + container);
        System.out.println("Удалился элемент на данной позиции?:" + container.delete(7));
        System.out.println("Текущий массив:" + container);
        System.out.println("Удалился конкретный элемент?:" + container.delete1(1));
        System.out.println("Текущий массив:" + container);
        System.out.println("Удалился конкретный элемент?:" + container.delete1(555));
        System.out.println("Текущий массив:" + container);
        DataContainer.sort1(container);
        DataContainer.sort2(container, Integer::compareTo);
        System.out.println("Текущий массив:" + container);
        System.out.println("Выводим массив с помощью Iterable:");
        for (Integer item : container) {
            System.out.print(item + " ");
        }

    }
}
