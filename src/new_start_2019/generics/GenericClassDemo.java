/*
 * @author:tang gao liang
 * @time:2019/3/6 15:12:38
 * @qq:1440535574
 */
package new_start_2019.generics;

public class GenericClassDemo<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClassDemo integerDemo=new GenericClassDemo();
        GenericClassDemo stringDemo=new GenericClassDemo();
        integerDemo.setT(10);
        System.out.println(integerDemo.getT());
        stringDemo.setT("tanggl");
        System.out.println(stringDemo.getT());


    }
}
