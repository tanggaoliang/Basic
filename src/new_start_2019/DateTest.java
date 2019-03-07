/*
 * @author:tang gao liang
 * @time:2019/3/4 16:10:49
 * @qq:1440535574
 */
package new_start_2019;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        String a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        System.out.println(a);
        long end=System.currentTimeMillis();
        System.out.println("the time has passed "+(end-start)+" 微秒");
    }

}
