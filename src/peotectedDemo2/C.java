package peotectedDemo2;

import protectedDemo1.B;

public class C extends B {
   private void test() {
        super.b();
        super.a();
    }
    public static void main(String[] args) {
    C c=new C();
    c.test();



    }
}


