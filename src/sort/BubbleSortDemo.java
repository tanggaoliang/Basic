package sort;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {32, 18, 48, 16, 35, 48, 78, 16, 23, 432, 19, 54, 79, 43};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
}
