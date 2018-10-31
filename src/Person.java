public class Person {
    public int id;
    public String name;
    public int age;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
            Person p=new Person(1,"tang",21);
            System.out.println(p);
    }

}
