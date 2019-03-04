package new_start_2019;

public class byteTest {
    public static void main(String[] args) {
        int i = 129;
        // 010000 0000
        //1000 0000
        //1111 1111
        //1000 0000
        byte b = (byte) i;
        System.out.println(b);
    }
}
