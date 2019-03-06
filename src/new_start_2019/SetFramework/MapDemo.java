/*
 * @author:tang gao liang
 * @time:2019/3/6 13:00:49
 * @qq:1440535574
 */
package new_start_2019.SetFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "tang");
        map.put("2", "gao");
        map.put("3", "liang");

        //1
        System.out.println("keySet and get way");
        for (String key : map.keySet()) {
            System.out.println("key : " + key + " , value :" + map.get(key));
        }

        //2
        System.out.println("Map.entrySet and iterator way");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key : " + entry.getKey() + " , value : " + entry.getValue());
        }

        //3.recommend,especially when the capacity is large
        System.out.println("Map.entrySet traversal  key and value ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key : " + entry.getKey() + " , value : " + entry.getValue());
        }

        //4
        System.out.println("traversal only value by Map.values()");
        for (String s : map.values()) {
            System.out.println("value : " + s);
        }
    }


}
