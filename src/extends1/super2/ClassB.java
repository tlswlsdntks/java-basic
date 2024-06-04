package extends1.super2;

public class ClassB extends ClassA {

    //기본 생성자가 없음

    public ClassB(int a) {
        //super(); //(생략 가능)부모 클래스 기본 생성자
        this(a, 0);
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //(생략 가능)부모 클래스 기본 생성자
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
