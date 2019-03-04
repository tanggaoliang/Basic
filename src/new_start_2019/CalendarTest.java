/*
 * @author:tang gao liang
 * @time:2019/3/4 16:20:42
 * @qq:1440535574
 */
package new_start_2019;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2009, 6 - 1, 12);
        System.out.println(c.get(Calendar.YEAR)+" "+(c.get(2)+1)+" "+c.get(Calendar.DATE));
    }
}
