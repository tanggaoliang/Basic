import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        int x = 0, y = 0;
        for (int j = 0; j < 100; j++) {
            x = new Random().nextInt(100);
            y = new Random().nextInt(100);
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
