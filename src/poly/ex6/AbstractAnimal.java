package poly.ex6;

public abstract class AbstractAnimal {
    /**
     * 1. 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
     * 2. 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
     */
    public abstract void sound();
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
