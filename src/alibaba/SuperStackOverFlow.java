/**
 * @author: tang gao liang
 * @time:2019/3/8 9:59:51
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

public class SuperStackOverFlow {
    protected void fun() {
        this.fun();
    }

    public static void main(String[] args) {
        SuperStackOverFlow superStackOverFlow = new Son();
        superStackOverFlow.fun();
    }
}

class Son extends SuperStackOverFlow {
    @Override
    protected void fun() {
//    此处与上面的this形成循环调用形成死循环导致堆溢出
        super.fun();
    }
}
