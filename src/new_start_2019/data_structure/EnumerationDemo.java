/*
 * @author:tang gao liang
 * @time:2019/3/5 19:27:21
 * @qq:1440535574
 */
package new_start_2019.data_structure;
//        枚举（Enumeration）接口虽然它本身不属于数据结构,但它在其他数据结构的范畴里应用很广。 枚举（The Enumeration）接口定义了一种从数据结构中取回连续元素的方式。
//        例如，枚举定义了一个叫nextElement 的方法，该方法用来得到一个包含多元素的数据结构的下一个元素。

//        1boolean hasMoreElements()
//        测试此枚举是否包含更多的元素。
//        2Object nextElement()
//        如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。

//         vector 向量

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days=dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

    }

}
