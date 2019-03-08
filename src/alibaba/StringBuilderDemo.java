/**
 * @author: tang gao liang
 * @time:2019/3/8 16:11:48
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

public class StringBuilderDemo {

//
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i+" ");
        }
        System.out.println(stringBuilder);
    }
}
