import protectedDemo1.D;

import java.util.List;


public class demo {
    public static void main(String[] args) {
        Integer s = new Integer(9);
        Integer t = new Integer(9);
        int a=9;
        Long u = new Long(9);
        System.out.println(s==a);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y.setLength(0);
        y.append(x);
    }
}