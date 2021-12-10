package home_work_1;

public class Task7 {
    //работает только на положительных числах и без 0 спереди :(
    public static void main(String [] args) {
        byte a = 5;
        System.out.println(toBinaryString(a));
    }
    public static String toBinaryString(byte number) {
        String result = "";
        byte vvod;
        while(number!=0){//пока число не будет равным 0,будет работать цикл
            vvod= (byte) (number%2);//шаг 1: 5%2 =1//шаг 2: 2%2 = 0//шаг 3: 1%2=1
            result = vvod+result;//шаг 1:1+""=1//шаг 2: 1+0=10//шаг 3: 10+1=101
            number= (byte) (number/2);//шаг 1: 5/2 = 2//шаг 2: 2/2=1//шаг 3: 1/2=0,цикл прерывается
        }
        return result;//выводим результат 101
    }
}


