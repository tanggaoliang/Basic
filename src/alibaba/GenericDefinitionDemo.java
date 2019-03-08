/**
 * @author: tang gao liang
 * @time:2019/3/8 10:31:16
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

public class GenericDefinitionDemo<T> {
    static <String, T, Alibaba> String get(String string, Alibaba alibaba) {
        return string;
    }

    public static void main(String[] args) {
        Integer integer = 222;
        Long long1=333L;
        Integer result=get(integer,long1);
        System.out.println(result);
    }


}
