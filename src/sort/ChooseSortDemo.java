package sort;

import java.util.Arrays;

public class ChooseSortDemo {
    public static void main(String[] args) {
        int[] arr = {32, 18, 48, 16, 35, 48, 78, 16, 23, 432, 19, 54, 79, 43};
        ChooseSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void ChooseSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
