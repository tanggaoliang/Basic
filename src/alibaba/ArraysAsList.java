/**
 * @author: tang gao liang
 * @time:2019/3/8 20:50:59
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        //字符串数组转集合
        List<String> stringList = new ArrayList<String>(Arrays.asList(stringArray));
        stringList.set(0, "oneList");
        System.out.println(stringArray[0]);
        stringList.add("four");
        System.out.println(stringList.get(2));
        String [] array1=new String[stringList.size()];
        //集合转字符串数组
        stringList.toArray(array1);
        System.out.println(Arrays.toString(array1));


    }
}
