/**
 * @author: tang gao liang
 * @time:2019/3/8 18:34:46
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.lang.reflect.Field;

public class ClassTest {
    private static int[] array = new int[3];
    private static int length = array.length;

    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws Exception{
        One oneObject=one.newInstance();
        oneObject.call();

        Another anotherObject= another.newInstance();
        anotherObject.speak();

        Field privateFieldInOne=one.getDeclaredField("inner");
        privateFieldInOne.setAccessible(true);
        privateFieldInOne.set(oneObject,"world changed.");
        System.out.println(oneObject.getInner());


    }


}

class One {
    private String inner = "time files.";

    public void call() {
        System.out.println("hello world.");
    }

    public String getInner() {
        return inner;
    }
}

class Another {
    public void speak() {
        System.out.println("easy coding.");
    }
}
