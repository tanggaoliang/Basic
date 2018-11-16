public class Person1 {


    private static final String MESSAGE = "taobao";

    public static void main(String[] args) {
        String a = "tao" + "bao";
        String b = "tao";
        String c = "bao";
        String d = b + c;
        System.out.println(a == MESSAGE);
        System.out.println((b + c) == MESSAGE);
        
        System.out.println(d == MESSAGE);
    }

}
