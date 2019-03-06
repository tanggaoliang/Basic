/*
 * @author:tang gao liang
 * @time:2019/3/6 12:54:54
 * @qq:1440535574
 */
package new_start_2019.SetFramework;
//          Set和List的区别
//        1. Set 接口实例存储的是无序的，不重复的数据。List 接口实例存储的是有序的，可以重复的元素。
//        2. Set检索效率低下，删除和插入效率高，插入和删除不会引起元素位置改变 <实现类有HashSet,TreeSet>。
//        3. List和数组类似，可以动态增长，根据实际存储的数据的长度自动增长List的长度。查找元素效率高，插入删除效率低，因为会引起其他元素位置改变 <实现类有ArrayList,LinkedList,Vector> 。

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("tang");
        list.add("gao");
        list.add("liang");
//      1.
        for(String string:list){
            System.out.println(string);
        }
//      2.
        String[] strings=new String [list.size()];
        list.toArray(strings);
        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
//      3.
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
