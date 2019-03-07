package new_start_2019;
//volatile作为java中的关键词之一，用以声明变量的值可能随时会别的线程修改，
// 使用volatile修饰的变量会强制将修改的值立即写入主存，主存中值的更新会使缓存中的值失效(非volatile变量不具备这样的特性，
// 非volatile变量的值会被缓存，线程A更新了这个值，线程B读取这个变量的值时可能读到的并不是是线程A更新后的值)。volatile会禁止指令重排。

public class VolatileTest {
    private volatile boolean active;

    public void run() {
        active = true;
        while (active) {
            //
        }
    }

    public void stop() {
        active = false;
    }
}
