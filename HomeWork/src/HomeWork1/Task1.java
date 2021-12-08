package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = a & b;
        /*  00101010 42
          & 00001111 15
          _____________
            00001010 10 */
        int d = a | b;
        /*   00101010 42
           | 00001111 15
           _____________
             00101111 47 */
        int e = a ^ b;
        /*  00101010 42
          ^ 00001111 15
           _____________
            00100101 37 */
        int f = ~a;
        // 42 = 00101010 , -43 = 11010101
        int g = ~b;
        // 15 = 00001111 , -16 = 11110000
        int h = a << 2;
        // 42 = 00101010 , 168 = 10101000
        int i = b << 2;
        // 15 = 00001111 , 60 = 00111100
        int j = a >> 3;
        // 42 = 00101010 , 5 = 00000101
        int k = b >> 3;
        // 15 = 00001111 , 1 = 00000001
        int l = a >>> 4;
        // 42 = 00101010 , 2 = 00000010
        int m = b >>> 3;
        // 15 = 00001111 , 1 = 00000001
        int n = -a & -b;
        /*   11010110 -42
          &  11110001 -15
          _____________
             11010000 -48 */
        int o = -a | -b;
        /*   11010110 -42
          |  11110001 -15
           _____________
             11110111 -9 */
        int p = -a ^ -b;
        /*   11010110 -42
          ^  11110001 -15
           _____________
             00100111  39 */
        int q = ~(-a);
        // -42 = 11010110 , 41 = 00101001
        int r = ~(-b);
        // -15 = 11110001 , 14 = 00001110
        int s = (-a) << 2;
        // -42 = 11010110 , -168 = 01011000
        int t = (-b) << 2;
        // -15 = 11110001 , -60 = 11000100
        int u = (-a) >> 3;
        // -42 = 11010110 , -6 = 11111010
        int v = (-b) >> 3;
        // -15 = 11110001 , -2 = 11111110
        int w = (-a) >>> 24;
        // -42 = 11111111 11111111 11111111 11010110 , 255 = 00000000 00000000 00000000 11111111
        int x = (-b) >>> 24;
        // -15 = 11111111 11111111 11111111 11110001 , 255 = 00000000 00000000 00000000 11111111
        a &= b; //то же, что и в строке 7
        b >>= 3;//то же, что и в строке 32
        float y = 42.5F;
        float yy = 21.25F;
        // float yyy = y ^ yy; побитовые операторы работают только с целыми числами
        System.out.println("42 & 15 =" + c);
        System.out.println("42 | 15 =" + d);
        System.out.println("42 ^ 15 =" + e);
        System.out.println("~42 =" + f);
        System.out.println("~15 =" + g);
        System.out.println("42<<2 =" + h);
        System.out.println("15<<2 =" + i);
        System.out.println("42>>3 =" + j);
        System.out.println("15>>3 =" + k);
        System.out.println("42>>>4 =" + l);
        System.out.println("15>>>3 =" + m);
        System.out.println("-42 & -15 =" + n);
        System.out.println("-42 | -15 =" + o);
        System.out.println("-42 ^ -15 =" + p);
        System.out.println("~(-42) =" + q);
        System.out.println("~(-15) =" + r);
        System.out.println("-42<<2 =" + s);
        System.out.println("-15<<2 =" + t);
        System.out.println("-42>>3 =" + u);
        System.out.println("-15>>3 =" + v);
        System.out.println("-42>>>24 =" + w);
        System.out.println("-15>>>24 =" + x);
        System.out.println("a &=b =" + a);
        System.out.println("b >>=3 =" + b);
        System.out.println(y);
    }
}