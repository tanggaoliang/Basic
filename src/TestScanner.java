import java.util.Scanner;

public class TestScanner {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("第一个整数："+a);
            int b = s.nextInt();
            System.out.println("第二个整数："+b);
        }
}
