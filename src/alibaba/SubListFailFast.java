/**
 * @author: tang gao liang
 * @time:2019/3/9 10:57:58
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.ArrayList;
import java.util.List;

public class SubListFailFast {
    public static void main(String[] args) {
        List masterList = new ArrayList();
        masterList.add("1");
        masterList.add("2");
        masterList.add("3");
        masterList.add("4");
        masterList.add("5");

        List branchList = masterList.subList(0, 3);
        System.out.println(masterList);

//        if the branch has function , the following three line can cause mistake ConcurrentModificationException
//        masterList.remove(0);
//        masterList.add("ten");
//        System.out.println(masterList);
//        masterList.clear();


//        branchList.clear();
//        branchList.add("6");
//        branchList.add("7");
//        System.out.println(branchList);

    }
}
