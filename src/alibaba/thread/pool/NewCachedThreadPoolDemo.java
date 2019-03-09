/**
 * @author: tang gao liang
 * @time:2019/3/9 18:30:51
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba.thread.pool;

import java.util.concurrent.*;


public class NewCachedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(() -> System.out.println(index));
        }

    }
}






