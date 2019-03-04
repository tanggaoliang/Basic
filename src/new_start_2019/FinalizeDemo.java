/*
 * @author:tang gao liang
 * @time:2019/3/4 19:08:20
 * @qq:1440535574
 */
package new_start_2019;

public class FinalizeDemo {
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);
        c2 = c3 = null;
        System.gc();
        //调用Java垃圾收集器

    }
}

class Cake extends Object {
    private int id;

    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + " is created.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake object " + id + " is disposed");
    }
}
