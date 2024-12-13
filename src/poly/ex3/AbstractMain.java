package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스 생성 불가
//        AbstractAnimal abstractAnimal = new AbstractAnimal(); //poly.ex3.AbstractAnimal is abstract; cannot be instantiated
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
