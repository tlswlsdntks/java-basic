package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child → Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent → Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent → Child");
        System.out.println("value = " + poly.value); //value = parent → 클래스 기준
        poly.method(); //Child.method → 오버라이딩 된 메서드는 항상 우선권을 갖는다.

        /**
         * 1. 다형적 참조 : 부모는 자식을 담을 수 있다.
         * 2. 메서드 오버라이딩 : 오버라이딩 된 메서드는 항상 우선권을 갖는다.
         */
    }
}