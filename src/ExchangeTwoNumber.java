public class ExchangeTwoNumber {
    public static void main(String[] args) {
        int a=-8,b=4;
//        demo1(a,b);
//        demo2(a,b);
//        demo3(a,b);

    }

    private static void demo1(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " , b = " + b);
    }

    private static void demo2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " , b = " + b);

    }

    private static void demo3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + " , b = " + b);

    }
}
