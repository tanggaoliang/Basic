package new_start_2019;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("唐");
        sb.append("高");
        sb.append("亮");
        sb.insert(1,32);
        sb.replace(3,4,"8");
        System.out.println(sb);
        //由于 StringBuilder 相较于 StringBuffer 有速度优势，
        // 所以多数情况下建议使用 StringBuilder 类。
        // 然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
    }
}
