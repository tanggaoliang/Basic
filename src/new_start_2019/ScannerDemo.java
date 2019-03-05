/*
 * @author:tang gao liang
 * @time:2019/3/5 14:23:13
 * @qq:1440535574
 */
package new_start_2019;

import java.util.Scanner;

//next():
//
//        1、一定要读取到有效字符后才可以结束输入。
//        2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
//        3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
//        next() 不能得到带有空格的字符串。
//nextLine()：
//
//        1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
//        2、可以获得空白。
public class ScannerDemo {
    public static void main(String[] args) {
        ScannerDemo scannerDemo = new ScannerDemo();
//        scannerDemo.fun1();
//        scannerDemo.fun2();
        scannerDemo.fun3();

    }

    private void fun3() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum += x;
        }
        scanner.close();
        System.out.println("the mount is " + m);
        System.out.println("the average is " + sum / m);

    }

    private void fun2() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("please input integer:");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("the integer is " + i);
        } else {
            System.out.println("the input is not integer");
        }
        System.out.println("please input float");
        if (scanner.hasNextFloat()) {
            System.out.println("the  float is " + scanner.nextFloat());
        } else {
            System.out.println("the input is not float!");
        }
    }

    private void fun1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("next acceptance");
        while (scanner.hasNext()) {
//            System.out.println("the input is " + new String(scanner.next()));
            System.out.println("the input is " + scanner.nextLine());
        }
        scanner.close();
    }


}
