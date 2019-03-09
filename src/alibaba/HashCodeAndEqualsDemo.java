/**
 * @author: tang gao liang
 * @time:2019/3/9 10:27:25
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEqualsDemo {
    private int id;
    private String name;

    public HashCodeAndEqualsDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        HashCodeAndEqualsDemo temp1 = new HashCodeAndEqualsDemo(1, "a");
        HashCodeAndEqualsDemo temp2 = new HashCodeAndEqualsDemo(1, "a");
        HashCodeAndEqualsDemo temp3 = new HashCodeAndEqualsDemo(2, "a");
        HashCodeAndEqualsDemo temp4 = new HashCodeAndEqualsDemo(1, "b");
        HashCodeAndEqualsDemo temp5 = new HashCodeAndEqualsDemo(2, "b");
        System.out.println(temp1.equals(temp2));
        System.out.println(temp1.equals(temp3));
        System.out.println(temp1.equals(temp4));
        System.out.println(temp1.equals(temp5));
        System.out.println(temp1 == temp2);
        Set<HashCodeAndEqualsDemo> hashSet=new HashSet<>();
        hashSet.add(temp1);
        hashSet.add(temp2);
        hashSet.add(temp3);
        hashSet.add(temp4);
        hashSet.add(temp5);
        System.out.println(hashSet.size());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) return true;
        HashCodeAndEqualsDemo temp = (HashCodeAndEqualsDemo) obj;
        if (id == temp.getId() && name.equals(temp.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
