package WalkWays;

public class Demo {
    public static void main(String[] args) {
        System.out.println(calc(5, 5));
        System.out.println(threeDimensional(5, 5, 5));
        System.out.println(reverseIntHelper(123,0));
    }

    private static int calc(int x, int y) {
        if (x == 0 || y == 0) {
            return 1;
        }
        return calc(x - 1, y) + calc(x, y - 1);


    }

    private static int calc2(int x, int y, int i, int j) {
        if (x == 0 || y == 0) {
            return 1;
        }
        return 0;

    }

    private static long threeDimensional(int x, int y, int z) {
        if (x == 0 || y == 0 || z == 0) {
            return 1;
        }
        return threeDimensional(x - 1, y, z) + threeDimensional(x, y - 1, z) + threeDimensional(x, y, z - 1);


    }
    private static int reverseIntHelper(int i, int init){
        if(i==0) return init;
        return reverseIntHelper(i/10, init*10+i%10);
    }

}
