package sort;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        int[] a = {9,8,1,5,2,3,4,7,6,0};
        System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length - 1;
        sort(a, start, end);
        System.out.println(Arrays.toString(a));

    }

    private static void sort(int[] a, int low, int high) {
       // System.out.println("(1)low is " + low + " , high is " + high);
        int start = low;
        int end = high;
        int key = a[low];
        //System.out.println("key is " + key);

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
            if (start > low) {
                //System.out.println("(2)low is " + low + " , high is " + (start - 1));
                sort(a, low, start - 1);
            }

            if (end < high) {
                //System.out.println("(3)low is " + (end + 1) + " , high is " + high);
                sort(a, end + 1, high);
            }


        }

    }

}
