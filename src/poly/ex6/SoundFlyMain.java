package poly.ex6;

import java.text.Bidi;

public class SoundFlyMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Bird(), new Chicken()};
        for (AbstractAnimal animal : animals) {
            animal.move();
            soundAnimal(animal);
            if (animal instanceof Fly flyAnimal) {
                flyAnimal(flyAnimal);
            }
        }
    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) { //부모A
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //Fly 인터페이스를 구현하면 사용 가능
    private static void flyAnimal(Fly fly) { //부모B
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }

}
