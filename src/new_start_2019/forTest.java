package new_start_2019;

public class forTest {
    void test2() {
        int[] b = new int[5];
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.println(x);
        }
        b = numbers;
        for (int x : b) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        forTest a = new forTest();
        a.test2();
        for (int x = 10; x < 20; x++) {
            System.out.println("value of x :" + x);
        }
    }
}
