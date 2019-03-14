/**
 * @author: tang gao liang
 * @time:2019/3/14 11:39:47
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachAndIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        // recommended
        fun1(list);
        // not recommended  , remove the last can cause error
//        fun2(list);

    }

    private static void fun2(List<String> list) {
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }

    private static void fun1(List<String> list) {
        list.removeIf("2"::equals);
        System.out.println(list);
    }

}
