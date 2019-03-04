package new_start_2019;

public class breakAndContinueTest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("-----");
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
    }
}
