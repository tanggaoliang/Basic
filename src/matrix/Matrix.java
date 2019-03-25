/**
 * @author: tang gao liang
 * @time:2019/3/23 14:37:21
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        int[][] b = {{1, 2, 1}, {1, 1, 2}, {2, 1, 1}};

        myprint(function(a, b));
    }

    private static void myprint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }

    private static int[][] function(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = calculate(i, j, a, b);
            }
        }
        return c;
    }

    private static int calculate(int i, int j, int[][] a, int[][] b) {
        int result = 0;
        for (int k = 0; k < a[0].length; k++) {
            result += a[i][k] * b[k][j];
        }
        return result;

    }


}
