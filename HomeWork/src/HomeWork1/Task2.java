package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int c = 5 + 2 / 8; //5 + 2/8 = 5 + 0 = 5 (у деления приоритет выше)
        System.out.println("5 + 2/8 =" + c);
        int d = (5 + 2) / 8;// (5 + 2) / 8 = 7 / 8 = 0 (круглые скобки повышают приоритет заключенных в них операций)
        System.out.println("(5+2)/8 =" + d);
        int b = 2;
        System.out.println(b);
        int bb = b++;
        int e = (5 + bb) / 8;// (5 + 2++) / 8 = (5 + 2) / 8 = 0 (круглые скобки повышают приоритет заключенных в них операций, инкремент следующий по приоритету)
        System.out.println("(5+2++)/8) =" + e);
        int a = 8;
        System.out.println(a);
        int aa = --a;
        int f = (5 + bb) / aa;// (5 + 2++) / --8 = (5 + 2) / --8 = 1 (круглые скобки повышают приоритет заключенных в них операций: в скобках- инкремент->сложение, далее декремент ,далее деление)
        System.out.println("(5 + 2++) / --8 =" + f);
        int g = ((5 * 2 >> bb) / aa);// (5 * 2 >> 2) / 7 = (10 >> 2) / 7 = ((00001010>>2=00000010)) / 7 = 2 / 7 = 0 (скобки-инкремент-> умножение->сдвиг,далее декремент,далее деление)
        System.out.println("(5 * 2 >> 2++) / --8 =" + g);
        int h = ((5 + 7 > 20 ? 68 : 22 * 2 >> bb) / aa);// (12>20?68:22*2>>2)/ 7 = 12 меньше значит берем вторую часть,(22*2>>2)/7=(44>>2)/7= ((00101100>>2)=00001011)/7=11/7=1
        System.out.println("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 =" + h);
        boolean i = 6 - 2 > 3 && 12 * 12 <= 119;// ( если выполняются оба равенства 4 > 3 И 144 <= 119,тогда true, если хоть один нет,как в нашем примере 144<=119,тогда false)
        System.out.println(i);
        boolean j = true && false;//(только один оперант true,соответственно будет false)
        System.out.println(j);
        /*(не работает,в левой части тернарного оператора boolean значение,в правой int значение)
        boolean k = ((5 + 7) > 20 ? 68 >= 68 : 22 * 2 >> 2);
        int l = ((5 + 7) > 20 ? 68 >= 68 : 22 * 2 >> 2);
        */
    }
}