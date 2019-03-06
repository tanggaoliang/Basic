/*
 * @author:tang gao liang
 * @time:2019/3/6 15:17:45
 * @qq:1440535574
 */
package new_start_2019.generics;
//类型通配符


import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void getData(List<?> data) {
        System.out.println("data : " + data.get(0));
    }

    public static void getUpperNumber(List<? extends Number> numbers) {
        System.out.println("data : " + numbers.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("tang");
        age.add(21);
        number.add(1440535574);
        getData(name);
        getData(age);
        getData(number);

//        getUpperNumber(name);
        getUpperNumber(age);
        getUpperNumber(number);
    }
}
