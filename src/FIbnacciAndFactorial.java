public class FIbnacciAndFactorial {

    public static void main(String[] args) {
        System.out.println(fac2(3));

    }

    public static long fac(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        } else {
            return fac(n - 1) + fac(n - 2);
        }

    }

    public static long fac2(int n) {
        long first = 0, last = 1, temp;

        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }
        while (n > 1) {
            temp = first;
            first = last;
            last += temp;
            n--;
        }
        return last;


    }

    public static long Factorial(int n) {
        long result = 1, i = 2;
        if (n == 1) {
            return 1;
        }
        while (i <=n) {
            result *= i;
            i++;
        }
        return result;


    }


}
