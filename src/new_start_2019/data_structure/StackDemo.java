/*
 * @author:tang gao liang
 * @time:2019/3/5 20:18:45
 * @qq:1440535574
 */
package new_start_2019.data_structure;

import java.util.Stack;

//        栈（Stack）实现了一个后进先出（LIFO）的数据结构。
//        你可以把栈理解为对象的垂直分布的栈，当你添加一个新元素时，就将新元素放在其他元素的顶部。
//        当你从栈中取元素的时候，就从栈顶取一个元素。换句话说，最后进栈的元素最先被取出。

//        栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
//        堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。

//        1	boolean empty()
//        测试堆栈是否为空。
//        2	Object peek( )
//        查看堆栈顶部的对象，但不从堆栈中移除它。
//        3	Object pop( )
//        移除堆栈顶部的对象，并作为此函数的值返回该对象。
//        4	Object push(Object element)
//        把项压入堆栈顶部。
//        5	int search(Object element)
//        返回对象在堆栈中的位置，以 1 为基数。

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("stack: " + stack);
        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        showPop(stack);
        showPop(stack);
        showPop(stack);
    }

    private static void showPop(Stack<Integer> stack) {
        System.out.print("pop->");
        System.out.println(stack.pop());
        System.out.println("stack:"+stack);
    }

    private static void showpush(Stack<Integer> stack, int i) {
        stack.push(i);
        System.out.println("push(" + i + ")");
        System.out.println("stack:" + stack);
    }

}
