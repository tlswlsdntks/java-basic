package poly.ex5;

public interface InterfaceAnimal {
    double MY_PI = 3.14; //인터페이스의 멤버변수는 모두 "public static final" 이 포함되었다고 간주한다.

    public abstract void sound();

    void move(); //인터페이스의 메서드는 모두 "public abstract" 을 생략할 수 있다.

//    public void hello(){System.out.println("안녕하세요. 동물입니다.");} //제약
}
