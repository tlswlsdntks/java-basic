package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //Animal[] animalArr = new Animal[3];
        //animalArr[0] = dog;
        //animalArr[1] = cat;
        //animalArr[2] = caw;
        //Animal[] animalArr = new Animal[]{dog, cat, caw};
        Animal[] animalArr = {dog, cat, caw};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

}
