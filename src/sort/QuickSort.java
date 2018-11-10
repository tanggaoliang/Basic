package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = {12, 20,5, 5, 16, 15, 1, 30, 45, 23, 9};
        System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length - 1;
        sort(a, start, end);
        System.out.println(Arrays.toString(a));

    }

    private static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (end > start) {
            while (end > start && a[end] >= key) {
                end--;
            }
            if (a[end] < key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;

            }
            while (end > start && a[start] <= key) {
                start++;
            }
            if (a[start] > key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            if(start>low)sort(a,low,start-1);
            if(end<high)sort(a,end+1,high);


        }

    }

}
