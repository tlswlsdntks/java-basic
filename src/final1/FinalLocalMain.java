package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //variable data1 might already have been assigned

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20;

        method(10);
    }

    static void method(final int parameter) {
        //parameter = 20; //final parameter parameter may not be assigned
    }
}
