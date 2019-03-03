class A {
    private int aa;
    int fdsa=90;
    void a() {
        System.out.println("fds");
    }


}

class B extends A {
    void b() {
//        System.out.println("fed");
    }
}

class C extends A {
    void c() {
//        System.out.println("jfkdljfskdl");
    }
}

public class InstanceDemo {


    public static void main(String[] args) {


        B b = new B();
        A a = new A();
        A ba = new B();
        ba.a();
        A ca = new C();
        //B ca2 = (B) ca; 兄弟之间不能转化
       // ca2.b();
        ba.a();
        ((B) ba).b();
        //多态,父类强制转化为子类来使用子类方法
        A b1 = ba;
        System.out.println(b1);

//        B ab=new Father1(); 报错
        System.out.println("1------------");
        System.out.println(b instanceof B);
        System.out.println(b instanceof A);
        System.out.println(b instanceof Object);
        System.out.println(null instanceof Object);
        System.out.println("2------------");
        System.out.println(b.getClass().isInstance(b));
        System.out.println(b.getClass().isInstance(a));
        System.out.println(a.getClass().isInstance(b));
        System.out.println("3------------");
        System.out.println(a.getClass().isInstance(ba));
        System.out.println(b.getClass().isInstance(ba));
        System.out.println(b.getClass().isInstance(null));
        System.out.println("4------------");
        System.out.println(A.class.isInstance(a));
        System.out.println(A.class.isInstance(b));
        System.out.println(A.class.isInstance(ba));
        System.out.println("5------------");
        System.out.println(B.class.isInstance(a));
        System.out.println(B.class.isInstance(b));
        System.out.println(B.class.isInstance(ba));
        System.out.println("6------------");
        System.out.println(Object.class.isInstance(b));
        System.out.println(Object.class.isInstance(null));
        System.out.println("7------------");
        System.out.println(Object.class.isInstance(b));
        System.out.println(Object.class.isInstance(null));
    }
}