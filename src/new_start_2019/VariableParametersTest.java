/*
 * @author:tang gao liang
 * @time:2019/3/4 19:03:15
 * @qq:1440535574
 */
package new_start_2019;

public class VariableParametersTest {
    public static void main(String[] args) {
        VariableParametersTest a = new VariableParametersTest();
        double [] b={12,45,32,20,1};
        a.printMax(b);
    }

    public void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("no argument!");
        } else {
            double result = numbers[0];
            for (double x : numbers) {
                if (x > result) {
                    result = x;
                }
            }
            System.out.println("the max value is " + result);

        }
    }

}
