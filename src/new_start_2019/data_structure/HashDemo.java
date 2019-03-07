/*
 * @author:tang gao liang
 * @time:2019/3/5 21:33:33
 * @qq:1440535574
 */
package new_start_2019.data_structure;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

//定义人这个类，设定一个编号
class Person {
    private int cardId;

    public Person(int cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Person#" + cardId;  //返回编号
    }
//    这个程序看起来简单，但却在结果上出现了错误。原因在于Person默认继承于Object类，所以使用了Object类的hashCode()方法来生成散列码（根据地址并通过一定的算法产生）。明显，第一次创建的和第二次创建的Person#3地址不同，散列码是不同的，因此无法找到此人。所以，我们要以正确地形式实现hashCode()方法。当然，在覆盖hashCode()方法时，也要覆盖equals()方法，因为这个方法也来自Object类，也需要以正确地方式实现。
//    这里提到equals()方法时，我们必须要注意以下几点：
//    1）自反性 对于任意x, x.equals(x)必定返回true。
//    2）对称性 对于任意x,y，x.equals(y)与y.equals(x)的返回值相同。
//    3）传递性 对于任意x,y,z，如果x.equals(y)与y.equals(z)返回值相同，那么x.equals(z)返回值也相同。
//    4）一致性 对于任意的x,y，无论x.equals(y)执行多少次，返回值要么是true，要么为false。
//    5）对于任意x != null, x.equals(null)返回false。

//    必须覆盖hashCode和equal方法
    @Override
    public int hashCode() {
        return cardId;  //把唯一的编号作为散列码
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Person && (((Person) obj).cardId == cardId));

    }
}

//人的性别
class Sex {
    private int i = (int) (Math.random() * 2);

    @Override
    public String toString() {
        return i == 0 ? "male" : "female";  //随机返回一个性别
    }
}

public class HashDemo {
    public static void main(String[] args) throws Exception {
        detectSex(Person.class);
    }

    public static <T extends Person> void detectSex(Class<T> type) throws Exception {
        Constructor<T> person = type.getConstructor(int.class);
        Map<Person, Sex> map = new HashMap<>();  //创建一个HashMap用于存放人和性别的键值对
        for (int i = 0; i < 10; i++) {
            map.put(person.newInstance(i), new Sex());
        }
        System.out.println("map:" + map);
        Person p = person.newInstance(3);  //创建一个编号为3的人，并在map中查找此人性别
        System.out.println("查找某人性别" + p);
        if (map.containsKey(p)) {
            System.out.println(map.get(p));
        } else {
            System.out.println("无此人");
        }
    }
}
