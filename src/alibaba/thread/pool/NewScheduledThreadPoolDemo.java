/**
 * @author: tang gao liang
 * @time:2019/3/9 18:59:45
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class NewScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(() -> System.out.println("delay 3 seconds"), 3, TimeUnit.SECONDS);
    }
}

