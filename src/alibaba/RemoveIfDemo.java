/**
 * @author: tang gao liang
 * @time:2019/3/14 13:06:52
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;


import java.util.ArrayList;
import java.util.Collection;

/**
 * gender true for man , false for woman
 */
class Person {
    private String name;
    private Integer age;
    private Boolean gender;

    public Person(String name, Integer age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class RemoveIfDemo {
    public static void main(String[] args) {
        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("tang", 22, true));
        collection.add(new Person("gao", 21, false));
        collection.add(new Person("tang", 23, true));
        collection.removeIf(person -> person.getAge()>22);
        System.out.println(collection);
    }
}
