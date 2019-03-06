/*
 * @author:tang gao liang
 * @time:2019/3/5 19:01:33
 * @qq:1440535574
 */
package new_start_2019;

import peotectedDemo2.C;

//        多态的优点
//        1. 消除类型之间的耦合关系
//        2. 可替换性
//        3. 可扩充性
//        4. 接口性
//        5. 灵活性
//        6. 简化性
//        多态存在的三个必要条件
//        继承
//        重写
//        父类引用指向子类对象


//        当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
//        多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("eat fish");
    }

    public void work() {
        System.out.println("catch mice");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("eat bones");
    }

    public void work() {
        System.out.println("bark bark");
    }
}

public class polymorphicDemo {
    public static void show(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.work();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.work();
        }
    }

    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Animal animal = new Cat();
        animal.eat();
        Cat cat = new Cat();
        cat.work();
    }

}
