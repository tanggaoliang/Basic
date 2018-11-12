package sort;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {32, 18, 48, 16, 35, 48, 78, 16, 23, 432, 19, 54, 79, 43};
        InsertionSort2(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void InsertionSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int leftIndex = i - 1;
            while (leftIndex >= 0 && arr[leftIndex] > temp) {
                arr[leftIndex + 1] = arr[leftIndex];
                leftIndex--;
            }
            arr[leftIndex + 1] = temp;

        }

    }

    private static void InsertionSort2(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int leftIndex;
            for (leftIndex = i - 1; leftIndex >= 0 && arr[leftIndex] > temp; leftIndex--) {
                arr[leftIndex + 1] = arr[leftIndex];
            }
            arr[leftIndex + 1] = temp;

        }


    }
}

