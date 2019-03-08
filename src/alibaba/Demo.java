/**
 * @author: tang gao liang
 * @time:2019/3/7 22:49:07
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

public class Demo {
    private int a;


    public int getA() {
        return a;
    }

    public void setA(int b) {
        a = b;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setA(2);
        Demo demo1=new Demo();
        demo1.setA(3);
        System.out.println(demo.a);
        System.out.println(demo1.a);


    }
}
