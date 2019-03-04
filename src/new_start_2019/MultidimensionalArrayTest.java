/*
 * @author:tang gao liang
 * @time:2019/3/4 15:54:46
 * @qq:1440535574
 */
package new_start_2019;

import java.util.Arrays;

public class MultidimensionalArrayTest {
    public static void main(String[] args) {
        String s[][] = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        //打印二维数组的通法
        for (String a[] : s) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        String b[] = new String[10];
        Arrays.fill(b, "2");
        System.out.println(Arrays.toString(b));
    }
}
