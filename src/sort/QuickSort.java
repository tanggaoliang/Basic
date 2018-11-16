package sort;

public class QuickSort {

    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void partition(int left, int right, int[] array) {
        //左指针的起点，left-1是由于在后面的循环中，每循环一次左指针都要右移，
        //这样可以确保左指针从左边第一个元素开始，不然是从第二个开始
        int pivot = array[left];
        int leftPoint = left;
        //右指针的起点，right+1是由于后面的循环中，每循环一次右指针都要左移，
        //这样可以确保右指针从最右边开始，不然是从倒数第二个开始
        int rightPoint = right;
        //左指针和右指针没有重叠或相交
        while (leftPoint < rightPoint) {
            //找到左边大于pivot的数据，或者走到了最右边仍然没有找到比pivot大的数据

            //找到右边小于pivot的数据，或者走到了最左边仍然没有找到比pivot小的数据
            while (leftPoint < rightPoint && array[rightPoint] >= pivot) {
                rightPoint--;
            }
            if (array[rightPoint] < pivot) {
                swap(rightPoint, leftPoint, array);
            }
            //交换左边大的和右边小的数据
            while (leftPoint < rightPoint && array[leftPoint] <= pivot) {
                leftPoint++;
            }
            if (array[leftPoint] > pivot) {
                swap(rightPoint, leftPoint, array);
            }

            if (left<leftPoint) {
                partition(left, leftPoint - 1, array);
            }
            if (rightPoint < right) {
                partition(rightPoint + 1, right, array);
            }
        }
        //返回分界点，即右边子数组中最左边的点

    }


    private void swap(int leftPoint, int rightPoint, int array[]) {
        int temp = array[leftPoint];
        array[leftPoint] = array[rightPoint];
        array[rightPoint] = temp;
    }

    public static void main(String args[]) {
        int[] array = {9,8,1,5,2,3,4,7,6,0};
        QuickSort qs = new QuickSort();
        System.out.println("划分前的数据为：");
        qs.printArray(array);
        qs.partition(0, array.length - 1, array);
        System.out.println("划分后的数据为：");
        qs.printArray(array);
    }

}