package poly.ex4;

public class Cat extends AbstractAnimal {
    //Class 'Cat' must either be declared abstract or implement abstract method 'sound()' in 'AbstractAnimal'
    @Override
    public void sound() {
        System.out.println("냐옹"); //추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해서 사용해야 한다.
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
