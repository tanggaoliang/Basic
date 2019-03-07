package sort;

import java.util.Arrays;

public class SheelSortDemo {
    public static void main(String[] args) {
        //int[] arr = {3,1,0};
        int[] arr = {23, 85, 89, 3, 34, 81, 43, 24, 38, 9, 31, 73, 26, 18, 99, 11, 15, 56, 87, 61, 49, 30, 94, 47, 62, 68, 93, 27, 28, 84, 25, 75, 80, 6, 1, 67, 19, 88, 8, 0, 40, 41, 52, 7, 53, 82, 45, 44, 4, 96, 50, 51, 42, 14, 78, 55, 21, 57, 92, 17, 60, 59, 79, 86, 12, 66, 36, 95, 97, 54, 70, 58, 64, 90, 74, 37, 76, 77, 20, 39, 91, 33, 72, 83, 29, 10, 71, 2, 32, 69, 22, 5, 13, 65, 35, 16, 48, 46, 98, 63};
        //int[] arr = {9, 38, 81, 33, 71, 72, 88, 76, 84, 2, 10, 25, 63, 3, 56, 64, 26, 13, 79, 12, 20, 99, 37, 85, 60, 39, 51, 55, 34, 8, 98, 40, 29, 65, 11, 14, 90, 22, 1, 31, 42, 41, 53, 52, 30, 96, 45, 47, 48, 21, 50, 43, 57, 62, 73, 4, 66, 19, 28, 97, 24, 61, 16, 67, 91, 59, 94, 23, 68, 7, 82, 18, 70, 35, 74, 75, 89, 77, 78, 6, 17, 46, 15, 83, 92, 86, 58, 80, 54, 44, 93, 69, 27, 32, 49, 95, 87, 5, 0, 36};
        //int[] arr = {3, 2, 4,1};
        System.out.println(Arrays.toString(arr));
        //sheelSort(arr);
        sort2(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void sort(int[] arr) {
        // i表示希尔排序中的第n/2+1个元素（或者n/4+1）
        // j表示希尔排序中从0到n/2的元素（n/4）
        // r表示希尔排序中n/2+1或者n/4+1的值
        int i, j, tmp, len = arr.length, incrementNumber = len / 2;
        // 划组排序
        while (incrementNumber >= 1) {
            for (i = incrementNumber; i < len; i++) {
                tmp = arr[i];
                j = i - incrementNumber;
                System.out.println("---" + Arrays.toString(arr) + " ,i=" + i + ",j=" + j + " increment =" + incrementNumber);
                // 一轮排序
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + incrementNumber] = arr[j];
                    j -= incrementNumber;
                    System.out.println("000" + Arrays.toString(arr) + " ,i=" + i + ",j=" + j + " increment =" + incrementNumber);

                }
                arr[j + incrementNumber] = tmp;
                System.out.println("111" + Arrays.toString(arr) + " ,i=" + i + ",j=" + j + " increment =" + incrementNumber);
            }
            incrementNumber = incrementNumber / 2;
//            System.out.println(i + ":" + Arrays.toString(arr));
        }
    }


    private static void sort2(int[] a) {
        int i, j, len = a.length, temp, increment = len / 2;
        while (increment >= 1) {
            for (i = len - increment; i >= 0; i--) {
                temp = a[i];
                j = i + increment;
                while (j < len && a[j] < temp) {
                    a[j - increment] = a[j];
                    j += increment;
                }
                a[j - increment] = temp;
            }
            increment = increment / 2;

        }

    }

    private static void sheelSort(int[] arr) {
        int baseSize = 2;
        int arr_length = arr.length;
        if (arr_length < baseSize) {
            return;
        }
        int incrementNumber = arr_length / 2;
        while (incrementNumber >= 1) {
            for (int i = 0; i < arr_length; i++) {
                //进行插入排序
                for (int j = i; j < arr_length - incrementNumber; j++) {
                    if (arr[j] > arr[j + incrementNumber]) {
                        int temp = arr[j];
                        arr[j] = arr[j + incrementNumber];
                        arr[j + incrementNumber] = temp;
//                        System.out.println();
//                        System.out.println("    " + temp + "     " + arr[j] + "     [" + incrementNumber + "] " + " i=" + i + " j=" + j);
//                        System.out.println(Arrays.toString(arr));
                    }

                }
            }

            //设置新的增量
            incrementNumber /= 2;

        }
//        if (arr[0] > arr[1]) {
//            arr[0] += arr[1];
//            arr[1] = arr[0] - arr[1];
//            arr[0] = arr[0] - arr[1];
//        }

    }

}
