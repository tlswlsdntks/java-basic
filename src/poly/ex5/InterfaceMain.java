package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); //poly.ex5.InterfaceAnimal is abstract; cannot be instantiated
        System.out.println(InterfaceAnimal.MY_PI);
        InterfaceAnimal[] animals = {new Dog(), new Cat(), new Caw()};
        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}