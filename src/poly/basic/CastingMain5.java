package poly.basic;

public class CastingMain5 {
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
        if (parent instanceof Child) { //RuntimeException 해결방법
            //parent1: Child = new Parent(); → 자식은 부모를 담을 수 없다.
            //parent2: Child = new Child();
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent).childMethod();
        }
    }
}
