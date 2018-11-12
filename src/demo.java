import protectedDemo1.D;

import java.util.List;


public class demo {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y.setLength(0);
        y.append(x);
    }
}