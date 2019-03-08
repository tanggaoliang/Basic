/**
 * @author: tang gao liang
 * @time:2019/3/8 21:22:00
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric {
    public static void main(String[] args) {
        //泛型出现以前的集合定义方式
        List list1 = new ArrayList();
        list1.add(new Object());
        list1.add(new Integer(11));
        list1.add(new String("hello world."));

        //限制了Object
        List<Object> list2 = list1;
        list2.add(new Object());
        list2.add(new Integer(11));
        list2.add("das");
        list2.add(new String("hello world."));

        //增加了Integer限制
        List<Integer> list3 = list1;

        /*没有明确的定义数据类型，不可以写入值，只能进行取值、
        clear、remove操作，取出后全部强转为Object类型。一般
        用来作为参数接受外部的集合，或者返回一个不知道具体类型元素的集合。*/
        List<?> list4 = list1;
    }
}