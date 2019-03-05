/*
 * @author:tang gao liang
 * @time:2019/3/5 21:48:02
 * @qq:1440535574
 */
package new_start_2019.data_structure;

//        Properties 继承于 Hashtable.Properties 类表示了一个持久的属性集.属性列表中每个键及其对应值都是一个字符串。
//        Properties 类被许多Java类使用。例如，在获取环境变量时它就作为System.getProperties()方法的返回值。

//        序号	方法描述
//        1	String getProperty(String key)
//        用指定的键在此属性列表中搜索属性。
//        2	String getProperty(String key, String defaultProperty)
//        用指定的键在属性列表中搜索属性。
//        3	void list(PrintStream streamOut)
//        将属性列表输出到指定的输出流。
//        4	void list(PrintWriter streamOut)
//        将属性列表输出到指定的输出流。
//        5	void load(InputStream streamIn) throws IOException
//        从输入流中读取属性列表（键和元素对）。
//        6	Enumeration propertyNames( )
//        按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
//        7	Object setProperty(String key, String value)
//        调用 Hashtable 的方法 put。
//        8	void store(OutputStream streamOut, String description)
//        以适合使用  load(InputStream)方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // Show all states and capitals in hashtable.
        states = capitals.keySet(); // get set-view of keys
        Iterator itr = states.iterator();
        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " +
                    str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();

        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is "
                + str + ".");
    }
}
