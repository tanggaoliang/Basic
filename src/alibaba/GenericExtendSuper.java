/**
 * @author: tang gao liang
 * @time:2019/3/8 21:51:14
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
package alibaba;

import java.util.ArrayList;
import java.util.List;

/**
 * 巧记忆:extend和super可以记忆为儿子和父亲的关系
 * 儿子只可以从父亲那里索取
 * 父亲只能一直对儿子付出
 * @author: tang gao liang
 */
public class GenericExtendSuper {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        List<Cat> cats = new ArrayList<Cat>();
        List<Garfield> garfields = new ArrayList<Garfield>();

        animals.add(new Animal());
        cats.add(new Cat());
        garfields.add(new Garfield());
//error
        List<? extends Cat> extendsCatFromAnimal = cats;
        List<? extends Cat> extendsCatFromAnimal2 = garfields;
        List<? super Cat> superCatFromAnimal = animals;
        //extends 无法add
//        extendsCatFromAnimal.add(new Garfield());
        superCatFromAnimal.add(new Cat());

        Object catExtends2 = extendsCatFromAnimal.get(0);
        //super不可以使用get方法
//        Cat catExtends3=superCatFromAnimal.get(0);

    }
}

class Animal {
}

class Cat extends Animal {
}

class Garfield extends Cat {
}

class Plant {
}
