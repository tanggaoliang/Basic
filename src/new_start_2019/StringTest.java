
package new_start_2019;

public class StringTest {
    public static void main(String[] args) {
        String a = "fdsfs";
        String b = "FJSKDLFSKDL";
        String c = "FDJKjkjk";
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(c.toLowerCase());
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        String s = "唐高亮";
        s = s.concat("多帅啊");
        System.out.println(s);

    }
}
