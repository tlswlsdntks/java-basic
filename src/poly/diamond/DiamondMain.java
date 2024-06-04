package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA interfaceA = new Child(); //부모는 자식을 담을 수 있다.
        interfaceA.methodA(); //메소드 오버라이딩
        interfaceA.methodCommon(); //메소드 오버라이딩

        InterfaceB interfaceB = new Child();
        interfaceB.methodB();
        interfaceB.methodCommon();
    }
}
