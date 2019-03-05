/*
 * @author:tang gao liang
 * @time:2019/3/5 20:04:53
 * @qq:1440535574
 */
package new_start_2019.data_structure;
//        向量（Vector）类和传统数组非常相似，但是Vector的大小能根据需要动态的变化。
//        和数组一样，Vector对象的元素也能通过索引访问。
//        使用Vector类最主要的好处就是在创建对象的时候不必给对象指定大小，它的大小会根据需要动态的变化。

import java.util.Enumeration;
import java.util.Vector;

//        Vector 类实现了一个动态数组。和 ArrayList 很相似，但是两者是不同的：
//        Vector 是同步访问的。
//        Vector 包含了许多传统的方法，这些方法不属于集合框架。
//

//        方法	效果
//        size()	返回容器的大小
//        empty()	判断容器是否为空
//        max_size()	返回容器最大的可以存储的元素
//        capacity()	返回容器当前能够容纳的元素数量
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector(3, 2);
        System.out.println(vector);
        System.out.println("Initial size : " + vector.size());
        System.out.println("Initial capacity : " + vector.capacity());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("Capacity after four additions : " + vector.capacity());
        vector.addElement(5.45);
        System.out.println("Current capacity : " + vector.capacity());
        Enumeration vEnum = vector.elements();
        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement() + " ");
        }
    }
}
