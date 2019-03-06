/*
 * @author:tang gao liang
 * @time:2019/3/6 13:18:28
 * @qq:1440535574
 */
package new_start_2019.generics;

//        Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。
//        泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
public class GenericDemo {
    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericDemo genericDemo = new GenericDemo();
//        Integer[] ints = {1, 2, 3, 4, 5};
//        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
//        Character[] chars = {'t', 'a', 'n', 'g'};
//        genericDemo.printArray(ints);
//        genericDemo.printArray(doubles);
//        genericDemo.printArray(chars);
        System.out.println(genericDemo.maximum(3, 4, 5));
        System.out.println(genericDemo.maximum(3.2, 4.2, 5.5));
        System.out.println(genericDemo.maximum("fd", "sd", "q"));

    }

    private <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
