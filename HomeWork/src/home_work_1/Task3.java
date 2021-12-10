package home_work_1;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {//выводим случайные значения трех чисел, в диапазоне от 0.0 до 1.0
            System.out.println(Math.random());
        }
        System.out.println("-143 по модулю =" + Math.abs(-143L));
        System.out.println("Арккосинус 0 =" + Math.acos(0));
        System.out.println(Math.addExact(1, 2147483646));//ошибка при переполнении суммы двух переменных
        System.out.println("Арксинус -1 =" + Math.asin(-1));
        System.out.println("Арктангенс 1=" + Math.atan(1));
        System.out.println("Кубический корень из 125 =" + Math.cbrt(125));
        System.out.println(Math.ceil(28.2));//округление числа 28.2 в большую сторону , вне зависимости от значения дробной части
        System.out.println(Math.copySign(2.46, -10000));// возвращаем первый аргумент, со знаком второго
        System.out.println(Math.decrementExact(589));//возвращаем аргумент,уменьшенный на единицу, ошибка при переполнении int или long
        System.out.println(Math.exp(2));//возводим e во вторую степень
        System.out.println(Math.floor(28.8));//округление числа 28.8 в меньшую сторону , вне зависимости от значения дробной части
        System.out.println(Math.pow(3, 2));//возводим параметр а в степень b
        System.out.println(Math.round(-28.2));//округление числа
        System.out.println(Math.max(10, 15));//возвращаем большее из двух чисел
        System.out.println(Math.min(10, 15));//возвращаем меньшее из двух чисел
        System.out.println(Math.hypot(3, 4));//возвращаем длину гипотенузы 25=9+16
        System.out.println(Math.IEEEremainder(28.2, 24.3));//возвращаем остаток от деления 28.2 на 24.3
    }
}
