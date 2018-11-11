package protectedDemo1;

public class A {
    protected void a() {
        System.out.println("i am A");

    }
        public static void main(String[] args) throws CloneNotSupportedException {
            A a=new A();
            a.clone();
        }



}
