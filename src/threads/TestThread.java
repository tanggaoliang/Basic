package threads;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {

        final int threadNumber = 4;
        System.out.println("Running " + threadName);
        try {
            for (int i = threadNumber; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            //noinspection AlibabaAvoidManuallyCreateThread
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

/**
 * @author:tang gao liang
 * @time:2019/3/5 19:35:41
 * @qq:1440535574
 */
public class TestThread {


    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();
    }
}