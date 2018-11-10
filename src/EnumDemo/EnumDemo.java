package EnumDemo;

public class EnumDemo {


    public static void main(String[] args) {
        FreshJuice a=new FreshJuice()  ;
        a.size= FreshJuice.FreshJuiceSize.LARGE;
    }
}

class FreshJuice {

    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}