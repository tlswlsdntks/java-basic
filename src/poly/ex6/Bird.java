package poly.ex6;

public class Bird extends AbstractAnimal implements Fly { //상속-단일, 구현-다중
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
