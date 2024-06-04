package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

        //Animal 클래스를 생성할 수 있는 문제
        Animal animal = new Animal();
        animal.sound(); //동물 울음 소리

        //Animal 클래스를 상속 받는 곳에서 메서드 오버라이딩을 하지 않을 가능성 문제
        Pig pig = new Pig();
        pig.sound(); //동물 울음 소리

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
