/**
 * @author: tang gao liang
 * @time:2019/3/7 21:57:32
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

public class ParamPasssing {
    private static int intStatic = 111;
    private static String stringStatic = "old string";
    private static StringBuilder stringBuilderStatic
            = new StringBuilder("old stringBuilder");

    public static void main(String[] args) {
        method(intStatic);
        method(stringStatic);
        method(stringBuilderStatic, stringBuilderStatic);

        System.out.println(intStatic);
        method();
        System.out.println(intStatic + "\n" + stringBuilderStatic + "\n" + stringBuilderStatic);
    }

    private static void method(StringBuilder stringBuilderStatic1,
                               StringBuilder stringBuilderStatic2) {
        stringBuilderStatic1.append("1");
        stringBuilderStatic2.append("2");
        stringBuilderStatic1 = new StringBuilder("new StringBuilder");
        stringBuilderStatic1.append("3");
        System.out.println("in method stringBuilderStatic : "+stringBuilderStatic1);


    }

    private static void method(int intStatic) {
        intStatic = 222;
    }

    private static void method() {
        intStatic = 333;

    }

    private static void method(String stringStatic) {
        stringStatic = "new string";
    }


}
