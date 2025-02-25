package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) { //RuntimeException 해결방법
            //parent가 Child에 속하거나 Child를 상속받는 클래스에 속하면 true를 반환
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
