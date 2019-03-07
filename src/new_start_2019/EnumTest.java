package new_start_2019;

class FreshJuice {


    enum FreshJuiceSize {
        /**
         * small cup
         * medium cup
         * large cup
         */
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}

public class EnumTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(juice.size);
    }

}
// strictfp 严格的
// synchronized 同步的
// transient 短暂的
// volatile 易失的
// instanceof 实例
// assert 断言为真
// throw 抛出异常
// throws 抛出异常声明
