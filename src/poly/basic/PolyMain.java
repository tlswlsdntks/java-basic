package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent → Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child → Parent");
        Child child = new Child();
        child.parentMethod();

        //부모 변수가 자식 인스턴스 참조
        System.out.println("Parent → Child");
        //부모는 자식을 담을 수 있다.
        Parent poly = new Child();
        poly.parentMethod();
        //poly.childMethod(); //cannot find symbol

        //자식은 부모를 담을 수 없다.
        //Child poly = new Parent();
    }
}
