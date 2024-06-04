package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스 생성 불가
        //AbstractAnimal abstractAnimal = new AbstractAnimal(); //java: poly.ex3.AbstractAnimal is abstract; cannot be instantiated
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) { //AbstractAnimal
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
