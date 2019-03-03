package new_start_2019;

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
