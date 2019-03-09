/**
 * @author: tang gao liang
 * @time:2019/3/9 11:10:11
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListFailFstDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (String s:list){
            if("2".equals(s)){
                //ok
                list.remove(s);
            }
        }
        System.out.println(list);
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            synchronized(list){
                String item=iterator.next();
                if("3".equals(item)){
                    iterator.remove();
                }
            }
        }
        System.out.println(list);
    }
}
