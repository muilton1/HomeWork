package home_work_1;

public class Task1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        System.out.println("42 & 15 =" + (a & b));
        /*  00101010 42
          & 00001111 15
          _____________
            00001010 10 */
        System.out.println("42 | 15 =" + (a | b));
        /*   00101010 42
           | 00001111 15
           _____________
             00101111 47 */
        System.out.println("42 ^ 15 =" + (a ^ b));
        /*  00101010 42
          ^ 00001111 15
           _____________
            00100101 37 */
        System.out.println("~42 =" + (~a));
        // 42 = 00101010 , -43 = 11010101
        System.out.println("~15 =" + (~b));
        // 15 = 00001111 , -16 = 11110000
        System.out.println("42<<2 =" + (a << 2));
        // 42 = 00101010 , 168 = 10101000
        System.out.println("15<<2 =" + (b << 2));
        // 15 = 00001111 , 60 = 00111100
        System.out.println("42>>3 =" + (a >> 3));
        // 42 = 00101010 , 5 = 00000101
        System.out.println("15>>3 =" + (b >> 3));
        // 15 = 00001111 , 1 = 00000001
        System.out.println("42>>>4 =" + (a >>> 4));
        // 42 = 00101010 , 2 = 00000010
        System.out.println("15>>>3 =" + (b >>> 3));
        // 15 = 00001111 , 1 = 00000001
        System.out.println("-42 & -15 =" + (-a & -b));
        /*   11010110 -42
         * & 11110001 -15
         * _____________
             11010000 -48 */
        System.out.println("-42 | -15 =" + (-a | -b));
        /*   11010110 -42
         * | 11110001 -15
         * _____________
             11110111 -9 */
        System.out.println("-42 ^ -15 =" + (-a ^ -b));
        /*   11010110 -42
         * ^ 11110001 -15
         * _____________
             00100111  39 */
        System.out.println("~(-42) =" + ~(-a));
        // -42 = 11010110 , 41 = 00101001
        System.out.println("~(-15) =" + (~(-b)));
        // -15 = 11110001 , 14 = 00001110
        System.out.println("-42<<2 =" + ((-a) << 2));
        // -42 = 11010110 , -168 = 01011000
        System.out.println("-15<<2 =" + ((-b) << 2));
        // -15 = 11110001 , -60 = 11000100
        System.out.println("-42>>3 =" + ((-a) >> 3));
        // -42 = 11010110 , -6 = 11111010
        System.out.println("-15>>3 =" + ((-b) >> 3));
        // -15 = 11110001 , -2 = 11111110
        System.out.println("-42>>>24 =" + ((-a) >>> 24));
        // -42 = 11111111 11111111 11111111 11010110 , 255 = 00000000 00000000 00000000 11111111
        System.out.println("-15>>>24 =" + ((-b) >>> 24));
        // -15 = 11111111 11111111 11111111 11110001 , 255 = 00000000 00000000 00000000 11111111
        /*float y = 42.5F, System.out.println(y & a)
         * https://cs-fundamentals.com/java-programming/java-bitwise-operators.php
         * Bitwise operators cannot be used with floating-point, boolean, array, or object operands*/
    }
}