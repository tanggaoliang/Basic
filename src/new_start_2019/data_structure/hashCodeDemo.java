/*
 * @author:tang gao liang
 * @time:2019/3/5 21:42:40
 * @qq:1440535574
 */
package new_start_2019.data_structure;

public class hashCodeDemo {
    public static void main(String[] args) {
        String a="tang";
        String b="tang";
        String c=new String ("tang");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
