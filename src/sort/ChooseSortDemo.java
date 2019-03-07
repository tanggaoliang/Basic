/**
 * @author: tang gao liang
 * @time:2019/3/7 13:40:43
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package sort;

import java.util.Arrays;

public class ChooseSortDemo {
    public static void main(String[] args) {
        int[] arr = {32, 18, 48, 16, 35, 48, 78, 16, 23, 432, 19, 54, 79, 43};
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void chooseSort(int[] arr) {
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
