package EnumDemo;

public class EnumDemo {


    public static void main(String[] args) {
        FreshJuice a = new FreshJuice();
        a.size = FreshJuice.FreshJuiceSize.LARGE;
    }
}

class FreshJuice {

    enum FreshJuiceSize {
        //small cup ,medium cup ,large cump
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}