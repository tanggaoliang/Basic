/**
 * @author: tang gao liang
 * @time:2019/3/8 10:42:38
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

public class StoveGeneric {
    public static <T> T heat(T food) {
        System.out.println(food + "is done.");
        return food;
    }

    public static void main(String[] args) {
        Meat meat = new Meat();
        meat = StoveGeneric.heat(meat);
        Soup soup = new Soup();
        soup = StoveGeneric.heat(soup);

    }
}

class Meat {

}

class Soup {

}
