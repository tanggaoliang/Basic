/**
 * @author: tang gao liang
 * @time:2019/3/9 16:44:31
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class AtomicIntegerDemo {
    public static AtomicInteger num = new AtomicInteger(0);

    static CountDownLatch countDownLatch = new CountDownLatch(30);

    public static void main(String[] args) throws InterruptedException {
        //开启30个线程进行累加操作
        for (int i = 0; i < 30; i++) {
            new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        num.incrementAndGet();//原子性的num++,通过循环CAS方式
                    }
                    countDownLatch.countDown();
                }
            }.start();
        }
        //等待计算线程执行完
        countDownLatch.await();
        System.out.println(num);
    }
}