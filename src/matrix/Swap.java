/**
 * @author: tang gao liang
 * @time:2019/3/23 15:12:29
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package matrix;

public class Swap {
    public static void main(String[] args) {
        int[] a = {1, 2, 0};
        int[] b = new int[3];
        b = function(a);
        myprint(b);
    }

    private static void myprint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

    private static int[] function(int[] a) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[a[i]] = i;
        }
        return c;
    }

}
